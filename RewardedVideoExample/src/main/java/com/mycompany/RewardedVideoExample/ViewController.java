package com.mycompany.RewardedVideoExample;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSDate;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSTimer;
import org.robovm.apple.uikit.*;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.objc.annotation.IBAction;
import org.robovm.objc.annotation.IBOutlet;
import org.robovm.pods.google.GADAdReward;
import org.robovm.pods.google.GADRequest;
import org.robovm.pods.google.GADRewardBasedVideoAd;
import org.robovm.pods.google.GADRewardBasedVideoAdDelegate;

@CustomClass("ViewController")
public class ViewController extends UIViewController implements GADRewardBasedVideoAdDelegate, UIAlertViewDelegate {

    @IBOutlet
    UILabel gameLabel;

    /// The play again button.
    @IBOutlet
    UIButton playAgainButton;

    /// The button to show rewarded video.
    @IBOutlet
    UIButton showVideoButton;

    /// The text indicating current coin count.
    @IBOutlet
    UILabel coinCountLabel;

    /// Constant for coin rewards.
    static final int GameOverReward = 1;

    /// Starting time for game counter.
    static final int GameLength = 10;

    private enum GameState {
        NotStarted,  ///< Game has not started.
        Playing,     ///< Game is playing.
        Paused,      ///< Game is paused.
        Ended,        ///< Game has ended.
    }


    private int coinCount;

    private NSTimer timer;

    /// The game counter.
    private int counter;

    /// The state of the game.
    private GameState gameState;

    /// The date that the timer was paused.
    private NSDate pauseDate;

    /// The last fire date before a pause.
    private NSDate previousFireDate;


    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        // Do any additional setup after loading the view.
        GADRewardBasedVideoAd.sharedInstance().setDelegate(this);
        this.coinCount = 0;
        this.startNewGame();
    }

    @Override
    public void viewWillAppear(boolean animated) {
        super.viewWillAppear(animated);
        this.resumeGame();
    }

    @Override
    public void viewWillDisappear(boolean animated) {
        super.viewWillDisappear(animated);
        this.pauseGame();
    }


    //  Game logic

    private void startNewGame() {
        if (!GADRewardBasedVideoAd.sharedInstance().isReady()) {
            this.requestRewardedVideo();
        }
        this.gameState = GameState.Playing;
        this.playAgainButton.setHidden(true);
        this.showVideoButton.setHidden(true);
        this.counter = GameLength;
        this.gameLabel.setText(Long.toString(this.counter));
        this.setTimer(new NSTimer(1.0, (t) -> decrementCounter(t), null, true, true));
        this.timer.setTolerance(GameLength * 0.1);
    }

    private void requestRewardedVideo() {
        GADRequest request = new GADRequest();
        GADRewardBasedVideoAd.sharedInstance().loadRequest(request, "ca-app-pub-3940256099942544/1712485313");
    }

    /// Pauses the game.
    public void pauseGame() {
        if (this.gameState != GameState.Playing) {
            return;
        }
        this.gameState = GameState.Paused;

        // Record the relevant pause times.
        this.pauseDate = new NSDate();
        this.previousFireDate = this.timer.getFireDate();

        // Prevent the timer from firing while app is in background.
        this.timer.setFireDate(NSDate.getDistantFuture());
    }

    /// Resumes the game.
    public void resumeGame() {
        if (this.gameState != GameState.Paused) {
            return;
        }
        this.gameState = GameState.Playing;

        // Calculate amount of time the app was paused.
        double pauseDuration = this.pauseDate.getTimeIntervalSinceNow();

        // Set the timer to start firing again.
        this.timer.setFireDate(this.previousFireDate.newDateByAddingTimeInterval(-pauseDuration));
    }

    public void setTimer(NSTimer timer) {
        if (this.timer != null)
            this.timer.invalidate();
        this.timer = timer;
    }

    private void decrementCounter(NSTimer t) {
        this.counter--;
        if (this.counter > 0) {
            this.gameLabel.setText(Long.toString(this.counter));
        } else {
            this.endGame();
        }
    }

    private void earnCoins(int coins) {
        this.coinCount += coins;
        this.coinCountLabel.setText("Coins: " + this.coinCount);
    }

    private void endGame() {
        this.setTimer(null);
        this.gameState = GameState.Ended;
        this.gameLabel.setText("Game over!");
        if (GADRewardBasedVideoAd.sharedInstance().isReady()) {
            this.showVideoButton.setHidden(false);
        }
        this.playAgainButton.setHidden(false);
        // Reward user with coins for finishing the game.
        this.earnCoins(GameOverReward);
    }

    /// Restarts the game.
    public @IBAction
    void playAgain(UIControl c) {
        this.startNewGame();

    }

    /// Shows a rewarded video.
    public @IBAction
    void showVideo(UIControl c) {
        if (GADRewardBasedVideoAd.sharedInstance().isReady()) {
            GADRewardBasedVideoAd.sharedInstance().presentFromRootViewController(this);
        } else {

            (new UIAlertView("Interstitial not ready", "The interstitial didn't finish loading or failed to load",
            this, "Drat")).show();
        }
    }

    /// UIAlertViewDelegate implementation

    @Override
    public void clicked(UIAlertView alertView, long buttonIndex) {}

    @Override
    public void cancel(UIAlertView alertView) {}

    @Override
    public void willPresent(UIAlertView alertView) {}

    @Override
    public void didPresent(UIAlertView alertView) {}

    @Override
    public void willDismiss(UIAlertView alertView, long buttonIndex) {
        this.startNewGame();
    }

    @Override
    public void didDismiss(UIAlertView alertView, long buttonIndex) {}

    @Override
    public boolean shouldEnableFirstOtherButton(UIAlertView alertView) {return false;}



    /// GADRewardBasedVideoAdDelegate implementation

    @Override
    public void didRewardUser(GADRewardBasedVideoAd rewardBasedVideoAd, GADAdReward reward) {
        String  rewardMessage = "Reward received with currency " + reward.getType()  + ", amount " + reward.getAmount();
        System.out.println(rewardMessage);
        // Reward the user for watching the video.
        this.earnCoins(reward.getAmount().intValue());
        this.showVideoButton.setHidden(true);
    }

    @Override
    public void didFailToLoad(GADRewardBasedVideoAd rewardBasedVideoAd, NSError error) {
        System.out.println("Reward based video ad is failed to load " + error);
    }

    @Override
    public void rewardBasedVideoAdDidReceiveAd(GADRewardBasedVideoAd rewardBasedVideoAd) {
        System.out.println("Reward based video ad is received.");
    }

    @Override
    public void rewardBasedVideoAdDidOpen(GADRewardBasedVideoAd rewardBasedVideoAd) {
        System.out.println("Opened reward based video ad.");
    }

    @Override
    public void rewardBasedVideoAdDidStartPlaying(GADRewardBasedVideoAd rewardBasedVideoAd) {
        System.out.println("Reward based video ad started playing.");
    }

    @Override
    public void rewardBasedVideoAdDidClose(GADRewardBasedVideoAd rewardBasedVideoAd) {
        System.out.println("Reward based video ad is closed.");
        this.showVideoButton.setHidden(true);
    }

    @Override
    public void rewardBasedVideoAdWillLeaveApplication(GADRewardBasedVideoAd rewardBasedVideoAd) {
        System.out.println("");
    }
}

package com.mycompany.myapp;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.uikit.*;
import org.robovm.pods.lgp.UIViewControllerExtensions;

public class MyViewController extends UIViewController {
    private final UIButton leftBtn;
    private final UIButton rightBtn;
    private final UILabel label;
    private int clickCount;

    public MyViewController(String title, UIColor color) {
        // Get the view of this view controller.
        UIView view = getView();

        // Setup background.
        view.setBackgroundColor(color);

        // Setup label.
        label = new UILabel(new CGRect(20, 250, 280, 44));
        label.setFont(UIFont.getSystemFont(24));
        label.setTextAlignment(NSTextAlignment.Center);
        view.addSubview(label);

        if (title == null) {
            title = "root";

            // Setup buttons.
            leftBtn = new UIButton(UIButtonType.RoundedRect);
            leftBtn.setFrame(new CGRect(50, 150, 100, 40));
            leftBtn.setTitle("Left", UIControlState.Normal);
            leftBtn.getTitleLabel().setFont(UIFont.getBoldSystemFont(22));
            leftBtn.addOnTouchUpInsideListener((control, event) -> UIViewControllerExtensions.showLeftView(this, null));
            view.addSubview(leftBtn);

            rightBtn = new UIButton(UIButtonType.RoundedRect);
            rightBtn.setFrame(new CGRect(210, 150, 100, 40));
            rightBtn.setTitle("Right", UIControlState.Normal);
            rightBtn.getTitleLabel().setFont(UIFont.getBoldSystemFont(22));
            rightBtn.addOnTouchUpInsideListener((control, event) -> UIViewControllerExtensions.showRightView(this, null));
            view.addSubview(rightBtn);
        } else {
            leftBtn = null;
            rightBtn = null;
        }
        label.setText(title);
    }
}

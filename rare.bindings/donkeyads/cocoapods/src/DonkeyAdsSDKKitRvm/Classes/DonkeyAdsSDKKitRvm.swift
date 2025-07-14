
import Foundation
import DonkeyAdsSDKKit

import AVKit
import BackgroundTasks
import CommonCrypto
import CryptoKit
import Foundation
import Network
import SwiftUI
import UIKit
import _Concurrency
import _StringProcessing
import _SwiftConcurrencyShims

@objc(AdAssetRvm) public class AdAssetRvm : NSObject {
    var raw: AdAsset
    init(raw: AdAsset) { self.raw = raw }
    
    @objc public var id : String { raw.id }

    @objc public var type : AdAssetRvm.AssetTypeRvm { raw.type.toRvm() }

    @objc public var url : URL { raw.url }

    @objc public var link : URL? { raw.link }

    @objc public var width : Int { raw.width }

    @objc public var height : Int { raw.height }

    @objc public var closeTimeout : Int { raw.closeTimeout }

    @objc public var filesizeBytes : Int64 { raw.filesizeBytes }

    @objc public var wifiOnly : Bool { raw.wifiOnly }

    @objc public var name : String? { raw.name }

    @objc public var viewThroughLink : String? { raw.viewThroughLink }

    @objc public var lastDownloadTimestamp : Date? { get { raw.lastDownloadTimestamp } set { raw.lastDownloadTimestamp = newValue } }

    @objc public var cachedAtStartup : Bool { get { raw.cachedAtStartup } set { raw.cachedAtStartup = newValue } }

    @objc public var showCounter : Int { get { raw.showCounter } set { raw.showCounter = newValue } }

    @objc public var clickCounter : Int { get { raw.clickCounter } set { raw.clickCounter = newValue } }

    @objc public var overrideUrl : String? { get { raw.overrideUrl } set { raw.overrideUrl = newValue } }

    @objc public var externalTracker : String? { get { raw.externalTracker } set { raw.externalTracker = newValue } }

    @objc public enum AssetTypeRvm: Int {
        case image
        case video
    }

    @objc public func incrementShowCounter() { raw.incrementShowCounter() }

    @objc public func incrementClickCounter() { raw.incrementClickCounter()}

    @objc public override func isEqual(_ object: Any?) -> Bool {
        return if let other = object as? AdAssetRvm { self.raw == other.raw } else { false }
    }
}


@objc(AdListResponseRvm) public class AdListResponseRvm : NSObject {
    var raw: AdListResponse
    init(raw: AdListResponse) { self.raw = raw }

    @objc public var adList : [AdAssetRvm] { raw.adList.map { $0.toRvm() } }
}

@objc public class AdSdkRvm: NSObject {
    //! Project version number for DonkeyAdsSDKKit.
    @objc public static var versionNumber: Double { DonkeyAdsSDKKitVersionNumber }

    /**
     * Configures the SDK with the provided client token.
     * @param token The client token for authentication""
     */
    @objc public static func configure(token: String) { AdSdk.configure(token: token) }

    /**
     * Configures the SDK with the provided client token and user ID.
     * @param token The client token for authentication
     * @param userId Optional user ID for user-specific targeting
     */
    @objc public static func configure(token: String, userId: String?) { AdSdk.configure(token: token, userId: userId) }

    /**
     * Checks if the SDK has been initialized.
     * @return true if the SDK has been initialized, false otherwise
     */
    @objc public static func isInitialized() -> Bool { AdSdk.isInitialized() }

    @objc public static func setUserId(_ userId: String) { AdSdk.setUserId(userId) }

    @objc public static func setDelegate(_ delegate: (any DonkeyAdsDelegateRvm)?) { AdSdk.setDelegate(delegate?.toRaw()) }

    @objc public static func preloadAds() { AdSdk.preloadAds() }

    @objc public static func adAvailable() -> Bool { AdSdk.adAvailable() }

    @objc public static func showNextAd(from viewController: UIViewController) { AdSdk.showNextAd(from: viewController) }

    /**
     * Checks if a named ad is available to be shown.
     * @param name The name of the ad to check
     * @return true if the named ad exists and is ready to be shown, false otherwise
     */
    @objc public static func isNamedAdAvailable(name: String) -> Bool { AdSdk.isNamedAdAvailable(name: name) }

    /**
     * Shows a specific named ad, optionally overriding its URL and providing an external tracker.
     * @param viewController The view controller to present the ad from
     * @param name The name of the ad to show
     * @param overrideUrl Optional URL to override the ad's default URL (can be nil)
     * @param externalTracker Optional external tracker URL for reporting (can be nil)
     */
    @objc public static func showNamedAd(from viewController: UIViewController, name: String, overrideUrl: String? = nil, externalTracker: String? = nil) {
        AdSdk.showNamedAd(from: viewController, name: name, overrideUrl: overrideUrl, externalTracker: externalTracker)
    }

    /**
     * Shows a specific named ad, optionally overriding its URL.
     * @param viewController The view controller to present the ad from
     * @param name The name of the ad to show
     * @param overrideUrl Optional URL to override the ad's default URL (can be nil)
     */
    @objc public static func showNamedAd(from viewController: UIViewController, name: String, overrideUrl: String?) {
        AdSdk.showNamedAd(from: viewController, name: name, overrideUrl: overrideUrl)
    }

    /**
     * Returns a list of loaded assets (full AdAsset objects)
     * @param namedOnly If true, returns only named assets
     * @return Array of AdAsset objects that are currently loaded
     */
    @objc public static func checkLoadedAssets(namedOnly: Bool = false) -> [AdAssetRvm] {
        AdSdk.checkLoadedAssets(namedOnly: namedOnly).map { $0.toRvm() }
    }

    /**
     * Returns a list of loaded asset IDs (for backward compatibility)
     * @param namedOnly If true, returns only named assets
     * @return Array of asset IDs that are currently loaded
     */
    @objc public static func checkLoadedAssetIds(namedOnly: Bool = false) -> [String] {
        AdSdk.checkLoadedAssetIds(namedOnly: namedOnly)
    }

    /**
     * Clears all cached assets and metadata
     */
    @objc public static func clearCache() {
        AdSdk.clearCache()
    }
}

/**
 * Manages the current state of survey answers and progress.
 * Enhanced to support per-question timing and metadata tracking.
 */
@objc public class AnswerStateRvm : NSObject {
    var raw: AnswerState
    init(raw: AnswerState) { self.raw = raw }

    @objc public var answers: [String : Any] { raw.answers }

    @objc override public init() { self.raw = AnswerState() }

    @objc public override func isEqual(_ object: Any?) -> Bool {
        return if let other = object as? AnswerStateRvm { self.raw == other.raw } else { false }
    }

    /**
     * Set an answer for a specific question.
     */
    @objc public func setAnswer(questionId: String, answer: Any?) { raw.setAnswer(questionId: questionId, answer: answer) }

    /**
     * Get the current answer for a question.
     */
    @objc public func getAnswer(questionId: String) -> Any? { raw.getAnswer(questionId: questionId) }

    /**
     * Check if a question has been answered.
     */
    @objc public func hasAnswer(questionId: String) -> Bool { raw.hasAnswer(questionId: questionId) }

    /**
     * Get all answered question IDs.
     */
    @objc public func getAnsweredQuestionIds() -> [String] { raw.getAnsweredQuestionIds() }

    /**
     * Get the total number of answered questions.
     */
    @objc public func getAnswerCount() -> Int { raw.getAnswerCount() }

    /**
     * Clear all answers.
     */
    @objc public func clearAllAnswers() { raw.clearAllAnswers() }

    /**
     * Remove answer for a specific question.
     */
    @objc public func removeAnswer(questionId: String) { raw.removeAnswer(questionId: questionId) }

    /**
     * Get completion percentage for a survey.
     */
    @objc public func getCompletionPercentage(for survey: SurveyRvm) -> Double { raw.getCompletionPercentage(for: survey.raw) }

    /**
     * Check if all required questions in a survey are answered.
     */
    @objc public func areAllRequiredQuestionsAnswered(for survey: SurveyRvm) -> Bool { raw.areAllRequiredQuestionsAnswered(for: survey.raw) }

    /**
     * Get answers as a dictionary suitable for API submission.
     */
    @objc public func toSubmissionFormat() -> [String : Any] { raw.toSubmissionFormat() }

    /**
     * Load answers from a dictionary (e.g., from saved state).
     */
    @objc public func loadAnswers(from dictionary: [String : Any]) { raw.loadAnswers(from: dictionary) }

    /**
     * Create a copy of the current answer state.
     */
    @objc public func clone() -> AnswerStateRvm { AnswerStateRvm(raw: raw.copy()) }

    /**
     * Start timing for a specific question.
     */
    @objc public func startQuestionTiming(questionId: String) { raw.startQuestionTiming(questionId: questionId) }

    /**
     * Stop timing for a specific question and record the duration.
     */
    @objc public func stopQuestionTiming(questionId: String) { raw.stopQuestionTiming(questionId: questionId) }

    /**
     * Get the time spent on a specific question in seconds.
     */
    @objc public func getQuestionTimeSpent(questionId: String) -> NSNumber? { raw.getQuestionTimeSpent(questionId: questionId) as NSNumber? }

    /**
     * Record when a question was answered.
     */
    @objc public func setAnswerTimestamp(questionId: String, timestamp: Date = Date()) { raw.setAnswerTimestamp(questionId: questionId, timestamp: timestamp)}

    /**
     * Get the timestamp when a question was answered.
     */
    @objc public func getAnswerTimestamp(questionId: String) -> Date? { raw.getAnswerTimestamp(questionId: questionId) }

    /**
     * Enhanced setAnswer method that also tracks timing.
     */
    @objc public func setAnswerWithTiming(questionId: String, answer: Any?) { raw.setAnswerWithTiming(questionId: questionId, answer: answer) }
}

@objc extension DonkeyAdsSDKKit.BaseQuestionCard: QuestionViewRvm {
    public var rvm_delegate: (any QuestionViewDelegateRvm)? {
        get { (delegate as? QuestionViewDelegateProxy)?.rvm }
        set { delegate = newValue?.toRaw() }
    }
    
    public func rvm_configure(question: QuestionRvm, answerState: AnswerStateRvm) {
        configure(question: question.raw, answerState: answerState.raw)
    }
    
    public func rvm_saveAnswer() {
        saveAnswer()
    }
}


@objc(CacheManagerRvm) public class CacheManagerRvm: NSObject {
    var raw: CacheManager
    init(raw: CacheManager) { self.raw = raw }
    static var _sharedInstance: CacheManagerRvm? = nil
    
    @objc public static var shared: CacheManagerRvm {
        if (_sharedInstance?.raw !== CacheManager.shared) {
            _sharedInstance = CacheManagerRvm(raw: CacheManager.shared)
        }
        return _sharedInstance!
    }
    
    /**
     * Saves metadata for a single asset
     */
    @objc public func saveAssetMetadata(_ asset: AdAssetRvm) { raw.saveAssetMetadata(asset.raw) }
    
    @objc public func clearAllCachedAssetsAndMetadata() { raw.clearAllCachedAssetsAndMetadata() }
    
    @objc public func clearCache() { raw.clearCache() }
    
    @objc public func updateAssetList(with newAssets: [AdAssetRvm]) -> [AdAssetRvm] {
        raw.updateAssetList(with: newAssets.map {$0.raw}).toRvm()
    }
    
    /**
     * Removes assets that are no longer in the current server response (outdated assets)
     * while preserving assets that are still valid
     */
    @objc public func updateAssetListAndCleanupOutdated(with newAssets: [AdAssetRvm]) -> [AdAssetRvm] {
        raw.updateAssetListAndCleanupOutdated(with: newAssets.map {$0.raw}).toRvm()
    }
    
    @objc public func finalizeDownload(asset: AdAssetRvm, sourceURL: URL, isSourceHoldingURL: Bool) -> Bool {
        raw.finalizeDownload(asset: asset.raw, sourceURL: sourceURL, isSourceHoldingURL: isSourceHoldingURL)
    }
    
    @objc public func markDownloadFailed(assetId: String) { raw.markDownloadFailed(assetId: assetId) }
    
    @objc public func getReadyAssets() -> [AdAssetRvm] { raw.getReadyAssets().toRvm() }
    
    @objc public func getLoadedAssets(namedOnly: Bool = false) -> [AdAssetRvm] {
        raw.getLoadedAssets(namedOnly: namedOnly).toRvm()
    }
    
    @objc public func namedAd(name: String) -> AdAssetRvm? { raw.namedAd(name: name)?.toRvm() }
    
    @objc public func getNextAd() -> AdAssetRvm? { raw.getNextAd()?.toRvm() }
    
    @objc public func hasValidCachedAssets() -> Bool { raw.hasValidCachedAssets() }
    
    @objc public func getFileURL(for assetId: String) -> URL? { raw.getFileURL(for: assetId) }
    
    @objc public func performAutomaticCleanup() { raw.performAutomaticCleanup() }
    
    
    @objc(CacheManagerRvm_CacheStats) public class CacheStats: NSObject {
        @objc public let assetCount: Int
        @objc public let totalSizeBytes: Int64
        @objc public let namedCount: Int
        @objc public let unnamedCount: Int
        @objc init(_ assetCount: Int, _ totalSizeBytes: Int64, _ namedCount: Int, _ unnamedCount: Int) {
            self.assetCount = assetCount
            self.totalSizeBytes = totalSizeBytes
            self.namedCount = namedCount
            self.unnamedCount = unnamedCount
        }
    }
    @objc public func getCacheStats() -> CacheStats {
        let t = raw.getCacheStats()
        return CacheStats(t.assetCount, t.totalSizeBytes, t.namedCount, t.unnamedCount)
    }

    /**
     * Performs comprehensive cache cleanup for background processing
     */
    @objc public func performDeepCleanup() { raw.performDeepCleanup() }

    /**
     * Checks if cleanup should be performed based on cache state
     */
    @objc public func shouldPerformCleanup() -> Bool { raw.shouldPerformCleanup() }

    /**
     * Gets pending wifi-only assets for background downloading
     */
    @objc public func getPendingWifiOnlyAssets() -> [AdAssetRvm] { raw.getPendingWifiOnlyAssets().toRvm() }

    /**
     * Gets assets that failed to download for retry attempts
     */
    @objc public func getFailedDownloadAssets() -> [AdAssetRvm] { raw.getFailedDownloadAssets().toRvm() }

    /**
     * Validates and updates metadata consistency
     */
    @objc public func validateAndUpdateMetadata() { raw.validateAndUpdateMetadata() }

    /**
     * Marks a download as skipped due to network restrictions
     */
    @objc public func markDownloadSkippedDueToNetwork(assetId: String) { raw.markDownloadSkippedDueToNetwork(assetId: assetId) }

    /**
     * Gets the next available ad (compatibility method)
     */
    @objc public func nextAvailableAd() -> AdAssetRvm? { raw.nextAvailableAd()?.toRvm() }

    /**
     * Gets the local URL for an asset (compatibility method)
     */
    @objc public func localURL(for asset: AdAssetRvm) -> URL? { raw.localURL(for: asset.raw) }

    @objc public func getAsset(by assetId: String) -> AdAssetRvm? { raw.getAsset(by: assetId)?.toRvm() }

    /**
     * Gets the latest asset from cache to avoid stale data
     */
    @objc public func getLatestAsset(id: String) -> AdAssetRvm? { raw.getLatestAsset(id: id)?.toRvm() }
}

@objc(DonkeyAdsDelegateRvm) public  protocol DonkeyAdsDelegateRvm : NSObjectProtocol {

    @objc func adsDidLoad()

    @objc func adDidShow(_ assetId: String, impressionHash: String)

    @objc func adDidClick(_ assetId: String, impressionHash: String?)

    @objc func adDidClose(_ assetId: String, impressionHash: String?)
}

@objc(DonkeyAdsLoggerRvm) public class DonkeyAdsLoggerRvm: NSObject {

    @objc public static var isEnabled: Bool { DonkeyAdsLogger.isEnabled }

    @objc public static func log(_ message: String, from className: String) { DonkeyAdsLogger.log(message, from: className)}
}

/**
 * Utility class for generating unique impression hashes for ad tracking
 */
@objc(ImpressionHasherRvm) public class ImpressionHasherRvm: NSObject {

    /**
     * Generates a unique impression hash based on asset ID, timestamp, and a random element.
     * @param assetId The ID of the ad asset
     * @param timestamp The timestamp of the impression
     * @return A unique hash string for this impression
     */
    @objc public static func generateImpressionHash(assetId: String, timestamp: Date) -> String {
        ImpressionHasher.generateImpressionHash(assetId: assetId, timestamp: timestamp)
    }

    /**
     * Validates that a hash looks valid (basic format check)
     * @param hash The hash string to validate
     * @return true if the hash appears to be in a valid format
     */
    @objc public static func isValidHash(_ hash: String) -> Bool { ImpressionHasher.isValidHash(hash)}

    /**
     * Extracts the asset ID from a hash (if it's in fallback format)
     * @param hash The hash string
     * @return The asset ID if extractable, nil otherwise
     */
    @objc public static func extractAssetId(from hash: String) -> String? { ImpressionHasher.extractAssetId(from: hash) }

    /**
     * Extracts the timestamp from a hash (if it's in fallback format)
     * @param hash The hash string
     * @return The timestamp if extractable, nil otherwise
     */
    @objc public static func extractTimestamp(from hash: String) -> Date? { ImpressionHasher.extractTimestamp(from: hash) }

    /**
     * Test method to verify hash generation functionality
     * This method can be used during development to ensure the hasher works correctly
     */
    @objc public static func runBasicTests() -> Bool { ImpressionHasher.runBasicTests() }
}

@objc(LocalizationManagerRvm) public class LocalizationManagerRvm: NSObject {
    var raw: LocalizationManager
    init(raw: LocalizationManager) { self.raw = raw }
    static var _sharedInstance: LocalizationManagerRvm? = nil
    
    @objc public static var shared: LocalizationManagerRvm {
        if (_sharedInstance?.raw !== LocalizationManager.shared) {
            _sharedInstance = LocalizationManagerRvm(raw: LocalizationManager.shared)
        }
        return _sharedInstance!
    }

    @objc public func setLanguage(_ languageCode: String) { raw.setLanguage(languageCode)}

    @objc public func resetToDefault() { raw.resetToDefault() }

    @objc public func getCurrentLanguage() -> String { raw.getCurrentLanguage() }

    @objc public func localizedString(for key: String, params: [String : String] = [:]) -> String {
        raw.localizedString(for: key, params: params)
    }
}

@objc(OptionRvm) public class OptionRvm : NSObject {
    var raw: Option
    init(raw: Option) { self.raw = raw }

    @objc public var id : Int { raw.id }

    @objc public var label : String { raw.label }

    @objc public var value : String { raw.value }

    @objc public var sortOrder : Int { raw.sortOrder }


    @objc public override func isEqual(_ object: Any?) -> Bool {
        return if let other = object as? OptionRvm { self.raw == other.raw } else { false }
    }
}

@objc(QuestionRvm) public class QuestionRvm : NSObject {
    var raw: Question
    init(raw: Question) { self.raw = raw }

    @objc public var id : Int { raw.id }

    @objc public var code : String { raw.code }

    @objc public var body : String { raw.body }

    @objc public var type : String { raw.type }

    @objc public var isRequired : Bool { raw.isRequired }

    @objc public var sortOrder : Int { raw.sortOrder }

    @objc public var sectionId : NSNumber? { raw.sectionId as NSNumber? }

    @objc public var minValue : NSNumber? { raw.minValue as NSNumber? }

    @objc public var maxValue : NSNumber? { raw.maxValue as NSNumber? }

    @objc public var scaleStart : NSNumber? { raw.scaleStart as NSNumber? }

    @objc public var scaleEnd : NSNumber? { raw.scaleEnd as NSNumber? }

    @objc public var options : [OptionRvm]? { raw.options?.toRvm() }

    @objc public enum QuestionTypeRvm : Int {
        case text
        case singleChoice
        case multiChoice
        case rating
        case scale
    }

    /**
     * Get the question type as an enum.
     */
    @objc public func getQuestionType() -> QuestionRvm.QuestionTypeRvm { raw.getQuestionType().toRvm() }

    /**
     * Check if this is a choice question (single or multi choice).
     */
    @objc public func isChoiceQuestion() -> Bool { raw.isChoiceQuestion() }

    /**
     * Check if this is a scale or rating question.
     */
    @objc public func isScaleQuestion() -> Bool { raw.isScaleQuestion() }

    /**
     * Get the scale start value, preferring the new field over deprecated one.
     */
    @objc public func getScaleQuestionStart() -> Int { raw.getScaleStart() }

    /**
     * Get the scale end value, preferring the new field over deprecated one.
     */
    @objc public func getScaleQuestionEnd() -> Int { raw.getScaleEnd() }

    /**
     * Get an option by its ID.
     */
    @objc public func getOptionById(_ optionId: Int) -> OptionRvm? { raw.getOptionById(optionId)?.toRvm() }

    /**
     * Get an option by its value.
     */
    @objc public func getOptionByValue(_ value: String) -> OptionRvm? { raw.getOptionByValue(value)?.toRvm() }

    /**
     * Validate an answer value for this question.
     */
    @objc public func isValidAnswer(_ answerValue: Any?) -> Bool { raw.isValidAnswer(answerValue) }

    @objc public override func isEqual(_ object: Any?) -> Bool {
        return if let other = object as? QuestionRvm { self.raw == other.raw } else { false }
    }
}

@objc(QuestionViewRvm) public protocol QuestionViewRvm : NSObjectProtocol {

    @objc var rvm_delegate: (any QuestionViewDelegateRvm)? { get set }

    @objc func rvm_configure(question: QuestionRvm, answerState: AnswerStateRvm)

    @objc func rvm_saveAnswer()
}

@objc(QuestionViewDelegateRvm) public protocol QuestionViewDelegateRvm : NSObjectProtocol {
    @objc func questionView(_ questionView: any QuestionViewRvm, didUpdateAnswer answer: Any?, for questionId: String)
}

@objc(QuestionViewFactoryRvm) public class QuestionViewFactoryRvm: NSObject {

    /**
     * Create a QuestionView instance for the given question.
     */
    @objc public static func createQuestionView(for question: QuestionRvm) -> (any QuestionViewRvm)? {
        QuestionViewFactory.createQuestionView(for: question.raw) as? (any QuestionViewRvm)
    }

    /**
     * Check if a question type is supported.
     */
    @objc public static func isQuestionTypeSupported(_ question: QuestionRvm) -> Bool {
        QuestionViewFactory.isQuestionTypeSupported(question.raw)
    }
}

@objc(SectionRvm) public class SectionRvm : NSObject {
    var raw: DonkeyAdsSDKKit.Section
    init(raw: DonkeyAdsSDKKit.Section) { self.raw = raw }

    @objc public var id : Int { raw.id }

    @objc public var title : String? { raw.title }

    @objc public var sectionDescription : String? { raw.description }

    @objc public var sortOrder : Int { raw.sortOrder }

    @objc public var questions : [QuestionRvm] { raw.questions.toRvm() }

    @objc public override func isEqual(_ object: Any?) -> Bool {
        return if let other = object as? SectionRvm { self.raw == other.raw } else { false }
    }
}


@objc(SurveyRvm) public class SurveyRvm : NSObject {
    var raw: DonkeyAdsSDKKit.Survey
    init(raw: DonkeyAdsSDKKit.Survey) { self.raw = raw }

    @objc public var id : Int { raw.id }

    @objc public var externalKey : String? { raw.externalKey }

    @objc public var title : String { raw.title }

    @objc public var surveyDescription : String? { raw.description }

    @objc public var status : String { raw.status }

    @objc public var rewardPoints : Int { raw.rewardPoints }

    @objc public var version : Int { raw.version }

    @objc public var languageCode : String? { raw.languageCode }

    @objc public var sections : [SectionRvm]? { raw.sections?.toRvm() }

    @objc public var questions : [QuestionRvm]? { raw.questions?.toRvm() }

    public var lastFetchTimestamp : Date? { get { raw.lastFetchTimestamp } set { raw.lastFetchTimestamp = newValue } }

    public var cachedAtStartup : Bool { get { raw.cachedAtStartup } set { raw.cachedAtStartup = newValue } }


    /**
     * Get all questions across all sections.
     */
    @objc public func getAllQuestions() -> [QuestionRvm] { raw.getAllQuestions().toRvm() }

    /**
     * Get a question by its ID.
     */
    @objc public func getQuestionById(_ questionId: Int) -> QuestionRvm? { raw.getQuestionById(questionId)?.toRvm() }

    /**
     * Get a question by its code.
     */
    @objc public func getQuestionByCode(_ questionCode: String) -> QuestionRvm? { raw.getQuestionByCode(questionCode)?.toRvm() }

    /**
     * Check if this survey is currently active.
     */
    @objc public func isActive() -> Bool { raw.isActive() }

    /**
     * Get the total number of questions in this survey.
     */
    @objc public func getTotalQuestionCount() -> Int { raw.getTotalQuestionCount() }

    @objc public override func isEqual(_ object: Any?) -> Bool {
        return if let other = object as? SurveyRvm { self.raw == other.raw } else { false }
    }
}

/**
 * Represents errors that can occur during survey operations.
 * Similar to Android's SurveyError class.
 */
@objc(SurveyErrorCodeRvm) public enum SurveyErrorCodeRvm : Int {
    case unknown = -1
    case networkError
    case invalidSurveyData
    case surveyNotFound
    case validationError
    case submissionFailed
    case initializationError
}

public typealias SurveyErrorRvm = NSError


@objc(SurveyLifecycleListenerRvm) public protocol SurveyLifecycleListenerRvm : NSObjectProtocol {

    /**
     * Called when a survey is started by the user
     * @param survey The survey summary information
     */
    func onSurveyStarted(_ survey: SurveySummaryRvm)

    /**
     * Called when the user answers a question and moves to the next step
     * @param survey The survey summary information
     * @param state Current answer state with progress information
     */
    func onSurveyStepAnswered(_ survey: SurveySummaryRvm, _ state: AnswerStateRvm)

    /**
     * Called when the user completes the entire survey
     * @param survey The survey summary information
     * @param rewardPoints Points earned for completing the survey
     * @param state Final answer state with all responses
     */
    func onSurveyCompleted(_ survey: SurveySummaryRvm, rewardPoints: Int, _ state: AnswerStateRvm)

    /**
     * Called when the user cancels/exits the survey before completion
     * @param survey The survey summary information
     * @param state Current answer state at time of cancellation
     */
    func onSurveyCancelled(_ survey: SurveySummaryRvm, _ state: AnswerStateRvm)

    /**
     * Called when an error occurs during survey flow
     * @param survey The survey summary information (may be nil if error occurred before survey loaded)
     * @param error The error that occurred
     * @param state Current answer state at time of error (may be nil)
     */
    func onSurveyFailed(_ survey: SurveySummaryRvm?, error: SurveyErrorRvm, _ state: AnswerStateRvm?)
}

@objc(SurveyManagerRvm) public class SurveyManagerRvm: NSObject {
    var raw: SurveyManager
    init(raw: SurveyManager) { self.raw = raw }
    static var _sharedInstance: SurveyManagerRvm? = nil
    
    @objc public static var shared: SurveyManagerRvm {
        if (_sharedInstance?.raw !== SurveyManager.shared) {
            _sharedInstance = SurveyManagerRvm(raw: SurveyManager.shared)
        }
        return _sharedInstance!
    }

    @objc public func cacheSurvey(_ survey: SurveyRvm) { raw.cacheSurvey(survey.raw) }

    @objc public func getCachedSurvey(id: String) -> SurveyRvm? { raw.getCachedSurvey(id: id)?.toRvm() }

    @objc public func getAvailableSurveys() -> [SurveySummaryRvm] { raw.getAvailableSurveys().toRvm() }

    @objc public func isSurveyAvailable(id: String) -> Bool { raw.isSurveyAvailable(id: id) }

    @objc public func getCachedSurveyCount() -> Int { raw.getCachedSurveyCount() }

    @objc public func getCachedSurveyIds() -> Set<String> { raw.getCachedSurveyIds() }

    @objc public func clearCache() { raw.clearCache() }
}

@objc(SurveyNetworkClientRvm) public class SurveyNetworkClientRvm: NSObject {
    var raw: SurveyNetworkClient
    init(raw: SurveyNetworkClient) { self.raw = raw }
    static var _sharedInstance: SurveyNetworkClientRvm? = nil
    
    @objc public static var shared: SurveyNetworkClientRvm {
        if (_sharedInstance?.raw !== SurveyNetworkClient.shared) {
            _sharedInstance = SurveyNetworkClientRvm(raw: SurveyNetworkClient.shared)
        }
        return _sharedInstance!
    }

    @objc public func testMultipleEndpoints(completion: @escaping ([String : Bool]) -> Void) {
        raw.testMultipleEndpoints(completion: completion)
    }

    @objc public func testConnectivity(completion: @escaping (Bool) -> Void) {
        raw.testConnectivity(completion: completion)
    }

    @objc public func fetchSurvey(externalKey: String, apiToken: String, completion: @escaping (SurveyRvm?, SurveyErrorRvm?) -> Void) {
        raw.fetchSurvey(externalKey: externalKey, apiToken: apiToken, completion: { result in
            switch result {
            case let .success(survey): completion(SurveyRvm(raw: survey), nil)
            case let .failure(err): completion(nil, err.toRvm())
            }

        })
    }

    @objc public func listAvailableSurveys(apiToken: String, completion: @escaping ([String]?, SurveyErrorRvm?) -> Void) {
        raw.listAvailableSurveys(apiToken: apiToken, completion: { result in
            switch result {
            case let .success(surveys): completion(surveys, nil)
            case let .failure(err): completion(nil, err.toRvm())
            }

        })
    }

    @objc public func submitSurveyResponse(response: SurveyResponseRvm, apiToken: String, completion: @escaping (SurveyErrorRvm?) -> Void) {
        raw.submitSurveyResponse(response: response.raw, apiToken: apiToken, completion: { result in
            switch result {
            case .success(_): completion(nil)
            case let .failure(err): completion(err.toRvm())
            }
        })
    }
}

/**
 * Tracks survey progress and provides analytics.
 */
@objc(SurveyProgressTrackerRvm) public class SurveyProgressTrackerRvm: NSObject {
    var raw: SurveyProgressTracker
    init(raw: SurveyProgressTracker) { self.raw = raw }

    @objc public override init() {
        raw = SurveyProgressTracker()
    }

    @objc public func startSurvey() { raw.startSurvey() }

    @objc public func startQuestion(_ questionId: String) { raw.startSurvey() }

    @objc public func answerQuestion(_ questionId: String) { raw.answerQuestion(questionId) }

    @objc public func getTotalSurveyTime() -> TimeInterval { raw.getTotalSurveyTime() ?? -1.0 }

    @objc public func getQuestionAnswerTime(_ questionId: String) -> TimeInterval { raw.getQuestionAnswerTime(questionId) ?? -1.0 }

    @objc public func getAverageQuestionTime() -> TimeInterval { raw.getAverageQuestionTime() }

    @objc public func reset() { raw.reset() }
}

/**
 * Complete survey response structure for submission to the FluidData Survey API.
 * Matches the comprehensive format used by Android implementation.
 */
@objc(SurveyResponseRvm) public class SurveyResponseRvm : NSObject {
    var raw: DonkeyAdsSDKKit.SurveyResponse
    init(raw: DonkeyAdsSDKKit.SurveyResponse) { self.raw = raw }

    @objc public var type : String { raw.type }

    @objc public var apitoken : String { raw.apitoken }

    @objc public var responseData : SurveyResponseRvm.ResponseDataRvm { SurveyResponseRvm.ResponseDataRvm(raw: raw.responseData) }


    /**
     * Main container for survey response submission with metadata and answers.
     * Contains all fields required by FluidData API specification.
     */
    @objc(ResponseDataRvm) public class ResponseDataRvm : NSObject {
        var raw: DonkeyAdsSDKKit.SurveyResponse.ResponseData
        init(raw: DonkeyAdsSDKKit.SurveyResponse.ResponseData) { self.raw = raw }

        @objc public var surveyId : Int { raw.surveyId }

        @objc public var surveyExternalKey : String { raw.surveyExternalKey }

        @objc public var surveyTitle : String { raw.surveyTitle }

        @objc public var surveyVersion : Int { raw.surveyVersion }

        @objc public var appId : String { raw.appId }

        @objc public var userId : String? { raw.userId }

        @objc public var sessionId : String { raw.sessionId }

        @objc public var ipAddress : String? { raw.ipAddress }

        @objc public var userAgent : String? { raw.userAgent }

        @objc public var startedAt : String { raw.startedAt }

        @objc public var endTime : String? { raw.endTime }

        @objc public var completionStatus : String { raw.completionStatus }

        @objc public var totalTimeSeconds : NSNumber? { raw.totalTimeSeconds as NSNumber? }

        @objc public var deviceType : String { raw.deviceType }

        @objc public var reportingKey : String? { raw.reportingKey }

        @objc public var customReward : NSNumber? { raw.customReward as NSNumber? }

        @objc public var answers : [SurveyResponseRvm.AnswerRvm] { raw.answers.toRvm() }
    }

    /**
     * Individual answer object containing question metadata and user response.
     * Includes comprehensive metadata for each answer as required by FluidData API.
     */
    @objc(AnswerRvm) public class AnswerRvm : NSObject {
        var raw: DonkeyAdsSDKKit.SurveyResponse.Answer
        init(raw: DonkeyAdsSDKKit.SurveyResponse.Answer) { self.raw = raw }

        @objc public var questionId : Int { raw.questionId }

        @objc public var questionCode : String { raw.questionCode }

        @objc public var questionType : String { raw.questionType }

        @objc public var questionText : String { raw.questionText }

        @objc public var sortOrder : Int { raw.sortOrder }

        @objc public var isRequired : Bool { raw.isRequired }

        @objc public var value : Any { raw.value }

        @objc public var skipped : Bool { raw.skipped }

        @objc public var sectionId : NSNumber? { raw.sectionId as NSNumber?}

        @objc public var sectionTitle : String? { raw.sectionTitle }

        @objc public var timeSpentSeconds : NSNumber? { raw.timeSpentSeconds as NSNumber?}

        @objc public var answeredAt : String? { raw.answeredAt }
    }

    /**
     * Completion status values for survey responses.
     */
    @objc public enum CompletionStatusRvm : Int {
        case completed
        case partial
        case abandoned
    }
}


@objc(SurveySDKRvm) public class SurveySDKRvm: NSObject {
    @objc public static let SurveyErrorDomain = "SurveySDKRvm.SurveyErrorDomain"

    /**
     * Get the current survey's real start time
     */
    @objc public static func getCurrentSurveyStartTime() -> Date? { SurveySDK.getCurrentSurveyStartTime() }

    /**
     * Initializes the Survey SDK with the FluidData API token
     * @param context The application context (not used in iOS, kept for API compatibility)
     * @param apiToken The FluidData API token for authentication
     */
    @objc public static func initialize(_ context: Any?, apiToken: String) { SurveySDK.initialize(context, apiToken: apiToken) }

    /**
     * Sets the lifecycle listener for survey events
     * @param listener The listener to receive survey events
     */
    @objc public static func setLifecycleListener(_ listener: (any SurveyLifecycleListenerRvm)?) {
        SurveySDK.setLifecycleListener(listener?.toRaw())
    }

    public typealias SurveyFetchCallback = (Result<DonkeyAdsSDKKit.Survey, DonkeyAdsSDKKit.SurveyError>) -> Void

    /**
     * Tests network connectivity to the API
     */
    @objc public static func testNetworkConnectivity(callback: @escaping (Bool) -> Void) {
        SurveySDK.testNetworkConnectivity(callback: callback)
    }

    /**
     * Tests connectivity to multiple endpoints for debugging
     */
    @objc public static func debugNetworkConnectivity(callback: @escaping ([String : Bool]) -> Void) {
        SurveySDK.debugNetworkConnectivity(callback: callback)
    }

    /**
     * Fetches a survey from the backend using its external key
     * @param externalKey The external key of the survey
     * @param callback Callback with the result
     * @param skipConnectivityTest Skip the initial connectivity test (useful for debugging)
     */
    @objc public static func fetchSurveyFromBackend(externalKey: String, skipConnectivityTest: Bool = false, callback: @escaping (SurveyRvm?, SurveyErrorRvm?) -> Void) {
        SurveySDK.fetchSurveyFromBackend(externalKey: externalKey, skipConnectivityTest: skipConnectivityTest, callback: { result in
            switch result {
            case let .success(survey): callback(SurveyRvm(raw: survey), nil)
            case let .failure(err): callback(nil, err.toRvm())
            }
        })
    }

    /**
     * Lists available surveys from the backend (for debugging)
     */
    @objc public static func listAvailableSurveys(callback: @escaping ([String]?, SurveyErrorRvm?) -> Void) {
        SurveySDK.listAvailableSurveys(callback: { result in
            switch result {
            case let .success(surveys): callback(surveys, nil)
            case let .failure(err): callback(nil, err.toRvm())
            }
        })
    }

    /**
     * Gets a list of all available surveys
     * @return Array of survey summaries
     */
    @objc public static func getAvailableSurveys() -> [SurveySummaryRvm] {
        SurveySDK.getAvailableSurveys().toRvm()
    }

    /**
     * Checks if a specific survey is available
     * @param surveyId The ID of the survey to check
     * @return true if the survey is available, false otherwise
     */
    @objc public static func isSurveyAvailable(_ surveyId: String) -> Bool { SurveySDK.isSurveyAvailable(surveyId) }

    /**
     * Creates a test survey for development purposes
     * This creates a comprehensive survey with all question types across multiple sections
     */
    @objc public static func createTestSurvey() { SurveySDK.createTestSurvey() }

    /**
     * Start a survey with the given ID from the presenting view controller
     */
    @objc public static func startSurvey(from viewController: UIViewController, surveyId: String, reportingKey: String? = nil, customReward: NSNumber? = nil, themeOverride: String? = nil, orientationOverride: String? = nil) {
        SurveySDK.startSurvey(from: viewController, surveyId: surveyId, reportingKey: reportingKey, customReward: customReward?.intValue, themeOverride: themeOverride, orientationOverride:  orientationOverride)
    }

    /**
     * Start a survey with external key from the presenting view controller
     */
    @objc public static func startSurvey(from viewController: UIViewController, externalKey: String, reportingKey: String? = nil, customReward: NSNumber? = nil, themeOverride: String? = nil, orientationOverride: String? = nil) {
        SurveySDK.startSurvey(from: viewController, externalKey: externalKey, reportingKey: reportingKey, customReward: customReward?.intValue, themeOverride: themeOverride, orientationOverride:  orientationOverride)

    }

    /**
     * Clears the survey cache
     */
    @objc public static func clearCache() { SurveySDK.clearCache() }

    /**
     * Gets the number of cached surveys
     * @return Number of surveys in cache
     */
    @objc public static func getCachedSurveyCount() -> Int { SurveySDK.getCachedSurveyCount() }

    /**
     * Gets the IDs of all cached surveys
     * @return Set of survey IDs
     */
    @objc public static func getCachedSurveyIds() -> Set<String> { SurveySDK.getCachedSurveyIds() }

    /**
     * Sets the language for the survey UI
     * @param languageCode Language code ("de" for German, "en" for English)
     */
    @objc public static func setLanguage(_ languageCode: String) { SurveySDK.setLanguage(languageCode) }

    /**
     * Resets the language to default (German)
     */
    @objc public static func resetLanguageToDefault() { SurveySDK.resetLanguageToDefault() }

    /**
     * Gets the current language code
     * @return Current language code
     */
    @objc public static func getCurrentLanguage() -> String { SurveySDK.getCurrentLanguage() }

    /**
     * Submit a survey response to the FluidData API.
     * This method handles the submission of comprehensive survey responses.
     */
    @objc public static func submitSurveyResponse(_ response: SurveyResponseRvm, completion: @escaping (SurveyErrorRvm?) -> Void) {
        SurveySDK.submitSurveyResponse(response.raw, completion: { result in
            switch result {
            case .success(_): completion(nil)
            case let .failure(err): completion(err.toRvm())
            }
        })
    }

    /**
     * Create a comprehensive FluidData survey response from survey data and answers.
     * This method builds the complete response structure required by the FluidData API.
     */
    @objc public static func createSurveyResponse(survey: SurveyRvm, answers: [String : Any], reportingKey: String? = nil, customReward: NSNumber? = nil, startTime: Date, userId: String? = nil) -> SurveyResponseRvm {
        SurveySDK.createSurveyResponse(survey: survey.raw, answers: answers, reportingKey: reportingKey, customReward: customReward?.intValue,
                                       startTime: startTime, userId: userId).toRvm()
    }

    /**
     * Enhanced createSurveyResponse that accepts AnswerState for timing information.
     */
    @objc public static func createSurveyResponse(survey: SurveyRvm, answerState: AnswerStateRvm, reportingKey: String? = nil, customReward: NSNumber? = nil, startTime: Date, userId: String? = nil) -> SurveyResponseRvm {
        SurveySDK.createSurveyResponse(survey: survey.raw, answerState: answerState.raw, reportingKey: reportingKey, customReward: customReward?.intValue,
                                       startTime: startTime, userId: userId).toRvm()

    }
}

/**
 * Summary information about a survey.
 * Similar to Android's SurveySummary class.
 */
@objc(SurveySummaryRvm) public class SurveySummaryRvm: NSObject {
    var raw: DonkeyAdsSDKKit.SurveySummary
    init(raw: DonkeyAdsSDKKit.SurveySummary) { self.raw = raw }

    @objc public var surveyId : Int { raw.surveyId }

    @objc public var title : String { raw.title }

    @objc public var sumaryDescription : String? { raw.description }

    @objc public var totalQuestions : Int { raw.totalQuestions }

    @objc public var totalSections : Int { raw.totalSections }

    @objc public var rewardPoints : Int { raw.rewardPoints }

    @objc public var estimatedDurationMinutes : NSNumber? { raw.estimatedDurationMinutes as NSNumber? }

    @objc public var languageCode : String? { raw.languageCode }

    @objc public var externalKey : String? { raw.externalKey }
}

/**
 * Manages survey theming to match Android implementation.
 */
@objc public class SurveyThemeManagerRvm: NSObject {
    var raw: SurveyThemeManager
    init(raw: SurveyThemeManager) { self.raw = raw }
    static var _sharedInstance: SurveyThemeManagerRvm? = nil
    
    @objc public static var shared: SurveyThemeManagerRvm {
        if (_sharedInstance?.raw !== SurveyThemeManager.shared) {
            _sharedInstance = SurveyThemeManagerRvm(raw: SurveyThemeManager.shared)
        }
        return _sharedInstance!
    }

    @objc(SurveyThemeManagerRvm_Theme) public enum ThemeRvm : Int {
        case light
        case dark
        case auto
    }

    @objc public var currentTheme : ThemeRvm { raw.currentTheme.toRvm() }

    @objc public func applyTheme(_ theme: ThemeRvm, to view: UIView) { raw.applyTheme(theme.toRaw(), to: view) }

    @objc public var primaryColor: UIColor { raw.primaryColor }

    @objc public var secondaryColor: UIColor { raw.secondaryColor }

    @objc public var backgroundColor: UIColor { raw.backgroundColor }

    @objc public var cardBackgroundColor: UIColor { raw.cardBackgroundColor }
}


/**
 * Helper class for validating survey responses.
 */
@objc(SurveyValidationHelperRvm) public class SurveyValidationHelperRvm: NSObject {

    @objc public static func validateAnswerState(_ answerState: AnswerStateRvm, for survey: SurveyRvm) -> [ValidationErrorRvm] {
        SurveyValidationHelper.validateAnswerState(answerState.raw, for: survey.raw).map { ValidationErrorRvm(raw: $0) }
    }
}

@objc extension DonkeyAdsSDKKit.SurveyViewController  {
    // make to appear in header by adding extension
    @objc public func rvm_noop() {}
    
    @objc public static let RVM_EXTRA_SURVEY_ID: String = EXTRA_SURVEY_ID

    @objc public static let RVM_EXTRA_REPORTING_KEY: String = EXTRA_REPORTING_KEY

    @objc public static let RVM_EXTRA_CUSTOM_REWARD: String = EXTRA_CUSTOM_REWARD

    @objc public static let RVM_EXTRA_THEME_OVERRIDE: String = EXTRA_THEME_OVERRIDE

    @objc public static let RVM_EXTRA_ORIENTATION_OVERRIDE: String = EXTRA_ORIENTATION_OVERRIDE
    
    /**
     * Set the survey data for this view controller
     */
    @objc public func rvm_setSurvey(_ survey: SurveyRvm) { setSurvey(survey.raw) }

    /**
     * Get the real start time when the survey was displayed to the user
     */
    @objc public func rvm_getSurveyStartTime() -> Date? { getSurveyStartTime() }
}


@objc(ValidationErrorRvm) public class ValidationErrorRvm: NSObject {
    var raw: DonkeyAdsSDKKit.ValidationError
    init(raw: DonkeyAdsSDKKit.ValidationError) { self.raw = raw }

    @objc public var questionId : String { raw.questionId }

    @objc public var message : String { raw.message }

    @objc public var type : ValidationErrorTypeRvm { raw.type.toRvm() }

    @objc(ValidationErrorTypeRvm) public enum ValidationErrorTypeRvm: Int {
        case required
        case invalidFormat
        case outOfRange
    }
}

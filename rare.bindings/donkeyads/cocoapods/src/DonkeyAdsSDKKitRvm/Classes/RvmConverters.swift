import DonkeyAdsSDKKit

extension DonkeyAdsSDKKit.AdAsset.AssetType {
    func toRvm() -> AdAssetRvm.AssetTypeRvm {
        switch self {
        case .image: AdAssetRvm.AssetTypeRvm.image
        case .video: AdAssetRvm.AssetTypeRvm.video
        @unknown default: fatalError()
        }
    }
}

extension Array where Element == DonkeyAdsSDKKit.AdAsset {
    func toRvm() -> [AdAssetRvm] { map { $0.toRvm() } }
}

extension DonkeyAdsSDKKit.AdAsset {
    func toRvm() -> AdAssetRvm { AdAssetRvm(raw: self) }
}

extension Array where Element == DonkeyAdsSDKKit.Option {
    func toRvm() -> [OptionRvm] { map { OptionRvm(raw: $0) } }
}

extension DonkeyAdsSDKKit.Option {
    func toRvm() -> OptionRvm { OptionRvm(raw: self) }
}

extension DonkeyAdsSDKKit.Question {
    func toRvm() -> QuestionRvm { QuestionRvm(raw: self) }
}

extension DonkeyAdsSDKKit.Question.QuestionType {
    func toRvm() -> QuestionRvm.QuestionTypeRvm {
        switch self {
        case .text: QuestionRvm.QuestionTypeRvm.text
        case .singleChoice: QuestionRvm.QuestionTypeRvm.singleChoice
        case .multiChoice: QuestionRvm.QuestionTypeRvm.multiChoice
        case .rating: QuestionRvm.QuestionTypeRvm.rating
        case .scale: QuestionRvm.QuestionTypeRvm.scale
        @unknown default: fatalError()
        }
    }
}

extension Array where Element == DonkeyAdsSDKKit.Question {
    func toRvm() -> [QuestionRvm] { map { QuestionRvm(raw: $0) } }
}

extension Array where Element == DonkeyAdsSDKKit.Section {
    func toRvm() -> [SectionRvm] { map { SectionRvm(raw: $0) } }
}


extension Array where Element == DonkeyAdsSDKKit.SurveySummary {
    func toRvm() -> [SurveySummaryRvm] { map { SurveySummaryRvm(raw: $0) } }
}

extension SurveyThemeManager.Theme {
    func toRvm() -> SurveyThemeManagerRvm.ThemeRvm {
        switch self {
        case .light: SurveyThemeManagerRvm.ThemeRvm.light
        case .dark: SurveyThemeManagerRvm.ThemeRvm.dark
        case .auto: SurveyThemeManagerRvm.ThemeRvm.auto
        @unknown default: fatalError()
        }
    }
}

extension SurveyThemeManagerRvm.ThemeRvm {
    func toRaw() -> SurveyThemeManager.Theme {
        switch self {
        case .light: SurveyThemeManager.Theme.light
        case .dark: SurveyThemeManager.Theme.dark
        case .auto: SurveyThemeManager.Theme.auto
        @unknown default: fatalError()
        }
    }
}

extension DonkeyAdsSDKKit.ValidationError.ValidationErrorType {
    func toRvm() -> ValidationErrorRvm.ValidationErrorTypeRvm {
        switch self {
        case .required: ValidationErrorRvm.ValidationErrorTypeRvm.required
        case .invalidFormat: ValidationErrorRvm.ValidationErrorTypeRvm.invalidFormat
        case .outOfRange: ValidationErrorRvm.ValidationErrorTypeRvm.outOfRange
        @unknown default: fatalError()
        }
    }
}

extension DonkeyAdsSDKKit.Survey {
    func toRvm() -> SurveyRvm { SurveyRvm(raw: self) }
}

extension DonkeyAdsSDKKit.SurveyResponse {
    func toRvm() -> SurveyResponseRvm { SurveyResponseRvm(raw: self) }
}

extension DonkeyAdsSDKKit.SurveySummary {
    func toRvm() -> SurveySummaryRvm { SurveySummaryRvm(raw: self) }
}

extension DonkeyAdsSDKKit.AnswerState {
    func toRvm() -> AnswerStateRvm { AnswerStateRvm(raw: self) }
}


extension DonkeyAdsSDKKit.SurveyResponse.CompletionStatus {
    func toRvm() -> SurveyResponseRvm.CompletionStatusRvm {
        switch self {
        case .completed: SurveyResponseRvm.CompletionStatusRvm.completed
        case .partial: SurveyResponseRvm.CompletionStatusRvm.partial
        case .abandoned: SurveyResponseRvm.CompletionStatusRvm.abandoned
        @unknown default:
            fatalError()
        }
    }
}

extension Array where Element == DonkeyAdsSDKKit.SurveyResponse.Answer {
    func toRvm() -> [SurveyResponseRvm.AnswerRvm] { map { SurveyResponseRvm.AnswerRvm(raw: $0) } }
}

extension SurveyError {
    func toRvm() -> SurveyErrorRvm {
        let errorCode = switch(self) {
            case .networkError(_): SurveyErrorCodeRvm.networkError
            case .invalidSurveyData(_):  SurveyErrorCodeRvm.invalidSurveyData
            case .surveyNotFound(_):  SurveyErrorCodeRvm.surveyNotFound
            case .validationError(_):  SurveyErrorCodeRvm.validationError
            case .submissionFailed(_):  SurveyErrorCodeRvm.submissionFailed
            case .initializationError(_):  SurveyErrorCodeRvm.initializationError
            case .unknown(_):  SurveyErrorCodeRvm.unknown
            @unknown default: SurveyErrorCodeRvm.unknown
        }
        return NSError(domain: SurveySDKRvm.SurveyErrorDomain, code: errorCode.rawValue,
                              userInfo: [NSLocalizedDescriptionKey : self.localizedDescription,
                                         "errorCode": self.errorCode, "errorMessage": self.errorMessage ]
        )
    }
}


class SurveyLifecycleListenerProxy: SurveyLifecycleListener {
    let rvm: SurveyLifecycleListenerRvm
    init(rvm: SurveyLifecycleListenerRvm) { self.rvm = rvm }
    
    func onSurveyStarted(_ survey: DonkeyAdsSDKKit.SurveySummary) { rvm.onSurveyStarted(survey.toRvm()) }
    
    func onSurveyStepAnswered(_ survey: DonkeyAdsSDKKit.SurveySummary, _ state: DonkeyAdsSDKKit.AnswerState) {
        rvm.onSurveyStepAnswered(survey.toRvm(), state.toRvm())
    }
    
    func onSurveyCompleted(_ survey: DonkeyAdsSDKKit.SurveySummary, rewardPoints: Int, _ state: DonkeyAdsSDKKit.AnswerState) {
        rvm.onSurveyCompleted(survey.toRvm(), rewardPoints: rewardPoints, state.toRvm())
    }
    
    func onSurveyCancelled(_ survey: DonkeyAdsSDKKit.SurveySummary, _ state: DonkeyAdsSDKKit.AnswerState) {
        rvm.onSurveyCancelled(survey.toRvm(), state.toRvm())
    }
    
    func onSurveyFailed(_ survey: DonkeyAdsSDKKit.SurveySummary?, error: DonkeyAdsSDKKit.SurveyError, _ state: DonkeyAdsSDKKit.AnswerState?) {
        rvm.onSurveyFailed(survey?.toRvm(), error: error.toRvm(), state?.toRvm())
    }
}

extension SurveyLifecycleListenerRvm {
    func toRaw() -> SurveyLifecycleListener { SurveyLifecycleListenerProxy(rvm: self) }
}

class QuestionViewDelegateProxy: DonkeyAdsSDKKit.QuestionViewDelegate {
    let rvm: QuestionViewDelegateRvm
    init(rvm: QuestionViewDelegateRvm) { self.rvm = rvm }

    func questionView(_ questionView: any DonkeyAdsSDKKit.QuestionView, didUpdateAnswer answer: Any?, for questionId: String) {
        rvm.questionView(questionView as! any QuestionViewRvm as QuestionViewRvm, didUpdateAnswer: answer, for: questionId)
    }
}

extension QuestionViewDelegateRvm {
    func toRaw() -> DonkeyAdsSDKKit.QuestionViewDelegate { QuestionViewDelegateProxy(rvm: self) }
}

class DonkeyAdsDelegateProxy: DonkeyAdsSDKKit.DonkeyAdsDelegate {
    let rvm: DonkeyAdsDelegateRvm
    init(rvm: DonkeyAdsDelegateRvm) { self.rvm = rvm }

    func adsDidLoad() { rvm.adsDidLoad() }
    
    func adDidShow(_ assetId: String, impressionHash: String) { rvm.adDidShow(assetId, impressionHash: impressionHash) }
    
    func adDidClick(_ assetId: String, impressionHash: String?) { rvm.adDidClick(assetId, impressionHash: impressionHash) }
    
    func adDidClose(_ assetId: String, impressionHash: String?) { rvm.adDidClose(assetId, impressionHash: impressionHash) }
}

extension DonkeyAdsDelegateRvm {
    func toRaw() -> DonkeyAdsSDKKit.DonkeyAdsDelegate { DonkeyAdsDelegateProxy(rvm: self) }
}

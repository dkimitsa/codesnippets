//
//  ObjC stubs for not exposed classes from DonkeyAdsSDKKid
//

#ifndef DonkeyAdsSDKKidStubs_h
#define DonkeyAdsSDKKidStubs_h

#include <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#define SWIFT_RUNTIME_NAME(X) __attribute__((objc_runtime_name(X)))

SWIFT_RUNTIME_NAME("_TtC15DonkeyAdsSDKKit20SurveyViewController")
@interface  SurveyViewController : UIViewController
@end

SWIFT_RUNTIME_NAME("_TtC15DonkeyAdsSDKKit16BaseQuestionCard")
@interface BaseQuestionCard : UIView
@end

SWIFT_RUNTIME_NAME("_TtC15DonkeyAdsSDKKit23MultiChoiceQuestionView")
@interface MultiChoiceQuestionView : BaseQuestionCard
@end

SWIFT_RUNTIME_NAME("_TtC15DonkeyAdsSDKKit18RatingQuestionView")
@interface RatingQuestionView : BaseQuestionCard
@end

SWIFT_RUNTIME_NAME("_TtC15DonkeyAdsSDKKit17ScaleQuestionView")
@interface ScaleQuestionView: BaseQuestionCard
@end

SWIFT_RUNTIME_NAME("_TtC15DonkeyAdsSDKKit22SectionDescriptionView")
@interface SectionDescriptionView: UIView
@end

SWIFT_RUNTIME_NAME("_TtC15DonkeyAdsSDKKit24SingleChoiceQuestionView")
@interface SingleChoiceQuestionView : BaseQuestionCard
@end

SWIFT_RUNTIME_NAME("_TtC15DonkeyAdsSDKKit16TextQuestionView")
@interface TextQuestionView : BaseQuestionCard
@end
    

#endif /* DonkeyAdsSDKKidStubs_h */

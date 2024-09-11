//
//  unity_facade.h
//  Defines API (methods) for unity apps
//
//  LICENSE_CODE ZON

#import <Foundation/Foundation.h>
#import <brdsdk/brdsdk-Swift.h>
#import <UIKit/UIKit.h>
NS_ASSUME_NONNULL_BEGIN
API_AVAILABLE(ios(13))
@interface brdsdk_facade : NSObject
@end
NS_ASSUME_NONNULL_END

#ifdef __cplusplus
extern "C" {
#endif
API_AVAILABLE(ios(13))
typedef void (*choice_callback_function)(int choice) DEPRECATED_ATTRIBUTE;
API_AVAILABLE(ios(13))
typedef void (*on_choice_change_callback_function)(BrightAPIChoice choice);
API_AVAILABLE(ios(13))
typedef void (*empty_callback_function)(void);

struct __ConsentImageMeta;
struct __ConsentActionMeta;
struct __ConsentColors;
struct __ConsentFontsInfo;

API_AVAILABLE(ios(13))
void brdsdk_set_choice_callback(choice_callback_function _Nullable callback) DEPRECATED_ATTRIBUTE;
API_AVAILABLE(ios(13))
void brdsdk_set_on_sdk_ready_callback(empty_callback_function _Nullable callback);
API_AVAILABLE(ios(13))
void brdsdk_set_on_consent_presented_callback(empty_callback_function _Nullable callback);
API_AVAILABLE(ios(13))
void brdsdk_set_on_consent_closed_callback(empty_callback_function _Nullable callback);
API_AVAILABLE(ios(13))
void brdsdk_set_on_choice_change_callback(on_choice_change_callback_function _Nullable callback);
API_AVAILABLE(ios(13))
void brdsdk_init(const unichar *_Nullable benefit,
                 const unichar *_Nullable agree_btn,
                 const unichar *_Nullable disagree_btn,
                 const unichar *_Nullable opt_out_instructions,
                 const unichar *_Nullable appicon,
                 const unichar *_Nullable language,
                 bool skip_consent,
                 struct __ConsentColors *_Nullable colors,
                 struct __ConsentImageMeta *_Nullable background_image,
                 struct __ConsentActionMeta *_Nullable opt_in_info,
                 struct __ConsentActionMeta *_Nullable opt_out_info,
                 struct __ConsentFontsInfo *_Nullable fonts,
                 const unichar *_Nullable campaign
                 );
API_AVAILABLE(ios(13))
bool brdsdk_external_opt_in(BrightAPIChoiceTriggerType triggerType);
API_AVAILABLE(ios(13))
void brdsdk_opt_out(BrightAPIChoiceTriggerType triggerType);
API_AVAILABLE(ios(13))
bool brdsdk_show_consent(const unichar *_Nullable benefit,
                         const unichar *_Nullable agree_btn,
                         const unichar *_Nullable disagree_btn,
                         const unichar *_Nullable language,
                         const BrightAPIConsentPresentationStyle presentationStyle);
API_AVAILABLE(ios(13))
int brdsdk_get_choice(void) DEPRECATED_ATTRIBUTE;
API_AVAILABLE(ios(13))
BrightAPIChoice brdsdk_current_choice(void);
API_AVAILABLE(ios(13))
bool brdsdk_consent_shown(void) DEPRECATED_ATTRIBUTE;
API_AVAILABLE(ios(13))
void brdsdk_notify_consent_shown(void);
API_AVAILABLE(ios(13))
const char * _Nullable brdsdk_get_uuid(void);
API_AVAILABLE(ios(13))
BrightAPIAuthorizationStatus brdsdk_authorize_device(void);
#ifdef __cplusplus
}
#endif

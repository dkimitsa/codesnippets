#if 0
#elif defined(__arm64__) && __arm64__
// Generated by Apple Swift version 5.3.2 (swiftlang-1200.0.45 clang-1200.0.32.28)
#ifndef IUBENDA_SWIFT_H
#define IUBENDA_SWIFT_H
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wgcc-compat"

#if !defined(__has_include)
# define __has_include(x) 0
#endif
#if !defined(__has_attribute)
# define __has_attribute(x) 0
#endif
#if !defined(__has_feature)
# define __has_feature(x) 0
#endif
#if !defined(__has_warning)
# define __has_warning(x) 0
#endif

#if __has_include(<swift/objc-prologue.h>)
# include <swift/objc-prologue.h>
#endif

#pragma clang diagnostic ignored "-Wauto-import"
#include <Foundation/Foundation.h>
#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

#if !defined(SWIFT_TYPEDEFS)
# define SWIFT_TYPEDEFS 1
# if __has_include(<uchar.h>)
#  include <uchar.h>
# elif !defined(__cplusplus)
typedef uint_least16_t char16_t;
typedef uint_least32_t char32_t;
# endif
typedef float swift_float2  __attribute__((__ext_vector_type__(2)));
typedef float swift_float3  __attribute__((__ext_vector_type__(3)));
typedef float swift_float4  __attribute__((__ext_vector_type__(4)));
typedef double swift_double2  __attribute__((__ext_vector_type__(2)));
typedef double swift_double3  __attribute__((__ext_vector_type__(3)));
typedef double swift_double4  __attribute__((__ext_vector_type__(4)));
typedef int swift_int2  __attribute__((__ext_vector_type__(2)));
typedef int swift_int3  __attribute__((__ext_vector_type__(3)));
typedef int swift_int4  __attribute__((__ext_vector_type__(4)));
typedef unsigned int swift_uint2  __attribute__((__ext_vector_type__(2)));
typedef unsigned int swift_uint3  __attribute__((__ext_vector_type__(3)));
typedef unsigned int swift_uint4  __attribute__((__ext_vector_type__(4)));
#endif

#if !defined(SWIFT_PASTE)
# define SWIFT_PASTE_HELPER(x, y) x##y
# define SWIFT_PASTE(x, y) SWIFT_PASTE_HELPER(x, y)
#endif
#if !defined(SWIFT_METATYPE)
# define SWIFT_METATYPE(X) Class
#endif
#if !defined(SWIFT_CLASS_PROPERTY)
# if __has_feature(objc_class_property)
#  define SWIFT_CLASS_PROPERTY(...) __VA_ARGS__
# else
#  define SWIFT_CLASS_PROPERTY(...)
# endif
#endif

#if __has_attribute(objc_runtime_name)
# define SWIFT_RUNTIME_NAME(X) __attribute__((objc_runtime_name(X)))
#else
# define SWIFT_RUNTIME_NAME(X)
#endif
#if __has_attribute(swift_name)
# define SWIFT_COMPILE_NAME(X) __attribute__((swift_name(X)))
#else
# define SWIFT_COMPILE_NAME(X)
#endif
#if __has_attribute(objc_method_family)
# define SWIFT_METHOD_FAMILY(X) __attribute__((objc_method_family(X)))
#else
# define SWIFT_METHOD_FAMILY(X)
#endif
#if __has_attribute(noescape)
# define SWIFT_NOESCAPE __attribute__((noescape))
#else
# define SWIFT_NOESCAPE
#endif
#if __has_attribute(ns_consumed)
# define SWIFT_RELEASES_ARGUMENT __attribute__((ns_consumed))
#else
# define SWIFT_RELEASES_ARGUMENT
#endif
#if __has_attribute(warn_unused_result)
# define SWIFT_WARN_UNUSED_RESULT __attribute__((warn_unused_result))
#else
# define SWIFT_WARN_UNUSED_RESULT
#endif
#if __has_attribute(noreturn)
# define SWIFT_NORETURN __attribute__((noreturn))
#else
# define SWIFT_NORETURN
#endif
#if !defined(SWIFT_CLASS_EXTRA)
# define SWIFT_CLASS_EXTRA
#endif
#if !defined(SWIFT_PROTOCOL_EXTRA)
# define SWIFT_PROTOCOL_EXTRA
#endif
#if !defined(SWIFT_ENUM_EXTRA)
# define SWIFT_ENUM_EXTRA
#endif
#if !defined(SWIFT_CLASS)
# if __has_attribute(objc_subclassing_restricted)
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# else
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# endif
#endif
#if !defined(SWIFT_RESILIENT_CLASS)
# if __has_attribute(objc_class_stub)
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME) __attribute__((objc_class_stub))
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_class_stub)) SWIFT_CLASS_NAMED(SWIFT_NAME)
# else
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME)
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) SWIFT_CLASS_NAMED(SWIFT_NAME)
# endif
#endif

#if !defined(SWIFT_PROTOCOL)
# define SWIFT_PROTOCOL(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
# define SWIFT_PROTOCOL_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
#endif

#if !defined(SWIFT_EXTENSION)
# define SWIFT_EXTENSION(M) SWIFT_PASTE(M##_Swift_, __LINE__)
#endif

#if !defined(OBJC_DESIGNATED_INITIALIZER)
# if __has_attribute(objc_designated_initializer)
#  define OBJC_DESIGNATED_INITIALIZER __attribute__((objc_designated_initializer))
# else
#  define OBJC_DESIGNATED_INITIALIZER
# endif
#endif
#if !defined(SWIFT_ENUM_ATTR)
# if defined(__has_attribute) && __has_attribute(enum_extensibility)
#  define SWIFT_ENUM_ATTR(_extensibility) __attribute__((enum_extensibility(_extensibility)))
# else
#  define SWIFT_ENUM_ATTR(_extensibility)
# endif
#endif
#if !defined(SWIFT_ENUM)
# define SWIFT_ENUM(_type, _name, _extensibility) enum _name : _type _name; enum SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# if __has_feature(generalized_swift_name)
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) enum _name : _type _name SWIFT_COMPILE_NAME(SWIFT_NAME); enum SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# else
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) SWIFT_ENUM(_type, _name, _extensibility)
# endif
#endif
#if !defined(SWIFT_UNAVAILABLE)
# define SWIFT_UNAVAILABLE __attribute__((unavailable))
#endif
#if !defined(SWIFT_UNAVAILABLE_MSG)
# define SWIFT_UNAVAILABLE_MSG(msg) __attribute__((unavailable(msg)))
#endif
#if !defined(SWIFT_AVAILABILITY)
# define SWIFT_AVAILABILITY(plat, ...) __attribute__((availability(plat, __VA_ARGS__)))
#endif
#if !defined(SWIFT_WEAK_IMPORT)
# define SWIFT_WEAK_IMPORT __attribute__((weak_import))
#endif
#if !defined(SWIFT_DEPRECATED)
# define SWIFT_DEPRECATED __attribute__((deprecated))
#endif
#if !defined(SWIFT_DEPRECATED_MSG)
# define SWIFT_DEPRECATED_MSG(...) __attribute__((deprecated(__VA_ARGS__)))
#endif
#if __has_feature(attribute_diagnose_if_objc)
# define SWIFT_DEPRECATED_OBJC(Msg) __attribute__((diagnose_if(1, Msg, "warning")))
#else
# define SWIFT_DEPRECATED_OBJC(Msg) SWIFT_DEPRECATED_MSG(Msg)
#endif
#if !defined(IBSegueAction)
# define IBSegueAction
#endif
#if __has_feature(modules)
#if __has_warning("-Watimport-in-framework-header")
#pragma clang diagnostic ignored "-Watimport-in-framework-header"
#endif
@import Foundation;
@import ObjectiveC;
@import WebKit;
#endif

#pragma clang diagnostic ignored "-Wproperty-attribute-mismatch"
#pragma clang diagnostic ignored "-Wduplicate-method-arg"
#if __has_warning("-Wpragma-clang-attribute")
# pragma clang diagnostic ignored "-Wpragma-clang-attribute"
#endif
#pragma clang diagnostic ignored "-Wunknown-pragmas"
#pragma clang diagnostic ignored "-Wnullability"

#if __has_attribute(external_source_symbol)
# pragma push_macro("any")
# undef any
# pragma clang attribute push(__attribute__((external_source_symbol(language="Swift", defined_in="iubenda",generated_declaration))), apply_to=any(function,enum,objc_interface,objc_category,objc_protocol))
# pragma pop_macro("any")
#endif

typedef SWIFT_ENUM(NSInteger, BannerPosition, open) {
  BannerPositionCENTER = 0,
  BannerPositionTOP = 1,
  BannerPositionBOTTOM = 2,
};


SWIFT_PROTOCOL("_TtP7iubenda10CMPStorage_")
@protocol CMPStorage
@property (nonatomic, copy) NSString * _Nonnull consentString;
@property (nonatomic, copy) NSDate * _Nonnull consentTimestamp;
@property (nonatomic) BOOL googlePersonalized;
@property (nonatomic, copy) NSString * _Nonnull vendorConsents;
@property (nonatomic, copy) NSString * _Nonnull purposeConsents;
@property (nonatomic) NSInteger gvlVersion;
@property (nonatomic, copy) NSString * _Nonnull version;
@property (nonatomic) NSInteger id;
@property (nonatomic, copy) NSDictionary<NSString *, NSString *> * _Nonnull publisherPurposeRestrictions;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull vendorConsentsCustomUi;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull purposeConsentsCustomUi;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull specialFeatureOptinsCustomUi;
- (void)clear;
- (BOOL)isVendorConsentGivenForId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
- (BOOL)isPurposeConsentGivenForId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
@end

enum SubjectToGDPR : NSInteger;

SWIFT_CLASS("_TtC7iubenda12CMPStorageV1")
@interface CMPStorageV1 : NSObject <CMPStorage>
@property (nonatomic, copy) NSString * _Nonnull consentString;
@property (nonatomic, copy) NSDate * _Nonnull consentTimestamp;
@property (nonatomic) BOOL googlePersonalized;
@property (nonatomic, copy) NSString * _Nonnull vendorConsents;
@property (nonatomic, copy) NSString * _Nonnull purposeConsents;
@property (nonatomic) enum SubjectToGDPR subjectToGDPR;
@property (nonatomic) NSInteger gvlVersion;
@property (nonatomic, copy) NSString * _Nonnull version;
@property (nonatomic) NSInteger id;
@property (nonatomic, copy) NSDictionary<NSString *, NSString *> * _Nonnull publisherPurposeRestrictions;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull vendorConsentsCustomUi;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull purposeConsentsCustomUi;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull specialFeatureOptinsCustomUi;
- (void)clear;
- (BOOL)isVendorConsentGivenForId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
- (BOOL)isPurposeConsentGivenForId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end


typedef SWIFT_ENUM(NSInteger, GDPRApplies, open) {
  GDPRAppliesUnknown = -1,
  GDPRAppliesNo = 0,
  GDPRAppliesYes = 1,
};

@class IubendaCMPConfiguration;
@class UIViewController;
enum ATTStatus : NSInteger;

SWIFT_CLASS("_TtC7iubenda10IubendaCMP")
@interface IubendaCMP : NSObject
+ (void)initializeWith:(IubendaCMPConfiguration * _Nonnull)config;
+ (BOOL)isConsentExpired SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)expireAfter SWIFT_WARN_UNUSED_RESULT;
SWIFT_CLASS_PROPERTY(@property (nonatomic, class, readonly, strong) id <CMPStorage> _Nonnull storage;)
+ (id <CMPStorage> _Nonnull)storage SWIFT_WARN_UNUSED_RESULT;
+ (void)acceptDefaultConsent SWIFT_DEPRECATED_MSG("", "accept");
+ (void)accept;
+ (void)reject;
+ (void)showConsentPreferencesFrom:(UIViewController * _Nonnull)fromViewController SWIFT_DEPRECATED_MSG("", "openTcfPreferencesFrom:");
+ (void)openTcfPreferencesFrom:(UIViewController * _Nonnull)fromViewController;
+ (void)showCookiePolicyFrom:(UIViewController * _Nonnull)fromViewController SWIFT_DEPRECATED_MSG("", "openCookiePolicyFrom:");
+ (void)openCookiePolicyFrom:(UIViewController * _Nonnull)fromViewController;
+ (void)showVendorsPreferencesFrom:(UIViewController * _Nonnull)fromViewController SWIFT_DEPRECATED_MSG("", "openTcfVendorsPreferencesFrom:");
+ (void)openTcfVendorsPreferencesFrom:(UIViewController * _Nonnull)fromViewController;
+ (void)saveConsentWithPreferences:(NSString * _Nonnull)json timestamp:(NSDate * _Nonnull)timestamp;
+ (void)clearData;
+ (BOOL)hasConsent SWIFT_WARN_UNUSED_RESULT SWIFT_DEPRECATED_MSG("", "isConsentGiven");
+ (void)askConsentFrom:(UIViewController * _Nonnull)fromViewController;
+ (BOOL)shouldGetConsent SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)isGooglePersonalized SWIFT_WARN_UNUSED_RESULT SWIFT_DEPRECATED;
+ (BOOL)isPurposeEnabledWithId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)isConsentGiven SWIFT_WARN_UNUSED_RESULT;
+ (void)editConsentFrom:(UIViewController * _Nonnull)fromViewController SWIFT_DEPRECATED_MSG("", "openPreferencesFrom:");
+ (void)openPreferencesFrom:(UIViewController * _Nonnull)fromViewController;
+ (NSString * _Nonnull)getPreferencesJson SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)canOpenPreferences SWIFT_WARN_UNUSED_RESULT;
+ (void)requestAttConsentFrom:(UIViewController * _Nonnull)fromViewController callback:(void (^ _Nonnull)(enum ATTStatus))callback;
+ (void)getATTStatusFrom:(UIViewController * _Nonnull)fromViewController callback:(void (^ _Nonnull)(enum ATTStatus))callback;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end

typedef SWIFT_ENUM(NSInteger, ATTStatus, open) {
  ATTStatusDenied = 0,
  ATTStatusAccepted = 1,
};

@class UIColor;

SWIFT_CLASS("_TtC7iubenda23IubendaCMPConfiguration")
@interface IubendaCMPConfiguration : NSObject
@property (nonatomic, copy) NSString * _Nonnull csVersion;
@property (nonatomic) BOOL gdprEnabled;
@property (nonatomic) BOOL forceConsent;
@property (nonatomic) BOOL googleAds;
@property (nonatomic) BOOL applyStyles;
@property (nonatomic) BOOL acceptIfDismissed;
@property (nonatomic) BOOL preventDismissWhenLoaded;
@property (nonatomic) BOOL skipNoticeWhenOffline;
@property (nonatomic, copy) NSString * _Nonnull siteId;
@property (nonatomic, copy) NSString * _Nonnull cookiePolicyId;
@property (nonatomic, copy) NSString * _Nonnull cssUrl;
@property (nonatomic, copy) NSString * _Nullable cssFile;
@property (nonatomic, copy) NSString * _Nullable cssContent;
@property (nonatomic, copy) NSString * _Nullable jsonFile;
@property (nonatomic, copy) NSString * _Nullable jsonContent;
@property (nonatomic, strong) UIColor * _Nullable dismissColor;
@property (nonatomic) enum BannerPosition bannerPosition;
@property (nonatomic) NSInteger portraitWidth;
@property (nonatomic) NSInteger portraitHeight;
@property (nonatomic) NSInteger landscapeWidth;
@property (nonatomic) NSInteger landscapeHeight;
@property (nonatomic, copy) NSString * _Nonnull proxyUrl;
@property (nonatomic) BOOL automaticHandlingOfAtt;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end


@interface NSNotification (SWIFT_EXTENSION(iubenda))
SWIFT_CLASS_PROPERTY(@property (nonatomic, class, readonly) NSNotificationName _Nonnull ConsentChanged;)
+ (NSNotificationName _Nonnull)ConsentChanged SWIFT_WARN_UNUSED_RESULT;
@end

@class TCF2Data;

SWIFT_CLASS("_TtC7iubenda11Preferences")
@interface Preferences : NSObject
@property (nonatomic) BOOL consent;
@property (nonatomic) BOOL gdprApplies;
@property (nonatomic) BOOL googleAdsPersonalized;
@property (nonatomic, copy) NSString * _Nullable tcf;
@property (nonatomic, copy) NSString * _Nullable tcfv2;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nullable purposes;
@property (nonatomic, strong) TCF2Data * _Nullable tcfv2InAppTCData;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

typedef SWIFT_ENUM(NSInteger, SubjectToGDPR, open) {
  SubjectToGDPRUnknown = -1,
  SubjectToGDPRNo = 0,
  SubjectToGDPRYes = 1,
};

@class TCF2DataConsents;

SWIFT_CLASS("_TtC7iubenda8TCF2Data")
@interface TCF2Data : NSObject
@property (nonatomic, copy) NSString * _Nonnull tcString;
@property (nonatomic) NSInteger tcfPolicyVersion;
@property (nonatomic) NSInteger cmpId;
@property (nonatomic) NSInteger cmpVersion;
@property (nonatomic) enum GDPRApplies gdprApplies;
@property (nonatomic) BOOL useNonStandardStacks;
@property (nonatomic) BOOL purposeOneTreatment;
@property (nonatomic, copy) NSString * _Nonnull publisherCC;
@property (nonatomic, strong) TCF2DataConsents * _Nullable vendor;
@property (nonatomic, strong) TCF2DataConsents * _Nullable purpose;
@property (nonatomic, copy) NSString * _Nonnull specialFeatureOptins;
@property (nonatomic, strong) TCF2DataConsents * _Nullable publisher;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end


SWIFT_CLASS("_TtC7iubenda16TCF2DataConsents")
@interface TCF2DataConsents : NSObject
@property (nonatomic, copy) NSString * _Nonnull consents;
@property (nonatomic, copy) NSString * _Nonnull legitimateInterests;
@property (nonatomic, strong) TCF2DataConsents * _Nullable customPurpose;
@property (nonatomic, copy) NSDictionary<NSString *, NSString *> * _Nullable restrictions;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end



SWIFT_CLASS("_TtC7iubenda15UserPreferences")
@interface UserPreferences : NSObject
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end

@protocol WebViewControllerDelegate;
@class WKUserContentController;
@class WKScriptMessage;
@class WKWebView;
@class WKNavigationAction;
@class WKWebViewConfiguration;
@class WKWindowFeatures;
@class WKNavigationResponse;
@class WKNavigation;

SWIFT_CLASS("_TtC7iubenda17WebViewController")
@interface WebViewController : NSObject <WKNavigationDelegate, WKScriptMessageHandler, WKUIDelegate>
@property (nonatomic, weak) id <WebViewControllerDelegate> _Nullable delegate;
- (void)userContentController:(WKUserContentController * _Nonnull)userContentController didReceiveScriptMessage:(WKScriptMessage * _Nonnull)message;
- (void)webView:(WKWebView * _Nonnull)webView decidePolicyForNavigationAction:(WKNavigationAction * _Nonnull)navigationAction decisionHandler:(void (^ _Nonnull)(WKNavigationActionPolicy))decisionHandler;
- (WKWebView * _Nullable)webView:(WKWebView * _Nonnull)webView createWebViewWithConfiguration:(WKWebViewConfiguration * _Nonnull)configuration forNavigationAction:(WKNavigationAction * _Nonnull)navigationAction windowFeatures:(WKWindowFeatures * _Nonnull)windowFeatures SWIFT_WARN_UNUSED_RESULT;
- (void)webView:(WKWebView * _Nonnull)webView decidePolicyForNavigationResponse:(WKNavigationResponse * _Nonnull)navigationResponse decisionHandler:(void (^ _Nonnull)(WKNavigationResponsePolicy))decisionHandler;
- (void)webView:(WKWebView * _Nonnull)webView didStartProvisionalNavigation:(WKNavigation * _Null_unspecified)navigation;
- (void)webView:(WKWebView * _Nonnull)webView didFinishNavigation:(WKNavigation * _Null_unspecified)navigation;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end


SWIFT_PROTOCOL("_TtP7iubenda25WebViewControllerDelegate_")
@protocol WebViewControllerDelegate
- (void)receivedConsentWithPreferences:(NSString * _Nonnull)preferences;
- (void)onErrorWithUrl:(NSURL * _Nullable)url;
- (void)openLinkWithUrl:(NSString * _Nonnull)url;
- (BOOL)openExternalLinkWithUrl:(NSURL * _Nonnull)url SWIFT_WARN_UNUSED_RESULT;
- (void)onLargePopup;
- (void)onSmallPopup;
- (void)onCSReady;
- (void)onNavigationStart;
- (void)onNavigationFinish;
@end

#if __has_attribute(external_source_symbol)
# pragma clang attribute pop
#endif
#pragma clang diagnostic pop
#endif

#elif defined(__ARM_ARCH_7A__) && __ARM_ARCH_7A__
// Generated by Apple Swift version 5.3.2 (swiftlang-1200.0.45 clang-1200.0.32.28)
#ifndef IUBENDA_SWIFT_H
#define IUBENDA_SWIFT_H
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wgcc-compat"

#if !defined(__has_include)
# define __has_include(x) 0
#endif
#if !defined(__has_attribute)
# define __has_attribute(x) 0
#endif
#if !defined(__has_feature)
# define __has_feature(x) 0
#endif
#if !defined(__has_warning)
# define __has_warning(x) 0
#endif

#if __has_include(<swift/objc-prologue.h>)
# include <swift/objc-prologue.h>
#endif

#pragma clang diagnostic ignored "-Wauto-import"
#include <Foundation/Foundation.h>
#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

#if !defined(SWIFT_TYPEDEFS)
# define SWIFT_TYPEDEFS 1
# if __has_include(<uchar.h>)
#  include <uchar.h>
# elif !defined(__cplusplus)
typedef uint_least16_t char16_t;
typedef uint_least32_t char32_t;
# endif
typedef float swift_float2  __attribute__((__ext_vector_type__(2)));
typedef float swift_float3  __attribute__((__ext_vector_type__(3)));
typedef float swift_float4  __attribute__((__ext_vector_type__(4)));
typedef double swift_double2  __attribute__((__ext_vector_type__(2)));
typedef double swift_double3  __attribute__((__ext_vector_type__(3)));
typedef double swift_double4  __attribute__((__ext_vector_type__(4)));
typedef int swift_int2  __attribute__((__ext_vector_type__(2)));
typedef int swift_int3  __attribute__((__ext_vector_type__(3)));
typedef int swift_int4  __attribute__((__ext_vector_type__(4)));
typedef unsigned int swift_uint2  __attribute__((__ext_vector_type__(2)));
typedef unsigned int swift_uint3  __attribute__((__ext_vector_type__(3)));
typedef unsigned int swift_uint4  __attribute__((__ext_vector_type__(4)));
#endif

#if !defined(SWIFT_PASTE)
# define SWIFT_PASTE_HELPER(x, y) x##y
# define SWIFT_PASTE(x, y) SWIFT_PASTE_HELPER(x, y)
#endif
#if !defined(SWIFT_METATYPE)
# define SWIFT_METATYPE(X) Class
#endif
#if !defined(SWIFT_CLASS_PROPERTY)
# if __has_feature(objc_class_property)
#  define SWIFT_CLASS_PROPERTY(...) __VA_ARGS__
# else
#  define SWIFT_CLASS_PROPERTY(...)
# endif
#endif

#if __has_attribute(objc_runtime_name)
# define SWIFT_RUNTIME_NAME(X) __attribute__((objc_runtime_name(X)))
#else
# define SWIFT_RUNTIME_NAME(X)
#endif
#if __has_attribute(swift_name)
# define SWIFT_COMPILE_NAME(X) __attribute__((swift_name(X)))
#else
# define SWIFT_COMPILE_NAME(X)
#endif
#if __has_attribute(objc_method_family)
# define SWIFT_METHOD_FAMILY(X) __attribute__((objc_method_family(X)))
#else
# define SWIFT_METHOD_FAMILY(X)
#endif
#if __has_attribute(noescape)
# define SWIFT_NOESCAPE __attribute__((noescape))
#else
# define SWIFT_NOESCAPE
#endif
#if __has_attribute(ns_consumed)
# define SWIFT_RELEASES_ARGUMENT __attribute__((ns_consumed))
#else
# define SWIFT_RELEASES_ARGUMENT
#endif
#if __has_attribute(warn_unused_result)
# define SWIFT_WARN_UNUSED_RESULT __attribute__((warn_unused_result))
#else
# define SWIFT_WARN_UNUSED_RESULT
#endif
#if __has_attribute(noreturn)
# define SWIFT_NORETURN __attribute__((noreturn))
#else
# define SWIFT_NORETURN
#endif
#if !defined(SWIFT_CLASS_EXTRA)
# define SWIFT_CLASS_EXTRA
#endif
#if !defined(SWIFT_PROTOCOL_EXTRA)
# define SWIFT_PROTOCOL_EXTRA
#endif
#if !defined(SWIFT_ENUM_EXTRA)
# define SWIFT_ENUM_EXTRA
#endif
#if !defined(SWIFT_CLASS)
# if __has_attribute(objc_subclassing_restricted)
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_subclassing_restricted)) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# else
#  define SWIFT_CLASS(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
#  define SWIFT_CLASS_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_CLASS_EXTRA
# endif
#endif
#if !defined(SWIFT_RESILIENT_CLASS)
# if __has_attribute(objc_class_stub)
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME) __attribute__((objc_class_stub))
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) __attribute__((objc_class_stub)) SWIFT_CLASS_NAMED(SWIFT_NAME)
# else
#  define SWIFT_RESILIENT_CLASS(SWIFT_NAME) SWIFT_CLASS(SWIFT_NAME)
#  define SWIFT_RESILIENT_CLASS_NAMED(SWIFT_NAME) SWIFT_CLASS_NAMED(SWIFT_NAME)
# endif
#endif

#if !defined(SWIFT_PROTOCOL)
# define SWIFT_PROTOCOL(SWIFT_NAME) SWIFT_RUNTIME_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
# define SWIFT_PROTOCOL_NAMED(SWIFT_NAME) SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_PROTOCOL_EXTRA
#endif

#if !defined(SWIFT_EXTENSION)
# define SWIFT_EXTENSION(M) SWIFT_PASTE(M##_Swift_, __LINE__)
#endif

#if !defined(OBJC_DESIGNATED_INITIALIZER)
# if __has_attribute(objc_designated_initializer)
#  define OBJC_DESIGNATED_INITIALIZER __attribute__((objc_designated_initializer))
# else
#  define OBJC_DESIGNATED_INITIALIZER
# endif
#endif
#if !defined(SWIFT_ENUM_ATTR)
# if defined(__has_attribute) && __has_attribute(enum_extensibility)
#  define SWIFT_ENUM_ATTR(_extensibility) __attribute__((enum_extensibility(_extensibility)))
# else
#  define SWIFT_ENUM_ATTR(_extensibility)
# endif
#endif
#if !defined(SWIFT_ENUM)
# define SWIFT_ENUM(_type, _name, _extensibility) enum _name : _type _name; enum SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# if __has_feature(generalized_swift_name)
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) enum _name : _type _name SWIFT_COMPILE_NAME(SWIFT_NAME); enum SWIFT_COMPILE_NAME(SWIFT_NAME) SWIFT_ENUM_ATTR(_extensibility) SWIFT_ENUM_EXTRA _name : _type
# else
#  define SWIFT_ENUM_NAMED(_type, _name, SWIFT_NAME, _extensibility) SWIFT_ENUM(_type, _name, _extensibility)
# endif
#endif
#if !defined(SWIFT_UNAVAILABLE)
# define SWIFT_UNAVAILABLE __attribute__((unavailable))
#endif
#if !defined(SWIFT_UNAVAILABLE_MSG)
# define SWIFT_UNAVAILABLE_MSG(msg) __attribute__((unavailable(msg)))
#endif
#if !defined(SWIFT_AVAILABILITY)
# define SWIFT_AVAILABILITY(plat, ...) __attribute__((availability(plat, __VA_ARGS__)))
#endif
#if !defined(SWIFT_WEAK_IMPORT)
# define SWIFT_WEAK_IMPORT __attribute__((weak_import))
#endif
#if !defined(SWIFT_DEPRECATED)
# define SWIFT_DEPRECATED __attribute__((deprecated))
#endif
#if !defined(SWIFT_DEPRECATED_MSG)
# define SWIFT_DEPRECATED_MSG(...) __attribute__((deprecated(__VA_ARGS__)))
#endif
#if __has_feature(attribute_diagnose_if_objc)
# define SWIFT_DEPRECATED_OBJC(Msg) __attribute__((diagnose_if(1, Msg, "warning")))
#else
# define SWIFT_DEPRECATED_OBJC(Msg) SWIFT_DEPRECATED_MSG(Msg)
#endif
#if !defined(IBSegueAction)
# define IBSegueAction
#endif
#if __has_feature(modules)
#if __has_warning("-Watimport-in-framework-header")
#pragma clang diagnostic ignored "-Watimport-in-framework-header"
#endif
@import Foundation;
@import ObjectiveC;
@import WebKit;
#endif

#pragma clang diagnostic ignored "-Wproperty-attribute-mismatch"
#pragma clang diagnostic ignored "-Wduplicate-method-arg"
#if __has_warning("-Wpragma-clang-attribute")
# pragma clang diagnostic ignored "-Wpragma-clang-attribute"
#endif
#pragma clang diagnostic ignored "-Wunknown-pragmas"
#pragma clang diagnostic ignored "-Wnullability"

#if __has_attribute(external_source_symbol)
# pragma push_macro("any")
# undef any
# pragma clang attribute push(__attribute__((external_source_symbol(language="Swift", defined_in="iubenda",generated_declaration))), apply_to=any(function,enum,objc_interface,objc_category,objc_protocol))
# pragma pop_macro("any")
#endif

typedef SWIFT_ENUM(NSInteger, BannerPosition, open) {
  BannerPositionCENTER = 0,
  BannerPositionTOP = 1,
  BannerPositionBOTTOM = 2,
};


SWIFT_PROTOCOL("_TtP7iubenda10CMPStorage_")
@protocol CMPStorage
@property (nonatomic, copy) NSString * _Nonnull consentString;
@property (nonatomic, copy) NSDate * _Nonnull consentTimestamp;
@property (nonatomic) BOOL googlePersonalized;
@property (nonatomic, copy) NSString * _Nonnull vendorConsents;
@property (nonatomic, copy) NSString * _Nonnull purposeConsents;
@property (nonatomic) NSInteger gvlVersion;
@property (nonatomic, copy) NSString * _Nonnull version;
@property (nonatomic) NSInteger id;
@property (nonatomic, copy) NSDictionary<NSString *, NSString *> * _Nonnull publisherPurposeRestrictions;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull vendorConsentsCustomUi;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull purposeConsentsCustomUi;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull specialFeatureOptinsCustomUi;
- (void)clear;
- (BOOL)isVendorConsentGivenForId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
- (BOOL)isPurposeConsentGivenForId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
@end

enum SubjectToGDPR : NSInteger;

SWIFT_CLASS("_TtC7iubenda12CMPStorageV1")
@interface CMPStorageV1 : NSObject <CMPStorage>
@property (nonatomic, copy) NSString * _Nonnull consentString;
@property (nonatomic, copy) NSDate * _Nonnull consentTimestamp;
@property (nonatomic) BOOL googlePersonalized;
@property (nonatomic, copy) NSString * _Nonnull vendorConsents;
@property (nonatomic, copy) NSString * _Nonnull purposeConsents;
@property (nonatomic) enum SubjectToGDPR subjectToGDPR;
@property (nonatomic) NSInteger gvlVersion;
@property (nonatomic, copy) NSString * _Nonnull version;
@property (nonatomic) NSInteger id;
@property (nonatomic, copy) NSDictionary<NSString *, NSString *> * _Nonnull publisherPurposeRestrictions;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull vendorConsentsCustomUi;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull purposeConsentsCustomUi;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nonnull specialFeatureOptinsCustomUi;
- (void)clear;
- (BOOL)isVendorConsentGivenForId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
- (BOOL)isPurposeConsentGivenForId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end


typedef SWIFT_ENUM(NSInteger, GDPRApplies, open) {
  GDPRAppliesUnknown = -1,
  GDPRAppliesNo = 0,
  GDPRAppliesYes = 1,
};

@class IubendaCMPConfiguration;
@class UIViewController;
enum ATTStatus : NSInteger;

SWIFT_CLASS("_TtC7iubenda10IubendaCMP")
@interface IubendaCMP : NSObject
+ (void)initializeWith:(IubendaCMPConfiguration * _Nonnull)config;
+ (BOOL)isConsentExpired SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)expireAfter SWIFT_WARN_UNUSED_RESULT;
SWIFT_CLASS_PROPERTY(@property (nonatomic, class, readonly, strong) id <CMPStorage> _Nonnull storage;)
+ (id <CMPStorage> _Nonnull)storage SWIFT_WARN_UNUSED_RESULT;
+ (void)acceptDefaultConsent SWIFT_DEPRECATED_MSG("", "accept");
+ (void)accept;
+ (void)reject;
+ (void)showConsentPreferencesFrom:(UIViewController * _Nonnull)fromViewController SWIFT_DEPRECATED_MSG("", "openTcfPreferencesFrom:");
+ (void)openTcfPreferencesFrom:(UIViewController * _Nonnull)fromViewController;
+ (void)showCookiePolicyFrom:(UIViewController * _Nonnull)fromViewController SWIFT_DEPRECATED_MSG("", "openCookiePolicyFrom:");
+ (void)openCookiePolicyFrom:(UIViewController * _Nonnull)fromViewController;
+ (void)showVendorsPreferencesFrom:(UIViewController * _Nonnull)fromViewController SWIFT_DEPRECATED_MSG("", "openTcfVendorsPreferencesFrom:");
+ (void)openTcfVendorsPreferencesFrom:(UIViewController * _Nonnull)fromViewController;
+ (void)saveConsentWithPreferences:(NSString * _Nonnull)json timestamp:(NSDate * _Nonnull)timestamp;
+ (void)clearData;
+ (BOOL)hasConsent SWIFT_WARN_UNUSED_RESULT SWIFT_DEPRECATED_MSG("", "isConsentGiven");
+ (void)askConsentFrom:(UIViewController * _Nonnull)fromViewController;
+ (BOOL)shouldGetConsent SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)isGooglePersonalized SWIFT_WARN_UNUSED_RESULT SWIFT_DEPRECATED;
+ (BOOL)isPurposeEnabledWithId:(NSInteger)id SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)isConsentGiven SWIFT_WARN_UNUSED_RESULT;
+ (void)editConsentFrom:(UIViewController * _Nonnull)fromViewController SWIFT_DEPRECATED_MSG("", "openPreferencesFrom:");
+ (void)openPreferencesFrom:(UIViewController * _Nonnull)fromViewController;
+ (NSString * _Nonnull)getPreferencesJson SWIFT_WARN_UNUSED_RESULT;
+ (BOOL)canOpenPreferences SWIFT_WARN_UNUSED_RESULT;
+ (void)requestAttConsentFrom:(UIViewController * _Nonnull)fromViewController callback:(void (^ _Nonnull)(enum ATTStatus))callback;
+ (void)getATTStatusFrom:(UIViewController * _Nonnull)fromViewController callback:(void (^ _Nonnull)(enum ATTStatus))callback;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end

typedef SWIFT_ENUM(NSInteger, ATTStatus, open) {
  ATTStatusDenied = 0,
  ATTStatusAccepted = 1,
};

@class UIColor;

SWIFT_CLASS("_TtC7iubenda23IubendaCMPConfiguration")
@interface IubendaCMPConfiguration : NSObject
@property (nonatomic, copy) NSString * _Nonnull csVersion;
@property (nonatomic) BOOL gdprEnabled;
@property (nonatomic) BOOL forceConsent;
@property (nonatomic) BOOL googleAds;
@property (nonatomic) BOOL applyStyles;
@property (nonatomic) BOOL acceptIfDismissed;
@property (nonatomic) BOOL preventDismissWhenLoaded;
@property (nonatomic) BOOL skipNoticeWhenOffline;
@property (nonatomic, copy) NSString * _Nonnull siteId;
@property (nonatomic, copy) NSString * _Nonnull cookiePolicyId;
@property (nonatomic, copy) NSString * _Nonnull cssUrl;
@property (nonatomic, copy) NSString * _Nullable cssFile;
@property (nonatomic, copy) NSString * _Nullable cssContent;
@property (nonatomic, copy) NSString * _Nullable jsonFile;
@property (nonatomic, copy) NSString * _Nullable jsonContent;
@property (nonatomic, strong) UIColor * _Nullable dismissColor;
@property (nonatomic) enum BannerPosition bannerPosition;
@property (nonatomic) NSInteger portraitWidth;
@property (nonatomic) NSInteger portraitHeight;
@property (nonatomic) NSInteger landscapeWidth;
@property (nonatomic) NSInteger landscapeHeight;
@property (nonatomic, copy) NSString * _Nonnull proxyUrl;
@property (nonatomic) BOOL automaticHandlingOfAtt;
@property (nonatomic, readonly, copy) NSString * _Nonnull description;
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end


@interface NSNotification (SWIFT_EXTENSION(iubenda))
SWIFT_CLASS_PROPERTY(@property (nonatomic, class, readonly) NSNotificationName _Nonnull ConsentChanged;)
+ (NSNotificationName _Nonnull)ConsentChanged SWIFT_WARN_UNUSED_RESULT;
@end

@class TCF2Data;

SWIFT_CLASS("_TtC7iubenda11Preferences")
@interface Preferences : NSObject
@property (nonatomic) BOOL consent;
@property (nonatomic) BOOL gdprApplies;
@property (nonatomic) BOOL googleAdsPersonalized;
@property (nonatomic, copy) NSString * _Nullable tcf;
@property (nonatomic, copy) NSString * _Nullable tcfv2;
@property (nonatomic, copy) NSDictionary<NSString *, NSNumber *> * _Nullable purposes;
@property (nonatomic, strong) TCF2Data * _Nullable tcfv2InAppTCData;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end

typedef SWIFT_ENUM(NSInteger, SubjectToGDPR, open) {
  SubjectToGDPRUnknown = -1,
  SubjectToGDPRNo = 0,
  SubjectToGDPRYes = 1,
};

@class TCF2DataConsents;

SWIFT_CLASS("_TtC7iubenda8TCF2Data")
@interface TCF2Data : NSObject
@property (nonatomic, copy) NSString * _Nonnull tcString;
@property (nonatomic) NSInteger tcfPolicyVersion;
@property (nonatomic) NSInteger cmpId;
@property (nonatomic) NSInteger cmpVersion;
@property (nonatomic) enum GDPRApplies gdprApplies;
@property (nonatomic) BOOL useNonStandardStacks;
@property (nonatomic) BOOL purposeOneTreatment;
@property (nonatomic, copy) NSString * _Nonnull publisherCC;
@property (nonatomic, strong) TCF2DataConsents * _Nullable vendor;
@property (nonatomic, strong) TCF2DataConsents * _Nullable purpose;
@property (nonatomic, copy) NSString * _Nonnull specialFeatureOptins;
@property (nonatomic, strong) TCF2DataConsents * _Nullable publisher;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end


SWIFT_CLASS("_TtC7iubenda16TCF2DataConsents")
@interface TCF2DataConsents : NSObject
@property (nonatomic, copy) NSString * _Nonnull consents;
@property (nonatomic, copy) NSString * _Nonnull legitimateInterests;
@property (nonatomic, strong) TCF2DataConsents * _Nullable customPurpose;
@property (nonatomic, copy) NSDictionary<NSString *, NSString *> * _Nullable restrictions;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end



SWIFT_CLASS("_TtC7iubenda15UserPreferences")
@interface UserPreferences : NSObject
- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;
@end

@protocol WebViewControllerDelegate;
@class WKUserContentController;
@class WKScriptMessage;
@class WKWebView;
@class WKNavigationAction;
@class WKWebViewConfiguration;
@class WKWindowFeatures;
@class WKNavigationResponse;
@class WKNavigation;

SWIFT_CLASS("_TtC7iubenda17WebViewController")
@interface WebViewController : NSObject <WKNavigationDelegate, WKScriptMessageHandler, WKUIDelegate>
@property (nonatomic, weak) id <WebViewControllerDelegate> _Nullable delegate;
- (void)userContentController:(WKUserContentController * _Nonnull)userContentController didReceiveScriptMessage:(WKScriptMessage * _Nonnull)message;
- (void)webView:(WKWebView * _Nonnull)webView decidePolicyForNavigationAction:(WKNavigationAction * _Nonnull)navigationAction decisionHandler:(void (^ _Nonnull)(WKNavigationActionPolicy))decisionHandler;
- (WKWebView * _Nullable)webView:(WKWebView * _Nonnull)webView createWebViewWithConfiguration:(WKWebViewConfiguration * _Nonnull)configuration forNavigationAction:(WKNavigationAction * _Nonnull)navigationAction windowFeatures:(WKWindowFeatures * _Nonnull)windowFeatures SWIFT_WARN_UNUSED_RESULT;
- (void)webView:(WKWebView * _Nonnull)webView decidePolicyForNavigationResponse:(WKNavigationResponse * _Nonnull)navigationResponse decisionHandler:(void (^ _Nonnull)(WKNavigationResponsePolicy))decisionHandler;
- (void)webView:(WKWebView * _Nonnull)webView didStartProvisionalNavigation:(WKNavigation * _Null_unspecified)navigation;
- (void)webView:(WKWebView * _Nonnull)webView didFinishNavigation:(WKNavigation * _Null_unspecified)navigation;
- (nonnull instancetype)init SWIFT_UNAVAILABLE;
+ (nonnull instancetype)new SWIFT_UNAVAILABLE_MSG("-init is unavailable");
@end


SWIFT_PROTOCOL("_TtP7iubenda25WebViewControllerDelegate_")
@protocol WebViewControllerDelegate
- (void)receivedConsentWithPreferences:(NSString * _Nonnull)preferences;
- (void)onErrorWithUrl:(NSURL * _Nullable)url;
- (void)openLinkWithUrl:(NSString * _Nonnull)url;
- (BOOL)openExternalLinkWithUrl:(NSURL * _Nonnull)url SWIFT_WARN_UNUSED_RESULT;
- (void)onLargePopup;
- (void)onSmallPopup;
- (void)onCSReady;
- (void)onNavigationStart;
- (void)onNavigationFinish;
@end

#if __has_attribute(external_source_symbol)
# pragma clang attribute pop
#endif
#pragma clang diagnostic pop
#endif

#endif

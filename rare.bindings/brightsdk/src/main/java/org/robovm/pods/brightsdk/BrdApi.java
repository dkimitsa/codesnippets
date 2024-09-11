/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.brightsdk;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("brdsdk.brd_api")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BrdApi/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BrdApiPtr extends Ptr<BrdApi, BrdApiPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BrdApi.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BrdApi() {}
    protected BrdApi(Handle h, long handle) { super(h, handle); }
    protected BrdApi(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBenefit:agree_btn:disagree_btn:opt_out_instructions:appicon:cwd:sys_app_id:language:colors:background_image:opt_in_info:opt_out_info:fonts:skip_consent:campaign:error:on_choice_change:")
    public BrdApi(String benefit, String agree_btn, String disagree_btn, String opt_out_instructions, UIImage appicon, NSURL _cwd, String sys_app_id, String language, ColorSettings colors, ConsentBackgroundImage background_image, ConsentActionInfo opt_in_info, ConsentActionInfo opt_out_info, ConsentFontsInfo fonts, boolean skip_consent, String campaign, NSError.NSErrorPtr error, @Block("(@MachineSizedSInt)") VoidBlock1<Long> on_choice_change) { super((SkipInit) null); initObject(init(benefit, agree_btn, disagree_btn, opt_out_instructions, appicon, _cwd, sys_app_id, language, colors, background_image, opt_in_info, opt_out_info, fonts, skip_consent, campaign, error, on_choice_change)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBenefit:agree_btn:disagree_btn:opt_out_instructions:appicon:cwd:sys_app_id:language:colors:background_image:opt_in_info:opt_out_info:fonts:skip_consent:campaign:error:on_choice_change:")
    protected native @Pointer long init(String benefit, String agree_btn, String disagree_btn, String opt_out_instructions, UIImage appicon, NSURL _cwd, String sys_app_id, String language, ColorSettings colors, ConsentBackgroundImage background_image, ConsentActionInfo opt_in_info, ConsentActionInfo opt_out_info, ConsentFontsInfo fonts, boolean skip_consent, String campaign, NSError.NSErrorPtr error, @Block("(@MachineSizedSInt)") VoidBlock1<Long> on_choice_change);
    @Method(selector = "onConsentPresented")
    public static native @Block Runnable onConsentPresented();
    @Method(selector = "setOnConsentPresented:")
    public static native void setOnConsentPresented(@Block Runnable value);
    @Method(selector = "onConsentClosed")
    public static native @Block Runnable onConsentClosed();
    @Method(selector = "setOnConsentClosed:")
    public static native void setOnConsentClosed(@Block Runnable value);
    @Method(selector = "onSDKReady")
    public static native @Block Runnable onSDKReady();
    @Method(selector = "setOnSDKReady:")
    public static native void setOnSDKReady(@Block Runnable value);
    @Method(selector = "onChoiceChange")
    public static native @Block VoidBlock1<BrightAPIChoice> onChoiceChange(BrightAPIChoice p0);
    @Method(selector = "setOnChoiceChange:")
    public static native void setOnChoiceChange(@Block VoidBlock1<BrightAPIChoice> value);
    @Method(selector = "currentLanguage")
    public static native NSLocale currentLanguage();
    @Method(selector = "setCurrentLanguage:")
    public static native void setCurrentLanguage(NSLocale value);
    @Method(selector = "currentChoice")
    public static native BrightAPIChoice currentChoice();
    @Method(selector = "get_uuid")
    public static native String getUuid();
    @Method(selector = "supportedLanguages")
    public static native NSArray<NSLocale> supportedLanguages();
    @Method(selector = "optOutFrom:")
    public static native void optOutFrom(BrightAPIChoiceTriggerType triggerType);
    public static boolean externalOptIn(BrightAPIChoiceTriggerType triggerType) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = externalOptIn(triggerType, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "externalOptInFrom:error:")
    private static native boolean externalOptIn(BrightAPIChoiceTriggerType triggerType, NSError.NSErrorPtr error);
    @Method(selector = "notifyConsentShown")
    public static native void notifyConsentShown();
    @Method(selector = "authorizeDevice")
    public static native BrightAPIAuthorizationStatus authorizeDevice();
    @Method(selector = "show_consent:benefit:agree_btn:disagree_btn:language:presentationStyle:")
    public static native boolean showConsent(UIViewController parent, String benefit, String agree_btn, String disagree_btn, String language, BrightAPIConsentPresentationStyle presentationStyle);
    /**
     * @deprecated This method will be removed in a future version.
     */
    @Deprecated
    @Method(selector = "clear_choice")
    public static native void clearChoice();
    /**
     * @deprecated Will be removed in a future version.. Use currentChoice
     */
    @Deprecated
    @Method(selector = "get_choice")
    public static native @MachineSizedSInt long getChoice();
    /**
     * @deprecated Will be removed in a future version.. Use notifyConsentShown
     */
    @Deprecated
    @Method(selector = "consent_shown")
    public static native boolean isConsentShown();
    /**
     * @deprecated Will be removed in a future version.. Use externalOptInFrom:error:
     */
    @Deprecated
    public static boolean externalOptInAndReturn() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = externalOptInAndReturn(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @deprecated Will be removed in a future version.. Use externalOptInFrom:error:
     */
    @Deprecated
    @Method(selector = "external_opt_inAndReturnError:")
    private static native boolean externalOptInAndReturn(NSError.NSErrorPtr error);
    /**
     * @deprecated Will be removed in a future version.. Use optOutFrom:
     */
    @Deprecated
    @Method(selector = "opt_out")
    public static native void optOut();
    /*</methods>*/
}

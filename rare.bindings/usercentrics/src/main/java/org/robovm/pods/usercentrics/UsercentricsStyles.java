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
package org.robovm.pods.usercentrics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UsercentricsUsercentricsStyles")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsStyles/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsStylesPtr extends Ptr<UsercentricsStyles, UsercentricsStylesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsStyles.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsStyles() {}
    protected UsercentricsStyles(Handle h, long handle) { super(h, handle); }
    protected UsercentricsStyles(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBtnPrivacyButtonInactiveSize:historyDateFormat:btnPrivacyButtonActiveSize:txtOptInMsgFontSize:btnPrivacyButtonTransparency:btnPrivacyButtonBgColor:btnAcceptTextColor:btnDenyTextColor:txtOptInMsgColor:btnMoreInfoBgColor:btnMoreInfoTextColor:btnAcceptBgColor:btnDenyBgColor:linkColor:cornerModalHeaderBgColor:cornerModalHeaderTextColor:privacyModalHeaderBgColor:privacyModalHeaderTextColor:bannerBgColor:bannerTextColor:btnPrivacyButtonTextColor:modalSaveTextColor:modalSaveBgColor:chipTextColor:chipBgColor:")
    public UsercentricsStyles(UsercentricsInt btnPrivacyButtonInactiveSize, UsercentricsInt historyDateFormat, UsercentricsInt btnPrivacyButtonActiveSize, UsercentricsInt txtOptInMsgFontSize, UsercentricsInt btnPrivacyButtonTransparency, String btnPrivacyButtonBgColor, String btnAcceptTextColor, String btnDenyTextColor, String txtOptInMsgColor, String btnMoreInfoBgColor, String btnMoreInfoTextColor, String btnAcceptBgColor, String btnDenyBgColor, String linkColor, String cornerModalHeaderBgColor, String cornerModalHeaderTextColor, String privacyModalHeaderBgColor, String privacyModalHeaderTextColor, String bannerBgColor, String bannerTextColor, String btnPrivacyButtonTextColor, String modalSaveTextColor, String modalSaveBgColor, String chipTextColor, String chipBgColor) { super((SkipInit) null); initObject(init(btnPrivacyButtonInactiveSize, historyDateFormat, btnPrivacyButtonActiveSize, txtOptInMsgFontSize, btnPrivacyButtonTransparency, btnPrivacyButtonBgColor, btnAcceptTextColor, btnDenyTextColor, txtOptInMsgColor, btnMoreInfoBgColor, btnMoreInfoTextColor, btnAcceptBgColor, btnDenyBgColor, linkColor, cornerModalHeaderBgColor, cornerModalHeaderTextColor, privacyModalHeaderBgColor, privacyModalHeaderTextColor, bannerBgColor, bannerTextColor, btnPrivacyButtonTextColor, modalSaveTextColor, modalSaveBgColor, chipTextColor, chipBgColor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bannerBgColor")
    public native String getBannerBgColor();
    @Property(selector = "bannerTextColor")
    public native String getBannerTextColor();
    @Property(selector = "btnAcceptBgColor")
    public native String getBtnAcceptBgColor();
    @Property(selector = "btnAcceptTextColor")
    public native String getBtnAcceptTextColor();
    @Property(selector = "btnDenyBgColor")
    public native String getBtnDenyBgColor();
    @Property(selector = "btnDenyTextColor")
    public native String getBtnDenyTextColor();
    @Property(selector = "btnMoreInfoBgColor")
    public native String getBtnMoreInfoBgColor();
    @Property(selector = "btnMoreInfoTextColor")
    public native String getBtnMoreInfoTextColor();
    @Property(selector = "btnPrivacyButtonActiveSize")
    public native UsercentricsInt getBtnPrivacyButtonActiveSize();
    @Property(selector = "btnPrivacyButtonBgColor")
    public native String getBtnPrivacyButtonBgColor();
    @Property(selector = "btnPrivacyButtonInactiveSize")
    public native UsercentricsInt getBtnPrivacyButtonInactiveSize();
    @Property(selector = "btnPrivacyButtonTextColor")
    public native String getBtnPrivacyButtonTextColor();
    @Property(selector = "btnPrivacyButtonTransparency")
    public native UsercentricsInt getBtnPrivacyButtonTransparency();
    @Property(selector = "chipBgColor")
    public native String getChipBgColor();
    @Property(selector = "chipTextColor")
    public native String getChipTextColor();
    @Property(selector = "cornerModalHeaderBgColor")
    public native String getCornerModalHeaderBgColor();
    @Property(selector = "cornerModalHeaderTextColor")
    public native String getCornerModalHeaderTextColor();
    @Property(selector = "historyDateFormat")
    public native UsercentricsInt getHistoryDateFormat();
    @Property(selector = "linkColor")
    public native String getLinkColor();
    @Property(selector = "modalSaveBgColor")
    public native String getModalSaveBgColor();
    @Property(selector = "modalSaveTextColor")
    public native String getModalSaveTextColor();
    @Property(selector = "privacyModalHeaderBgColor")
    public native String getPrivacyModalHeaderBgColor();
    @Property(selector = "privacyModalHeaderTextColor")
    public native String getPrivacyModalHeaderTextColor();
    @Property(selector = "txtOptInMsgColor")
    public native String getTxtOptInMsgColor();
    @Property(selector = "txtOptInMsgFontSize")
    public native UsercentricsInt getTxtOptInMsgFontSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBtnPrivacyButtonInactiveSize:historyDateFormat:btnPrivacyButtonActiveSize:txtOptInMsgFontSize:btnPrivacyButtonTransparency:btnPrivacyButtonBgColor:btnAcceptTextColor:btnDenyTextColor:txtOptInMsgColor:btnMoreInfoBgColor:btnMoreInfoTextColor:btnAcceptBgColor:btnDenyBgColor:linkColor:cornerModalHeaderBgColor:cornerModalHeaderTextColor:privacyModalHeaderBgColor:privacyModalHeaderTextColor:bannerBgColor:bannerTextColor:btnPrivacyButtonTextColor:modalSaveTextColor:modalSaveBgColor:chipTextColor:chipBgColor:")
    protected native @Pointer long init(UsercentricsInt btnPrivacyButtonInactiveSize, UsercentricsInt historyDateFormat, UsercentricsInt btnPrivacyButtonActiveSize, UsercentricsInt txtOptInMsgFontSize, UsercentricsInt btnPrivacyButtonTransparency, String btnPrivacyButtonBgColor, String btnAcceptTextColor, String btnDenyTextColor, String txtOptInMsgColor, String btnMoreInfoBgColor, String btnMoreInfoTextColor, String btnAcceptBgColor, String btnDenyBgColor, String linkColor, String cornerModalHeaderBgColor, String cornerModalHeaderTextColor, String privacyModalHeaderBgColor, String privacyModalHeaderTextColor, String bannerBgColor, String bannerTextColor, String btnPrivacyButtonTextColor, String modalSaveTextColor, String modalSaveBgColor, String chipTextColor, String chipBgColor);
    @Method(selector = "doCopyBtnPrivacyButtonInactiveSize:historyDateFormat:btnPrivacyButtonActiveSize:txtOptInMsgFontSize:btnPrivacyButtonTransparency:btnPrivacyButtonBgColor:btnAcceptTextColor:btnDenyTextColor:txtOptInMsgColor:btnMoreInfoBgColor:btnMoreInfoTextColor:btnAcceptBgColor:btnDenyBgColor:linkColor:cornerModalHeaderBgColor:cornerModalHeaderTextColor:privacyModalHeaderBgColor:privacyModalHeaderTextColor:bannerBgColor:bannerTextColor:btnPrivacyButtonTextColor:modalSaveTextColor:modalSaveBgColor:chipTextColor:chipBgColor:")
    public native UsercentricsStyles doCopy(UsercentricsInt btnPrivacyButtonInactiveSize, UsercentricsInt historyDateFormat, UsercentricsInt btnPrivacyButtonActiveSize, UsercentricsInt txtOptInMsgFontSize, UsercentricsInt btnPrivacyButtonTransparency, String btnPrivacyButtonBgColor, String btnAcceptTextColor, String btnDenyTextColor, String txtOptInMsgColor, String btnMoreInfoBgColor, String btnMoreInfoTextColor, String btnAcceptBgColor, String btnDenyBgColor, String linkColor, String cornerModalHeaderBgColor, String cornerModalHeaderTextColor, String privacyModalHeaderBgColor, String privacyModalHeaderTextColor, String bannerBgColor, String bannerTextColor, String btnPrivacyButtonTextColor, String modalSaveTextColor, String modalSaveBgColor, String chipTextColor, String chipBgColor);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}

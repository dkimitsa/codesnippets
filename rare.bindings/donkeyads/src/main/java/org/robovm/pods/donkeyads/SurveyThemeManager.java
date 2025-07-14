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
package org.robovm.pods.donkeyads;

/*<imports>*/
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DonkeyAdsSDKKitRvm.SurveyThemeManagerRvm")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SurveyThemeManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SurveyThemeManagerPtr extends Ptr<SurveyThemeManager, SurveyThemeManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SurveyThemeManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SurveyThemeManager() {}
    protected SurveyThemeManager(Handle h, long handle) { super(h, handle); }
    protected SurveyThemeManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currentTheme")
    public native Theme getCurrentTheme();
    @Property(selector = "primaryColor")
    public native UIColor getPrimaryColor();
    @Property(selector = "secondaryColor")
    public native UIColor getSecondaryColor();
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "cardBackgroundColor")
    public native UIColor getCardBackgroundColor();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "applyTheme:to:")
    public native void applyTheme(Theme theme, UIView view);
    @Method(selector = "shared")
    public static native SurveyThemeManager shared();
    /*</methods>*/

    // dkitimsa: manually moved here from SurveyThemeManager_Theme
    @org.robovm.rt.bro.annotation.Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)
    public enum Theme implements ValuedEnum {
        Light(0L),
        Dark(1L),
        Auto(2L);

        private final long n;

        private Theme(long n) { this.n = n; }
        public long value() { return n; }
        public static Theme valueOf(long n) {
            for (Theme v : values()) {
                if (v.n == n) {
                    return v;
                }
            }
            throw new IllegalArgumentException("No constant with value " + n + " found in "
                + Theme.class.getName());
        }
    }
}

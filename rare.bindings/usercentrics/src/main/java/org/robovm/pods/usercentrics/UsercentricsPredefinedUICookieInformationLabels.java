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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUICookieInformationLabels/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUICookieInformationLabelsPtr extends Ptr<UsercentricsPredefinedUICookieInformationLabels, UsercentricsPredefinedUICookieInformationLabelsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUICookieInformationLabels.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUICookieInformationLabels() {}
    protected UsercentricsPredefinedUICookieInformationLabels(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUICookieInformationLabels(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAnyDomain:day:days:domain:duration:error:hour:hours:identifier:loading:maximumAge:minute:minutes:month:months:multipleDomains:no:nonCookieStorage:second:seconds:session:title:titleDetailed:tryAgain:type:year:years:yes:storageInformationDescription:cookieStorage:cookieRefresh:purposes:")
    public UsercentricsPredefinedUICookieInformationLabels(String anyDomain, String day, String days, String domain, String duration, String error, String hour, String hours, String identifier, String loading, String maximumAge, String minute, String minutes, String month, String months, String multipleDomains, String no, String nonCookieStorage, String second, String seconds, String session, String title, String titleDetailed, String tryAgain, String type, String year, String years, String yes, String storageInformationDescription, String cookieStorage, String cookieRefresh, String purposes) { super((SkipInit) null); initObject(init(anyDomain, day, days, domain, duration, error, hour, hours, identifier, loading, maximumAge, minute, minutes, month, months, multipleDomains, no, nonCookieStorage, second, seconds, session, title, titleDetailed, tryAgain, type, year, years, yes, storageInformationDescription, cookieStorage, cookieRefresh, purposes)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "anyDomain")
    public native String getAnyDomain();
    @Property(selector = "cookieRefresh")
    public native String getCookieRefresh();
    @Property(selector = "cookieStorage")
    public native String getCookieStorage();
    @Property(selector = "day")
    public native String getDay();
    @Property(selector = "days")
    public native String getDays();
    @Property(selector = "domain")
    public native String getDomain();
    @Property(selector = "duration")
    public native String getDuration();
    @Property(selector = "error")
    public native String getError();
    @Property(selector = "hour")
    public native String getHour();
    @Property(selector = "hours")
    public native String getHours();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "loading")
    public native String getLoading();
    @Property(selector = "maximumAge")
    public native String getMaximumAge();
    @Property(selector = "minute")
    public native String getMinute();
    @Property(selector = "minutes")
    public native String getMinutes();
    @Property(selector = "month")
    public native String getMonth();
    @Property(selector = "months")
    public native String getMonths();
    @Property(selector = "multipleDomains")
    public native String getMultipleDomains();
    @Property(selector = "no")
    public native String getNo();
    @Property(selector = "nonCookieStorage")
    public native String getNonCookieStorage();
    @Property(selector = "purposes")
    public native String getPurposes();
    @Property(selector = "second")
    public native String getSecond();
    @Property(selector = "seconds")
    public native String getSeconds();
    @Property(selector = "session")
    public native String getSession();
    @Property(selector = "storageInformationDescription")
    public native String getStorageInformationDescription();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "titleDetailed")
    public native String getTitleDetailed();
    @Property(selector = "tryAgain")
    public native String getTryAgain();
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "year")
    public native String getYear();
    @Property(selector = "years")
    public native String getYears();
    @Property(selector = "yes")
    public native String getYes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAnyDomain:day:days:domain:duration:error:hour:hours:identifier:loading:maximumAge:minute:minutes:month:months:multipleDomains:no:nonCookieStorage:second:seconds:session:title:titleDetailed:tryAgain:type:year:years:yes:storageInformationDescription:cookieStorage:cookieRefresh:purposes:")
    protected native @Pointer long init(String anyDomain, String day, String days, String domain, String duration, String error, String hour, String hours, String identifier, String loading, String maximumAge, String minute, String minutes, String month, String months, String multipleDomains, String no, String nonCookieStorage, String second, String seconds, String session, String title, String titleDetailed, String tryAgain, String type, String year, String years, String yes, String storageInformationDescription, String cookieStorage, String cookieRefresh, String purposes);
    @Method(selector = "cookieMaxAgeLabelTimestampInSeconds:")
    public native String cookieMaxAgeLabelTimestampInSeconds(double timestampInSeconds);
    @Method(selector = "doCopyAnyDomain:day:days:domain:duration:error:hour:hours:identifier:loading:maximumAge:minute:minutes:month:months:multipleDomains:no:nonCookieStorage:second:seconds:session:title:titleDetailed:tryAgain:type:year:years:yes:storageInformationDescription:cookieStorage:cookieRefresh:purposes:")
    public native UsercentricsPredefinedUICookieInformationLabels doCopy(String anyDomain, String day, String days, String domain, String duration, String error, String hour, String hours, String identifier, String loading, String maximumAge, String minute, String minutes, String month, String months, String multipleDomains, String no, String nonCookieStorage, String second, String seconds, String session, String title, String titleDetailed, String tryAgain, String type, String year, String years, String yes, String storageInformationDescription, String cookieStorage, String cookieRefresh, String purposes);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    @Method(selector = "hash")
    public native @MachineSizedUInt long hash();
    @Method(selector = "description")
    public native String description();
    /*</methods>*/
}

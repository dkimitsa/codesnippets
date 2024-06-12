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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UsercentricsPredefinedUIServiceLabels/*</name>*/ 
    extends /*<extends>*/UsercentricsBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UsercentricsPredefinedUIServiceLabelsPtr extends Ptr<UsercentricsPredefinedUIServiceLabels, UsercentricsPredefinedUIServiceLabelsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UsercentricsPredefinedUIServiceLabels.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UsercentricsPredefinedUIServiceLabels() {}
    protected UsercentricsPredefinedUIServiceLabels(Handle h, long handle) { super(h, handle); }
    protected UsercentricsPredefinedUIServiceLabels(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataCollected:dataDistribution:dataPurposes:dataRecipientsTitle:descriptionTitle:history:legalBasis:processingCompanyTitle:retentionPeriodTitle:technologiesUsed:urls:")
    public UsercentricsPredefinedUIServiceLabels(UsercentricsPredefinedUIDescriptionTitle dataCollected, UsercentricsPredefinedUIDataDistributionTitle dataDistribution, UsercentricsPredefinedUIDescriptionTitle dataPurposes, String dataRecipientsTitle, String descriptionTitle, UsercentricsPredefinedUIDescriptionTitle history, UsercentricsPredefinedUIDescriptionTitle legalBasis, String processingCompanyTitle, String retentionPeriodTitle, UsercentricsPredefinedUIDescriptionTitle technologiesUsed, UsercentricsPredefinedUIURLsTitle urls) { super((SkipInit) null); initObject(init(dataCollected, dataDistribution, dataPurposes, dataRecipientsTitle, descriptionTitle, history, legalBasis, processingCompanyTitle, retentionPeriodTitle, technologiesUsed, urls)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataCollected")
    public native UsercentricsPredefinedUIDescriptionTitle getDataCollected();
    @Property(selector = "dataDistribution")
    public native UsercentricsPredefinedUIDataDistributionTitle getDataDistribution();
    @Property(selector = "dataPurposes")
    public native UsercentricsPredefinedUIDescriptionTitle getDataPurposes();
    @Property(selector = "dataRecipientsTitle")
    public native String getDataRecipientsTitle();
    @Property(selector = "descriptionTitle")
    public native String getDescriptionTitle();
    @Property(selector = "history")
    public native UsercentricsPredefinedUIDescriptionTitle getHistory();
    @Property(selector = "legalBasis")
    public native UsercentricsPredefinedUIDescriptionTitle getLegalBasis();
    @Property(selector = "processingCompanyTitle")
    public native String getProcessingCompanyTitle();
    @Property(selector = "retentionPeriodTitle")
    public native String getRetentionPeriodTitle();
    @Property(selector = "technologiesUsed")
    public native UsercentricsPredefinedUIDescriptionTitle getTechnologiesUsed();
    @Property(selector = "urls")
    public native UsercentricsPredefinedUIURLsTitle getUrls();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataCollected:dataDistribution:dataPurposes:dataRecipientsTitle:descriptionTitle:history:legalBasis:processingCompanyTitle:retentionPeriodTitle:technologiesUsed:urls:")
    protected native @Pointer long init(UsercentricsPredefinedUIDescriptionTitle dataCollected, UsercentricsPredefinedUIDataDistributionTitle dataDistribution, UsercentricsPredefinedUIDescriptionTitle dataPurposes, String dataRecipientsTitle, String descriptionTitle, UsercentricsPredefinedUIDescriptionTitle history, UsercentricsPredefinedUIDescriptionTitle legalBasis, String processingCompanyTitle, String retentionPeriodTitle, UsercentricsPredefinedUIDescriptionTitle technologiesUsed, UsercentricsPredefinedUIURLsTitle urls);
    /*</methods>*/
}

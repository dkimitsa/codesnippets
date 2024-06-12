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
package org.robovm.pods.appharbr;

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
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/AdBlockReason/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Security(1L),
    VideoOnDisplay(2L),
    Popup(3L),
    AdLpOffensive(4L),
    VideoAutoSound(5L),
    LpBackButtonHijack(6L),
    BrowserLocking(7L),
    PageAutoScroll(8L),
    MobileVibrateLp(9L),
    JSAlertOnEntry(10L),
    UserDefinedDomain(11L),
    AdLpExtremeOffensive(12L),
    LpCategoryAlcohol(14L),
    LpCategoryGambling(15L),
    LpCategoryHealth(16L),
    LpCategoryIllegalDrugs(17L),
    LpCategoryLaw(18L),
    LpCategoryMarijuana(19L),
    LpCategoryNews(20L),
    LpCategoryPharmaceuticals(21L),
    LpCategoryReligion(22L),
    LpCategoryTobacco(23L),
    LpCategoryWeightLoss(24L),
    AdLpKeyword(25L),
    LpCategoryCryptocurrency(26L),
    LpCategoryFashionAndBeauty(27L),
    LpCategoryElection(28L),
    UserDefinedApp(31L),
    AnimatedGif(32L),
    MarkedByTheUser(515L),
    LpCategorySwimwearAndIntimateApparel(34L),
    LpCategoryWeapons(35L),
    FileDownload(36L),
    InvalidTraffic(37L),
    AppStoreCategoryBooks(100L),
    AppStoreCategoryBusiness(101L),
    AppStoreCategoryDeveloperTools(102L),
    AppStoreCategoryEducation(103L),
    AppStoreCategoryEntertainment(104L),
    AppStoreCategoryFinance(105L),
    AppStoreCategoryFoodDrink(106L),
    AppStoreCategoryGames(107L),
    AppStoreCategoryGraphicsDesign(108L),
    AppStoreCategoryHealthFitness(109L),
    AppStoreCategoryLifestyle(110L),
    AppStoreCategoryKids(111L),
    AppStoreCategoryMagazinesNewspapers(112L),
    AppStoreCategoryMedical(113L),
    AppStoreCategoryMusic(114L),
    AppStoreCategoryNavigation(115L),
    AppStoreCategoryNews(116L),
    AppStoreCategoryPhotoVideo(117L),
    AppStoreCategoryProductivity(118L),
    AppStoreCategoryReference(119L),
    AppStoreCategorySafariExtensions(120L),
    AppStoreCategoryShopping(121L),
    AppStoreCategorySocialNetworking(122L),
    AppStoreCategorySports(123L),
    AppStoreCategoryTravel(124L),
    AppStoreCategoryUtilities(125L),
    AppStoreCategoryWeather(126L),
    AppStoreCategoryStickers(127L),
    PlayStoreCategoryArtDesign(200L),
    PlayStoreCategoryAutoVehicles(201L),
    PlayStoreCategoryBeauty(202L),
    PlayStoreCategoryBooksReference(203L),
    PlayStoreCategoryBusiness(204L),
    PlayStoreCategoryComics(205L),
    PlayStoreCategoryCommunication(206L),
    PlayStoreCategoryDating(207L),
    PlayStoreCategoryEducation(208L),
    PlayStoreCategoryEntertainment(209L),
    PlayStoreCategoryEvents(210L),
    PlayStoreCategoryFinance(211L),
    PlayStoreCategoryFoodDrink(212L),
    PlayStoreCategoryHealthFitness(213L),
    PlayStoreCategoryHouseHome(214L),
    PlayStoreCategoryLibrariesDemo(215L),
    PlayStoreCategoryLifestyle(216L),
    PlayStoreCategoryMapsNavigation(217L),
    PlayStoreCategoryMedical(218L),
    PlayStoreCategoryMusicAudio(219L),
    PlayStoreCategoryNewsMagazines(220L),
    PlayStoreCategoryParenting(221L),
    PlayStoreCategoryPersonalization(222L),
    PlayStoreCategoryPhotography(223L),
    PlayStoreCategoryProductivity(224L),
    PlayStoreCategoryShopping(225L),
    PlayStoreCategorySocial(226L),
    PlayStoreCategorySports(227L),
    PlayStoreCategoryTools(228L),
    PlayStoreCategoryTravelLocal(229L),
    PlayStoreCategoryVideoPlayersEditors(230L),
    PlayStoreCategoryWeather(231L),
    PlayStoreCategoryGamesAction(232L),
    PlayStoreCategoryGamesAdventure(233L),
    PlayStoreCategoryGamesArcade(234L),
    PlayStoreCategoryGamesBoard(235L),
    PlayStoreCategoryGamesCard(236L),
    PlayStoreCategoryGamesCasino(237L),
    PlayStoreCategoryGamesCasual(238L),
    PlayStoreCategoryGamesEducational(239L),
    PlayStoreCategoryGamesMusic(240L),
    PlayStoreCategoryGamesPuzzle(241L),
    PlayStoreCategoryGamesRacing(242L),
    PlayStoreCategoryGamesRolePlaying(243L),
    PlayStoreCategoryGamesSimulation(244L),
    PlayStoreCategoryGamesSports(245L),
    PlayStoreCategoryGamesStrategy(246L),
    PlayStoreCategoryGamesTrivia(247L),
    PlayStoreCategoryGamesWord(248L),
    AppExperienceForceCloseAd(901L),
    None(9998L),
    Unknown(9999L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AdBlockReason/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AdBlockReason/*</name>*/ valueOf(long n) {
        for (/*<name>*/AdBlockReason/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AdBlockReason/*</name>*/.class.getName());
    }
}

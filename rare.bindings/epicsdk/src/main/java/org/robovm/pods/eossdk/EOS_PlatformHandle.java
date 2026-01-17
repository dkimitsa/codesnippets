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
package org.robovm.pods.eossdk;

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
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EOS_PlatformHandle/*</name>*/ 
    extends /*<extends>*/NativeObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EOS_PlatformHandlePtr extends Ptr<EOS_PlatformHandle, EOS_PlatformHandlePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(EOS_PlatformHandle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected EOS_PlatformHandle() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="EOS_Platform_Create", optional=true)
    public static native EOS_PlatformHandle create(EOS_Platform_Options Options);
    @Bridge(symbol="EOS_Platform_Release", optional=true)
    public native void release();
    @Bridge(symbol="EOS_Platform_Tick", optional=true)
    public native void tick();
    @Bridge(symbol="EOS_Platform_GetMetricsInterface", optional=true)
    public native EOS_MetricsHandle getMetricsInterface();
    @Bridge(symbol="EOS_Platform_GetAuthInterface", optional=true)
    public native EOS_AuthHandle getAuthInterface();
    @Bridge(symbol="EOS_Platform_GetConnectInterface", optional=true)
    public native EOS_ConnectHandle getConnectInterface();
    @Bridge(symbol="EOS_Platform_GetEcomInterface", optional=true)
    public native EOS_EcomHandle getEcomInterface();
    @Bridge(symbol="EOS_Platform_GetUIInterface", optional=true)
    public native EOS_UIHandle getUIInterface();
    @Bridge(symbol="EOS_Platform_GetFriendsInterface", optional=true)
    public native EOS_FriendsHandle getFriendsInterface();
    @Bridge(symbol="EOS_Platform_GetPresenceInterface", optional=true)
    public native EOS_PresenceHandle getPresenceInterface();
    @Bridge(symbol="EOS_Platform_GetSessionsInterface", optional=true)
    public native EOS_SessionsHandle getSessionsInterface();
    @Bridge(symbol="EOS_Platform_GetLobbyInterface", optional=true)
    public native EOS_LobbyHandle getLobbyInterface();
    @Bridge(symbol="EOS_Platform_GetUserInfoInterface", optional=true)
    public native EOS_UserInfoHandle getUserInfoInterface();
    @Bridge(symbol="EOS_Platform_GetP2PInterface", optional=true)
    public native EOS_P2PHandle getP2PInterface();
    @Bridge(symbol="EOS_Platform_GetRTCInterface", optional=true)
    public native EOS_RTCHandle getRTCInterface();
    @Bridge(symbol="EOS_Platform_GetRTCAdminInterface", optional=true)
    public native EOS_RTCAdminHandle getRTCAdminInterface();
    @Bridge(symbol="EOS_Platform_GetPlayerDataStorageInterface", optional=true)
    public native EOS_PlayerDataStorageHandle getPlayerDataStorageInterface();
    @Bridge(symbol="EOS_Platform_GetTitleStorageInterface", optional=true)
    public native EOS_TitleStorageHandle getTitleStorageInterface();
    @Bridge(symbol="EOS_Platform_GetAchievementsInterface", optional=true)
    public native EOS_AchievementsHandle getAchievementsInterface();
    @Bridge(symbol="EOS_Platform_GetStatsInterface", optional=true)
    public native EOS_StatsHandle getStatsInterface();
    @Bridge(symbol="EOS_Platform_GetLeaderboardsInterface", optional=true)
    public native EOS_LeaderboardsHandle getLeaderboardsInterface();
    @Bridge(symbol="EOS_Platform_GetModsInterface", optional=true)
    public native EOS_ModsHandle getModsInterface();
    @Bridge(symbol="EOS_Platform_GetAntiCheatClientInterface", optional=true)
    public native EOS_AntiCheatClientHandle getAntiCheatClientInterface();
    @Bridge(symbol="EOS_Platform_GetAntiCheatServerInterface", optional=true)
    public native EOS_AntiCheatServerHandle getAntiCheatServerInterface();
    @Bridge(symbol="EOS_Platform_GetProgressionSnapshotInterface", optional=true)
    public native EOS_ProgressionSnapshotHandle getProgressionSnapshotInterface();
    @Bridge(symbol="EOS_Platform_GetReportsInterface", optional=true)
    public native EOS_ReportsHandle getReportsInterface();
    @Bridge(symbol="EOS_Platform_GetSanctionsInterface", optional=true)
    public native EOS_SanctionsHandle getSanctionsInterface();
    @Bridge(symbol="EOS_Platform_GetKWSInterface", optional=true)
    public native EOS_KWSHandle getKWSInterface();
    @Bridge(symbol="EOS_Platform_GetCustomInvitesInterface", optional=true)
    public native EOS_CustomInvitesHandle getCustomInvitesInterface();
    @Bridge(symbol="EOS_Platform_GetIntegratedPlatformInterface", optional=true)
    public native EOS_IntegratedPlatformHandle getIntegratedPlatformInterface();
    @Bridge(symbol="EOS_Platform_GetActiveCountryCode", optional=true)
    public native EOS_EResult getActiveCountryCode(EOS_EpicAccountIdDetails LocalUserId, BytePtr OutBuffer, IntPtr InOutBufferLength);
    @Bridge(symbol="EOS_Platform_GetActiveLocaleCode", optional=true)
    public native EOS_EResult getActiveLocaleCode(EOS_EpicAccountIdDetails LocalUserId, BytePtr OutBuffer, IntPtr InOutBufferLength);
    @Bridge(symbol="EOS_Platform_GetOverrideCountryCode", optional=true)
    public native EOS_EResult getOverrideCountryCode(BytePtr OutBuffer, IntPtr InOutBufferLength);
    @Bridge(symbol="EOS_Platform_GetOverrideLocaleCode", optional=true)
    public native EOS_EResult getOverrideLocaleCode(BytePtr OutBuffer, IntPtr InOutBufferLength);
    @Bridge(symbol="EOS_Platform_SetOverrideCountryCode", optional=true)
    public native EOS_EResult setOverrideCountryCode(BytePtr NewCountryCode);
    @Bridge(symbol="EOS_Platform_SetOverrideLocaleCode", optional=true)
    public native EOS_EResult setOverrideLocaleCode(BytePtr NewLocaleCode);
    @Bridge(symbol="EOS_Platform_CheckForLauncherAndRestart", optional=true)
    public native EOS_EResult checkForLauncherAndRestart();
    @Bridge(symbol="EOS_Platform_GetDesktopCrossplayStatus", optional=true)
    public native EOS_EResult getDesktopCrossplayStatus(EOS_Platform_GetDesktopCrossplayStatusOptions Options, EOS_Platform_DesktopCrossplayStatusInfo OutDesktopCrossplayStatusInfo);
    @Bridge(symbol="EOS_Platform_SetApplicationStatus", optional=true)
    public native EOS_EResult setApplicationStatus(EOS_EApplicationStatus NewStatus);
    @Bridge(symbol="EOS_Platform_GetApplicationStatus", optional=true)
    public native EOS_EApplicationStatus getApplicationStatus();
    @Bridge(symbol="EOS_Platform_SetNetworkStatus", optional=true)
    public native EOS_EResult setNetworkStatus(EOS_ENetworkStatus NewStatus);
    @Bridge(symbol="EOS_Platform_GetNetworkStatus", optional=true)
    public native EOS_ENetworkStatus getNetworkStatus();
    /*</methods>*/
}

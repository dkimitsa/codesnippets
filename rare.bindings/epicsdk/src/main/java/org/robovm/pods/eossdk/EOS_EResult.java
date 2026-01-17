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
public enum /*<name>*/EOS_EResult/*</name>*/ implements ValuedEnum {
    /*<values>*/
    EOS_Success(0L),
    EOS_NoConnection(1L),
    EOS_InvalidCredentials(2L),
    EOS_InvalidUser(3L),
    EOS_InvalidAuth(4L),
    EOS_AccessDenied(5L),
    EOS_MissingPermissions(6L),
    EOS_Token_Not_Account(7L),
    EOS_TooManyRequests(8L),
    EOS_AlreadyPending(9L),
    EOS_InvalidParameters(10L),
    EOS_InvalidRequest(11L),
    EOS_UnrecognizedResponse(12L),
    EOS_IncompatibleVersion(13L),
    EOS_NotConfigured(14L),
    EOS_AlreadyConfigured(15L),
    EOS_NotImplemented(16L),
    EOS_Canceled(17L),
    EOS_NotFound(18L),
    EOS_OperationWillRetry(19L),
    EOS_NoChange(20L),
    EOS_VersionMismatch(21L),
    EOS_LimitExceeded(22L),
    EOS_Disabled(23L),
    EOS_DuplicateNotAllowed(24L),
    EOS_MissingParameters_DEPRECATED(25L),
    EOS_InvalidSandboxId(26L),
    EOS_TimedOut(27L),
    EOS_PartialResult(28L),
    EOS_Missing_Role(29L),
    EOS_Missing_Feature(30L),
    EOS_Invalid_Sandbox(31L),
    EOS_Invalid_Deployment(32L),
    EOS_Invalid_Product(33L),
    EOS_Invalid_ProductUserID(34L),
    EOS_ServiceFailure(35L),
    EOS_CacheDirectoryMissing(36L),
    EOS_CacheDirectoryInvalid(37L),
    EOS_InvalidState(38L),
    EOS_RequestInProgress(39L),
    EOS_ApplicationSuspended(40L),
    EOS_NetworkDisconnected(41L),
    EOS_InsufficientOutputBuffer(42L),
    EOS_Auth_AccountLocked(1001L),
    EOS_Auth_AccountLockedForUpdate(1002L),
    EOS_Auth_InvalidRefreshToken(1003L),
    EOS_Auth_InvalidToken(1004L),
    EOS_Auth_AuthenticationFailure(1005L),
    EOS_Auth_InvalidPlatformToken(1006L),
    EOS_Auth_WrongAccount(1007L),
    EOS_Auth_WrongClient(1008L),
    EOS_Auth_FullAccountRequired(1009L),
    EOS_Auth_HeadlessAccountRequired(1010L),
    EOS_Auth_PasswordResetRequired(1011L),
    EOS_Auth_PasswordCannotBeReused(1012L),
    EOS_Auth_Expired(1013L),
    EOS_Auth_ScopeConsentRequired(1014L),
    EOS_Auth_ApplicationNotFound(1015L),
    EOS_Auth_ScopeNotFound(1016L),
    EOS_Auth_AccountFeatureRestricted(1017L),
    EOS_Auth_AccountPortalLoadError(1018L),
    EOS_Auth_CorrectiveActionRequired(1019L),
    EOS_Auth_PinGrantCode(1020L),
    EOS_Auth_PinGrantExpired(1021L),
    EOS_Auth_PinGrantPending(1022L),
    EOS_Auth_ExternalAuthNotLinked(1030L),
    EOS_Auth_ExternalAuthRevoked(1032L),
    EOS_Auth_ExternalAuthInvalid(1033L),
    EOS_Auth_ExternalAuthRestricted(1034L),
    EOS_Auth_ExternalAuthCannotLogin(1035L),
    EOS_Auth_ExternalAuthExpired(1036L),
    EOS_Auth_ExternalAuthIsLastLoginType(1037L),
    EOS_Auth_ExchangeCodeNotFound(1040L),
    EOS_Auth_OriginatingExchangeCodeSessionExpired(1041L),
    EOS_Auth_AccountNotActive(1050L),
    EOS_Auth_MFARequired(1060L),
    EOS_Auth_ParentalControls(1070L),
    EOS_Auth_NoRealId(1080L),
    EOS_Auth_UserInterfaceRequired(1090L),
    EOS_Friends_InviteAwaitingAcceptance(2000L),
    EOS_Friends_NoInvitation(2001L),
    EOS_Friends_AlreadyFriends(2003L),
    EOS_Friends_NotFriends(2004L),
    EOS_Friends_TargetUserTooManyInvites(2005L),
    EOS_Friends_LocalUserTooManyInvites(2006L),
    EOS_Friends_TargetUserFriendLimitExceeded(2007L),
    EOS_Friends_LocalUserFriendLimitExceeded(2008L),
    EOS_Presence_DataInvalid(3000L),
    EOS_Presence_DataLengthInvalid(3001L),
    EOS_Presence_DataKeyInvalid(3002L),
    EOS_Presence_DataKeyLengthInvalid(3003L),
    EOS_Presence_DataValueInvalid(3004L),
    EOS_Presence_DataValueLengthInvalid(3005L),
    EOS_Presence_RichTextInvalid(3006L),
    EOS_Presence_RichTextLengthInvalid(3007L),
    EOS_Presence_StatusInvalid(3008L),
    EOS_Presence_RichTextNotSupported(3009L),
    EOS_Presence_TemplateNotSupported(3010L),
    EOS_Presence_TemplateIdInvalid(3011L),
    EOS_Presence_TemplateTypeInvalid(3012L),
    EOS_Presence_TemplateKeyInvalid(3013L),
    EOS_Presence_TemplateValueInvalid(3014L),
    EOS_Presence_TemplateNotFound(3015L),
    EOS_Presence_TemplateInvalidVariableInput(3016L),
    EOS_Presence_TemplateLocalizationServerError(3017L),
    EOS_Presence_TemplateUnknownError(3018L),
    EOS_Ecom_EntitlementStale(4000L),
    EOS_Ecom_CatalogOfferStale(4001L),
    EOS_Ecom_CatalogItemStale(4002L),
    EOS_Ecom_CatalogOfferPriceInvalid(4003L),
    EOS_Ecom_CheckoutLoadError(4004L),
    EOS_Ecom_PurchaseProcessing(4005L),
    EOS_Sessions_SessionInProgress(5000L),
    EOS_Sessions_TooManyPlayers(5001L),
    EOS_Sessions_NoPermission(5002L),
    EOS_Sessions_SessionAlreadyExists(5003L),
    EOS_Sessions_InvalidLock(5004L),
    EOS_Sessions_InvalidSession(5005L),
    EOS_Sessions_SandboxNotAllowed(5006L),
    EOS_Sessions_InviteFailed(5007L),
    EOS_Sessions_InviteNotFound(5008L),
    EOS_Sessions_UpsertNotAllowed(5009L),
    EOS_Sessions_AggregationFailed(5010L),
    EOS_Sessions_HostAtCapacity(5011L),
    EOS_Sessions_SandboxAtCapacity(5012L),
    EOS_Sessions_SessionNotAnonymous(5013L),
    EOS_Sessions_OutOfSync(5014L),
    EOS_Sessions_TooManyInvites(5015L),
    EOS_Sessions_PresenceSessionExists(5016L),
    EOS_Sessions_DeploymentAtCapacity(5017L),
    EOS_Sessions_NotAllowed(5018L),
    EOS_Sessions_PlayerSanctioned(5019L),
    EOS_PlayerDataStorage_FilenameInvalid(6000L),
    EOS_PlayerDataStorage_FilenameLengthInvalid(6001L),
    EOS_PlayerDataStorage_FilenameInvalidChars(6002L),
    EOS_PlayerDataStorage_FileSizeTooLarge(6003L),
    EOS_PlayerDataStorage_FileSizeInvalid(6004L),
    EOS_PlayerDataStorage_FileHandleInvalid(6005L),
    EOS_PlayerDataStorage_DataInvalid(6006L),
    EOS_PlayerDataStorage_DataLengthInvalid(6007L),
    EOS_PlayerDataStorage_StartIndexInvalid(6008L),
    EOS_PlayerDataStorage_RequestInProgress(6009L),
    EOS_PlayerDataStorage_UserThrottled(6010L),
    EOS_PlayerDataStorage_EncryptionKeyNotSet(6011L),
    EOS_PlayerDataStorage_UserErrorFromDataCallback(6012L),
    EOS_PlayerDataStorage_FileHeaderHasNewerVersion(6013L),
    EOS_PlayerDataStorage_FileCorrupted(6014L),
    EOS_Connect_ExternalTokenValidationFailed(7000L),
    EOS_Connect_UserAlreadyExists(7001L),
    EOS_Connect_AuthExpired(7002L),
    EOS_Connect_InvalidToken(7003L),
    EOS_Connect_UnsupportedTokenType(7004L),
    EOS_Connect_LinkAccountFailed(7005L),
    EOS_Connect_ExternalServiceUnavailable(7006L),
    EOS_Connect_ExternalServiceConfigurationFailure(7007L),
    EOS_Connect_LinkAccountFailedMissingNintendoIdAccount_DEPRECATED(7008L),
    EOS_UI_SocialOverlayLoadError(8000L),
    EOS_UI_InconsistentVirtualMemoryFunctions(8001L),
    EOS_Lobby_NotOwner(9000L),
    EOS_Lobby_InvalidLock(9001L),
    EOS_Lobby_LobbyAlreadyExists(9002L),
    EOS_Lobby_SessionInProgress(9003L),
    EOS_Lobby_TooManyPlayers(9004L),
    EOS_Lobby_NoPermission(9005L),
    EOS_Lobby_InvalidSession(9006L),
    EOS_Lobby_SandboxNotAllowed(9007L),
    EOS_Lobby_InviteFailed(9008L),
    EOS_Lobby_InviteNotFound(9009L),
    EOS_Lobby_UpsertNotAllowed(9010L),
    EOS_Lobby_AggregationFailed(9011L),
    EOS_Lobby_HostAtCapacity(9012L),
    EOS_Lobby_SandboxAtCapacity(9013L),
    EOS_Lobby_TooManyInvites(9014L),
    EOS_Lobby_DeploymentAtCapacity(9015L),
    EOS_Lobby_NotAllowed(9016L),
    EOS_Lobby_MemberUpdateOnly(9017L),
    EOS_Lobby_PresenceLobbyExists(9018L),
    EOS_Lobby_VoiceNotEnabled(9019L),
    EOS_Lobby_PlatformNotAllowed(9020L),
    EOS_TitleStorage_UserErrorFromDataCallback(10000L),
    EOS_TitleStorage_EncryptionKeyNotSet(10001L),
    EOS_TitleStorage_FileCorrupted(10002L),
    EOS_TitleStorage_FileHeaderHasNewerVersion(10003L),
    EOS_Mods_ModSdkProcessIsAlreadyRunning(11000L),
    EOS_Mods_ModSdkCommandIsEmpty(11001L),
    EOS_Mods_ModSdkProcessCreationFailed(11002L),
    EOS_Mods_CriticalError(11003L),
    EOS_Mods_ToolInternalError(11004L),
    EOS_Mods_IPCFailure(11005L),
    EOS_Mods_InvalidIPCResponse(11006L),
    EOS_Mods_URILaunchFailure(11007L),
    EOS_Mods_ModIsNotInstalled(11008L),
    EOS_Mods_UserDoesNotOwnTheGame(11009L),
    EOS_Mods_OfferRequestByIdInvalidResult(11010L),
    EOS_Mods_CouldNotFindOffer(11011L),
    EOS_Mods_OfferRequestByIdFailure(11012L),
    EOS_Mods_PurchaseFailure(11013L),
    EOS_Mods_InvalidGameInstallInfo(11014L),
    EOS_Mods_CannotGetManifestLocation(11015L),
    EOS_Mods_UnsupportedOS(11016L),
    EOS_AntiCheat_ClientProtectionNotAvailable(12000L),
    EOS_AntiCheat_InvalidMode(12001L),
    EOS_AntiCheat_ClientProductIdMismatch(12002L),
    EOS_AntiCheat_ClientSandboxIdMismatch(12003L),
    EOS_AntiCheat_ProtectMessageSessionKeyRequired(12004L),
    EOS_AntiCheat_ProtectMessageValidationFailed(12005L),
    EOS_AntiCheat_ProtectMessageInitializationFailed(12006L),
    EOS_AntiCheat_PeerAlreadyRegistered(12007L),
    EOS_AntiCheat_PeerNotFound(12008L),
    EOS_AntiCheat_PeerNotProtected(12009L),
    EOS_AntiCheat_ClientDeploymentIdMismatch(12010L),
    EOS_AntiCheat_DeviceIdAuthIsNotSupported(12011L),
    EOS_RTC_TooManyParticipants(13000L),
    EOS_RTC_RoomAlreadyExists(13001L),
    EOS_RTC_UserKicked(13002L),
    EOS_RTC_UserBanned(13003L),
    EOS_RTC_RoomWasLeft(13004L),
    EOS_RTC_ReconnectionTimegateExpired(13005L),
    EOS_RTC_ShutdownInvoked(13006L),
    EOS_RTC_UserIsInBlocklist(13007L),
    EOS_RTC_AllocationFailed(13009L),
    EOS_RTC_VoiceModerationModeMismatch(13010L),
    EOS_RTC_EmptyRecord(13011L),
    EOS_RTC_RoomOptionsMismatch(13012L),
    EOS_ProgressionSnapshot_SnapshotIdUnavailable(14000L),
    EOS_KWS_ParentEmailMissing(15000L),
    EOS_KWS_UserGraduated(15001L),
    EOS_Android_JavaVMNotStored(17000L),
    EOS_Android_ReservedMustReferenceLocalVM(17001L),
    EOS_Android_ReservedMustBeNull(17002L),
    EOS_Permission_RequiredPatchAvailable(18000L),
    EOS_Permission_RequiredSystemUpdate(18001L),
    EOS_Permission_AgeRestrictionFailure(18002L),
    EOS_Permission_AccountTypeFailure(18003L),
    EOS_Permission_ChatRestriction(18004L),
    EOS_Permission_UGCRestriction(18005L),
    EOS_Permission_OnlinePlayRestricted(18006L),
    EOS_DesktopCrossplay_ApplicationNotBootstrapped(19000L),
    EOS_DesktopCrossplay_ServiceNotInstalled(19001L),
    EOS_DesktopCrossplay_ServiceStartFailed(19002L),
    EOS_DesktopCrossplay_ServiceNotRunning(19003L),
    EOS_CustomInvites_InviteFailed(20000L),
    EOS_UserInfo_BestDisplayNameIndeterminate(22000L),
    EOS_ConsoleInit_OnNetworkRequestedDeprecatedCallbackNotSet(23000L),
    EOS_ConsoleInit_CacheStorage_SizeKBNotMultipleOf16(23001L),
    EOS_ConsoleInit_CacheStorage_SizeKBBelowMinimumSize(23002L),
    EOS_ConsoleInit_CacheStorage_SizeKBExceedsMaximumSize(23003L),
    EOS_ConsoleInit_CacheStorage_IndexOutOfRangeRange(23004L),
    EOS_UnexpectedError(2147483647L),
    __EOS_EResult_PAD_INT32__(2147483647L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(EOS_EResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="EOS_EResult_ToString", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String toString();
    @Bridge(symbol="EOS_EResult_IsOperationComplete", optional=true)
    public native int isOperationComplete();
    /*</methods>*/

    private final long n;

    private /*<name>*/EOS_EResult/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/EOS_EResult/*</name>*/ valueOf(long n) {
        for (/*<name>*/EOS_EResult/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/EOS_EResult/*</name>*/.class.getName());
    }
}

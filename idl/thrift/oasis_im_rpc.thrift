include "base.thrift"
namespace java thrift_gen.oasis_im.rpc

// CONST
enum CONTENT_TYPE {
	CT_INVALID = 0
	Text = 101
	Picture = 102
	Voice = 103
	Video = 104
	File = 105
	AtText = 106
	Merger = 107
	Card = 108
	Location = 109
	CUSTOM = 110
	Revoke = 111
	HasReadReceipt = 112
	Typing = 113
	Quote = 114
	SingleTipBegin = 200
	AcceptFriendApplicationTip = 201
	AddFriendTip = 202
	RefuseFriendApplicationTip = 203
	SetSelfInfoTip = 204
	RevokeServer = 205
	C2C_MESSAGE_AS_READ = 206
	KickOnlineTip = 303
	SingleTipEnd = 399
	//SysRelated
	GroupTipBegin = 500
	TransferGroupOwnerTip = 501
	CreateGroupTip = 502
	JoinGroupTip = 504
	QuitGroupTip = 505
	SetGroupInfoTip = 506
	AcceptGroupApplicationTip = 507
	RefuseGroupApplicationTip = 508
	KickGroupMemberTip = 509
	InviteUserToGroupTip = 510
	DeleteGroupTip = 511
	GroupTipEnd = 599
}
enum SESSION_TYPE {
	ST_INVALID = 0
	SINGLE_CHAT = 1 //单聊
	GROUP_CHAT = 2 // 群聊，包括联盟频道
	GLOBAL_CHAT = 3 // 世界频道
	CROSS_GLOBAL_CHAT = 4 // 跨服世界频道
}
enum MSG_FROM {
	MF_INVALID = 0
	USER = 1
	SYSTEM = 2
}
struct BaseRequest {
	1: string operationID
	2: string token
}
struct BaseResp {
	1: i32 errorCode
	2: string errorMsg
}
struct UserInfo {
	1: string uid
	2: string name
	3: string icon
	4: i32 gender
	8: string ex
	9: string comment
	12: string openId
	13: string serverId
}
//------------------------------------
// USER
//------------------------------------
struct RegisterUserReq {
	1: string uid
	2: string name
	3: string icon
	4: i32 gender
	5: string mobile
	6: string birth
	7: string email
	8: string ex
	9: string serverID
	10: i32 platform
	11: string secret
	12: string serverToken
	13: string openId
    255: optional base.Base Base
}
struct RegisterUserResp {
	1: BaseResp base
}
struct RegisterUserToServer {
  1: string uid
  2: string serverID
}

struct RegisterUserToServerRequest {
  1: string token
  2: RegisterUserToServer data
  255: optional base.Base Base
}

struct RegisterUserToServerResponse {
  1: BaseResp base
}

struct DeleteUserFromServer {
  1: string uid
  2: string serverID
}

struct DeleteUserFromServerRequest {
  1: string token
  2: DeleteUserFromServer data
  255: optional base.Base Base
}

struct DeleteUserFromServerResponse {
  1: BaseResp base
}

struct UserTokenReq {
    1: i32 platform
	2: string uid
	3: string serverID
	4: string serverToken
	5: string registerReq
	255: optional base.Base Base
}
struct UserTokenResp {
	1: BaseResp base
	2: string uid
	3: string token
	4: i64 expiredTime
}

struct DeleteUsers {
	1: list<string> deleteUidList
}
struct DeleteUsersReq {
	1: string token
	2: DeleteUsers data
	255: optional base.Base Base
}
struct DeleteUsersResp {
	1: BaseResp base
	2: list<string> failedUidList
}
struct GetAllUsersUid {
}
struct GetAllUsersUidReq {
	1: string token
	2: GetAllUsersUid data
	255: optional base.Base Base
}
struct GetAllUsersUidResp {
	1: BaseResp base
	2: list<string> uidList
}
struct GetUserInfo {
	1: list<string> uidList
}
struct GetUserInfoReq {
	1: string token
	2: GetUserInfo data
	255: optional base.Base Base
}
struct GetUserInfoResp {
	1: BaseResp base
	2: list<UserInfo> data
}
struct UpdateUserInfo {
	1: string icon
	2: string name
	3: i32 gender
	4: string mobile
	5: string birth
	6: string email
	7: string ex
	8: string uid
	9: string serverID
	10: string openId
}
struct UpdateUserInfoReq {
	1: string token
	2: UpdateUserInfo data
	255: optional base.Base Base
}
struct BanUser {
	1: string uid
	2: string bannedUid
	3: i64 releaseTime
	4: map<string, string> extra
	5: string serverID
}
struct BanUserRequest {
	1: string token
	2: BanUser data
	255: optional base.Base Base
}
struct BanUserResponse {
	1: BaseResp base
	2: bool success
}
struct UnbanUser {
	1: string uid
	2: string bannedUid
	3: string serverID
}
struct UnbanUserRequest {
	1: string token
	2: UnbanUser data
	255: optional base.Base Base
}
struct UnbanUserResponse {
	1: BaseResp base
	2: bool success
}
struct CheckBannedUser {
	1: string uid
	2: string bannedUid
	3: string serverID
}
struct CheckBannedUserRequest {
	1: string token
	2: CheckBannedUser data
	255: optional base.Base Base
}
struct CheckBannedUserResponse {
	1: BaseResp base
	2: bool isBanned
	3: i64 beginBanTime
	4: i64 endBanTime
	5: map<string, string> extra
}
struct BatchBanUserGlobal {
	1: list<string> uidList
	2: i64 releaseTime
	3: string serverID
	4: map<string, string> extra
}
struct BatchBanUserGlobalRequest {
	1: string token
	2: BatchBanUserGlobal data
	255: optional base.Base Base
}
struct BatchBanUserGlobalResponse {
	1: BaseResp base
	2: list<string> failedUidList
}
struct BatchUnbanUserGlobal {
	1: list<string> uidList
	2: string serverID
}
struct BatchUnbanUserGlobalRequest {
	1: string token
	2: BatchUnbanUserGlobal data
	255: optional base.Base Base
}
struct BatchUnbanUserGlobalResponse {
	1: BaseResp base
	2: list<string> failedUidList
}
struct CheckBannedGlobal {
	1: string uid
	2: string serverID
}
struct CheckBannedGlobalRequest {
	1: string token
	2: CheckBannedGlobal data
	255: optional base.Base Base
}
struct CheckBannedGlobalResponse {
	1: BaseResp base
	2: bool isBanned
	3: i64 beginBanTime
	4: i64 endBanTime
	5: map<string, string> extra
}
struct BatchBanUserInGroup {
	1: string groupID
	2: list<string> uidList
	3: i64 releaseTime
	4: string serverID
	5: map<string, string> extra
}
struct BatchBanUserInGroupRequest {
	1: string token
	2: BatchBanUserInGroup data
	255: optional base.Base Base
}
struct BatchBanUserInGroupResponse {
	1: BaseResp base
	2: list<string> failedUidList
}
struct BatchUnbanUserInGroup {
	1: string groupID
	2: list<string> uidList
	3: string serverID
}
struct BatchUnbanUserInGroupRequest {
	1: string token
	2: BatchUnbanUserInGroup data
	255: optional base.Base Base
}
struct BatchUnbanUserInGroupResponse {
	1: BaseResp base
	2: list<string> failedUidList
}
struct CheckBannedInGroup {
	1: string groupID
	2: string uid
	3: string serverID
}
struct CheckBannedInGroupRequest {
	1: string token
	2: CheckBannedInGroup data
	255: optional base.Base Base
}
struct CheckBannedInGroupResponse {
	1: BaseResp base
	2: bool isBanned
	3: i64 beginBanTime
	4: i64 endBanTime
	5: map<string, string> extra
}
//------------------------------------
// CHAT
//------------------------------------
struct ReplyFor {
    1: i64 seq
    2: string content
}

struct AtUser {
    1: string uid
    2: string name
}

struct ChatMsg {
	1: string sendID
	2: string senderNickName
	3: string senderFaceURL
	4: i32 platformID
	5: string recvID
	6: i64 recvSeq
	7: SESSION_TYPE sessionType
	8: MSG_FROM msgFrom
	9: CONTENT_TYPE contentType
	10: string content
	11: i64 sendTime
	12: string clientMsgID
	13: string serverMsgID
	14: string options
	15: string ex
	16: string serverID
	17: string sessionKey
	19: ReplyFor replyFor
	20: list<AtUser> atUsers
}

struct ChatMsgMQ {
    1: ChatMsg msg;
    2: i64 sendMQTime;
}

struct UserSendMsgReq {
	1: string token
	2: ChatMsg data
	3: list<string> toIdList
	4: SenderInfo senderInfo
	255: optional base.Base Base
}

struct SenderInfo {
    1: string uid
    2: string openId
    3: i64 serverId
    4: string region
    5: i32 language
    6: string ip
    7: string platform
}

struct UserSendMsgResp {
	1: BaseResp base
	2: i64 sendTime
	3: string serverMsgID
	4: string clientMsgID
	5: string punishInfo
}
struct DelMsg {
    1: SESSION_TYPE sessionType
    2: string key
    3: i64 seq
}
struct DeleteMessageReq {
	1: string token
	2: DelMsg data
	255: optional base.Base Base
}
struct DeleteUserMsg {
    1: string uid
}
struct DeleteUserMsgReq {
    1: string token
    2: DeleteUserMsg data
    255: optional base.Base Base
}

struct ImmigrateUser {
    1: string uid
    2: string name
    3: string icon
    4: string ex
    5: string servers
    6: string openId
    7: i64 createTime
}

struct ImmigrateUserData {
    1: list<ImmigrateUser> users
}

struct ImmigrateUserReq {
    1: string token
    2: ImmigrateUserData data
    255: optional base.Base Base
}

struct ImmigrateUserResp {
    1: BaseResp base
    2: list<string> uids
}

struct ImmigrateUserMsg {
    1: SESSION_TYPE sessionType
    2: string sessionKey
    3: list<ChatMsg> msgList
}

struct ImmigrateMessageReq {
    1: string token
    2: ImmigrateUserMsg data
    255: optional base.Base Base
}

struct ImmigrateSingleChat {
    1: string uid1
    2: string uid2
    3: i64 createTime
    4: i64 imcloudId
    5: string setting1
    6: string setting2
}

struct ImmigrateSingleChatData {
    1: list<ImmigrateSingleChat> chats
}

struct ImmigrateSingleChatReq {
    1: string token
    2: ImmigrateSingleChatData data
    255: optional base.Base Base
}

struct ImmigrateSingleChatResp {
    1: BaseResp base
    2: list<string> keys
}

struct ImmigrateGroup {
    1: string id
	2: string name
	3: string faceUrl
	4: string ex
	5: string serverID
	6: string groupType
	7: string ownerUid
	8: i64 createTime
	9: string allianceId
	20: list<ImmigrateGroupMember> memberList
}

struct ImmigrateGroupChatData {
	1: list<ImmigrateGroup> groups
}

struct ImmigrateGroupMember {
    1: string uid
    2: i32 setRole
    3: string setting
    4: i64 joinTime
}

struct ImmigrateGroupChatReq {
    1: string token
    2: ImmigrateGroupChatData data
    255: optional base.Base Base
}

struct ImmigrateGroupChatResp {
    1: BaseResp base
    2: list<string> groupIds
}

struct LoadChat {
	1: SESSION_TYPE sessionType
	2: i64 cursor
	3: i64 limit
}
struct LoadChatReq {
	1: string token
	2: LoadChat data
	255: optional base.Base Base
}
struct LoadChatResp {
	1: BaseResp base
	2: GatherFormat chatMsg
}
struct PullMessage {
	1: i64 seqBegin
	2: i64 seqEnd
	3: SESSION_TYPE sessionType
	4: string sessionKey
	5: string uid
}
struct PullMessageReq {
	1: string token
	2: PullMessage data
	255: optional base.Base Base
}
struct PullMessageResp {
	1: BaseResp base
	2: i64 maxSeq
	3: i64 minSeq
	4: GatherFormat msg
}
struct GetNewSeq {
    1: string uid
	2: SESSION_TYPE sessionType
	3: string sessionKey
}
struct GetNewSeqReq {
	1: string token
	2: GetNewSeq data
	255: optional base.Base Base
}
struct GetNewSeqResp {
	1: BaseResp base
	2: SESSION_TYPE sessionType
	3: string sessionKey
	4: i64 seq
}
struct GetNewestSeqBatch {
    1: list<string> singleKeys
    2: list<string> groupKeys
    3: list<string> globalKeys
    4: list<string> crossKeys
}

struct GetNewestSeqBatchReq {
    1: string token
    2: GetNewestSeqBatch data
    255: optional base.Base Base
}
struct GetNewestSeqBatchResp {
    1: BaseResp base
    2: map<string, i64> singleSeqMap
    3: map<string, i64> groupSeqMap
    4: map<string, i64> globalSeqMap
    5: map<string, i64> crossSeqMap
}
struct FixNewestSeqReq {
    1: string token
    2: SESSION_TYPE sessionType
    3: string sessionKey
    255: optional base.Base Base
}
struct GatherFormat {
	1: string id
	2: list<ChatMsg> msgList
}

struct PullSessionListReq {
    1: string token
    2: string serverId
    255: optional base.Base Base
}

struct GlobalSessionInfo {
    1: string serverId
    2: i64 seq
}

struct CrossGlobalSessionInfo {
    1: string id
    2: i64 expireTime
    3: i64 seq
}

struct GroupSessionInfo {
    1: GroupInfo groupInfo
    2: string setting
    3: i64 seq
    4: i64 lastMsgTime
}

struct SingleSessionInfo {
    1: SingleChat chatInfo
    2: string setting
    3: i64 seq
    4: i64 lastMsgTime
}

struct PullSessionListResp {
    1: BaseResp base
    2: GlobalSessionInfo globalChat
    3: list<GroupSessionInfo> groupChats
    4: list<SingleSessionInfo> singleChats
    5: CrossGlobalSessionInfo crossGlobalChat
    10: list<UserInfo> blacklist
}
//------------------------------------
// GROUP
//------------------------------------
struct GroupAddMemberInfo {
	1: string uid
	2: i32 setRole
}
struct CreateGroup {
	1: list<GroupAddMemberInfo> memberList
	2: string groupName
	3: string introduction
	4: string notification
	5: string faceUrl
	6: string ex
	7: string serverID
	8: string groupType
	9: string ownerUid
	10: string allianceId
}
struct CreateGroupReq {
	1: string token
	2: CreateGroup data
	255: optional base.Base Base
}
struct CreateGroupResp {
	1: BaseResp base
	2: string groupID
}
struct DeleteGroup {
	1: string groupID
	2: string serverID
}
struct DeleteGroupRequest {
	1: string token
	2: DeleteGroup data
	255: optional base.Base Base
}
struct DeleteGroupResponse {
	1: BaseResp base
}
struct GetGroupsInfo {
	1: list<string> groupIDList
	2: string serverID
}
struct GetGroupsInfoReq {
	1: string token
	2: GetGroupsInfo data
	255: optional base.Base Base
}
struct GetGroupsInfoResp {
	1: BaseResp base
	2: list<GroupInfo> data
}

struct GetGroupInfo {
    1: string serverID
    2: string groupID
}

struct GetGroupInfoReq {
    1: string token
    2: GetGroupInfo data
    255: optional base.Base Base
}

struct GetGroupInfoResp {
    1: BaseResp base
    2: GroupInfo data
}
struct SetGroupInfo {
	1: string groupID
	2: string groupName
	3: string notification
	4: string introduction
	5: string faceUrl
	6: string serverID
	7: string newOwnerId
}
struct SetGroupInfoReq {
	1: string token
	2: SetGroupInfo data
	255: optional base.Base Base
}
struct GetGroupApplicationList {
	1: string uid
	2: string serverID
}
struct GetGroupApplicationListReq {
	1: string token
	2: GetGroupApplicationList data
	255: optional base.Base Base
}
struct GetGroupApplicationListDataUser {
	1: GroupApplicationResponse response
	2: i32 flag
	3: string handledUser
}
struct GetGroupApplicationListData {
	1: i32 count
	2: list<GetGroupApplicationListDataUser> user
}
struct GetGroupApplicationListResp {
	1: BaseResp base
	2: GetGroupApplicationListData data
}
struct TransferGroupOwner {
	1: string groupID
	2: string oldOwner
	3: string newOwner
	4: string serverID
}
struct TransferGroupOwnerReq {
	1: string token
	2: TransferGroupOwner data
	255: optional base.Base Base
}
struct TransferGroupOwnerResp {
	1: BaseResp base
}
struct JoinGroup {
	1: string groupID
	2: string message
	3: string serverID
}
struct JoinGroupReq {
	1: string token
	2: JoinGroup data
	255: optional base.Base Base
}
struct GroupApplicationResponse {
	1: i64 requestId
	2: string groupID
	3: string ownerID
	4: string fromUserID
	5: string fromUserNickName
	6: string fromUserFaceUrl
	7: string toUserID
	8: string toUserNickName
	9: string toUserFaceUrl
	10: i64 addTime
	11: string requestMsg
	12: string handledMsg
	13: i32 type
	14: i32 handleStatus
	15: i32 handleResult
	16: string serverID
}
struct GroupApplicationResponseReq {
	1: string token
	2: GroupApplicationResponse data
	255: optional base.Base Base
}
struct GroupApplicationResponseResp {
	1: BaseResp base
}
struct SetOwnerGroupNickName {
	1: string groupID
	2: string nickName
	3: string serverID
}
struct SetOwnerGroupNickNameReq {
	1: string token
	2: SetOwnerGroupNickName data
	255: optional base.Base Base
}
struct QuitGroup {
	1: string groupID
	2: string serverID
}
struct QuitGroupReq {
	1: string token
	2: QuitGroup data
	255: optional base.Base Base
}
struct AddGroupMemberBatch {
	1: string groupID
	2: string reason
	3: list<string> uidList
	4: string serverID
}
struct AddGroupMemberBatchRequest {
	1: string token
	2: AddGroupMemberBatch data
	255: optional base.Base Base
}
struct AddGroupMemberBatchResponse {
	1: BaseResp base
	2: list<Id2Result> result
}
struct DelGroupMemberBatch {
	1: string groupID
	2: string reason
	3: list<string> uidList
	4: string serverID
}
struct DelGroupMemberBatchRequest {
	1: string token
	2: DelGroupMemberBatch data
	255: optional base.Base Base
}
struct DelGroupMemberBatchResponse {
	1: BaseResp base
	2: list<Id2Result> result
}

struct ModifyGroupMemberInfo {
  1: string uid
  2: string nickname
  3: i32 level
}

struct ModifyGroupMemberBatch {
  1: string groupID
  2: string reason
  3: list<ModifyGroupMemberInfo> uidList
  4: string serverID
}

struct ModifyGroupMemberBatchRequest {
  1: string token
  2: ModifyGroupMemberBatch data
  255: optional base.Base Base
}

struct ModifyGroupMemberBatchResponse {
  1: BaseResp base
  2: list<Id2Result> result
}

struct GroupApplicationUserInfo {
	1: string groupID
	2: string uid
	3: string name
	4: string icon
	5: string reqMsg
	6: i64 applicationTime
	7: i32 flag
	8: string operatorID
	9: string handledMsg
}
struct GroupMemberFullInfo {
	1: string uid
	2: i32 role
	3: i64 joinTime
	4: string nickName
	5: string faceUrl
	6: string groupID
}
struct GetGroupMemberList {
	1: string groupID
	2: i32 filter
	3: i32 nextSeq
	4: string serverID
}
struct GetGroupMemberListReq {
	1: string token
	2: GetGroupMemberList data
	255: optional base.Base Base
}
struct GetGroupMemberListResp {
	1: BaseResp base
	2: list<GroupMemberFullInfo> memberList
	3: i32 nextSeq
}
struct GetGroupMembersInfo {
	1: string groupID
	2: list<string> memberList
	3: string serverID
}
struct GetGroupMembersInfoReq {
	1: string token
	2: GetGroupMembersInfo data
	255: optional base.Base Base
}
struct GetGroupMembersInfoResp {
	1: BaseResp base
	2: list<GroupMemberFullInfo> memberList
}
struct KickGroupMember {
	1: string groupID
	2: list<GroupMemberFullInfo> uidListInfo
	3: string reason
	4: string serverID
}
struct KickGroupMemberReq {
	1: string token
	2: KickGroupMember data
	255: optional base.Base Base
}
struct Id2Result {
	1: string uid
	2: i32 result //0 ok; -1 error
}
struct KickGroupMemberResp {
	1: BaseResp base
	2: list<Id2Result> id2Result
}
struct GetJoinedGroupList {
	1: string serverID
}
struct GetJoinedGroupListReq {
	1: string token
	2: GetJoinedGroupList data
	255: optional base.Base Base
}
struct GroupInfo {
	1: string groupId
	2: string groupName
	3: string notification
	4: string introduction
	5: string faceUrl
	6: i64 createTime
	7: string ownerId
	8: string ex
	9: string groupType
	10: i32 memberCount
	11: i64 updateTime
}
struct GetJoinedGroupListResp {
	1: BaseResp base
	2: list<GroupInfo> groupList
	3: map<string, string> settings
}
struct InviteUserToGroup {
	1: string groupID
	2: string reason
	3: list<string> uidList
	4: string serverID
}
struct InviteUserToGroupReq {
	1: string token
	2: InviteUserToGroup data
	255: optional base.Base Base
}
struct InviteUserToGroupResp {
	1: BaseResp base
	2: list<Id2Result> id2Result // 0 ok, -1 error
}
struct GetGroupAllMember {
	1: string groupID
	2: string serverID
}
struct GetGroupAllMemberReq {
	1: string token
	2: GetGroupAllMember data
	255: optional base.Base Base
}
struct GetGroupAllMemberResp {
	1: BaseResp base
	2: list<GroupMemberFullInfo> memberList
}

struct BindAlliance {
    1: string uid
    2: string allianceId
    3: string groupId
    4: list<string> members
}

struct BindAllianceReq {
    1: string token
    2: BindAlliance data
    255: optional base.Base Base
}

//------------------------------------
// FRIEND
//------------------------------------
struct GetFriendsInfo {
	1: string uid
	2: string serverID
}
struct GetFriendsInfoReq {
	1: string token
	2: GetFriendsInfo data
	255: optional base.Base Base
}
struct GetFriendData {
	1: string uid
	2: string icon
	3: string name
	4: i32 gender
	5: string mobile
	6: string birth
	7: string email
	8: string ex
	9: string comment
	10: i32 isFriend
	11: i32 isInBlackList
}
struct GetFriendInfoResp {
	1: BaseResp base
	2: GetFriendData data
}
struct AddFriend {
	1: string uid
	2: string reqMessage
	3: string serverID
}
struct AddFriendReq {
	1: string token
	2: AddFriend data
	255: optional base.Base Base
}
struct ImportFriend {
	1: list<string> uidList
	2: string ownerUid
	3: string serverID
}
struct ImportFriendReq {
	1: string token
	2: ImportFriend data
	255: optional base.Base Base
}
struct ImportFriendResp {
	1: BaseResp base
	2: list<string> failedUidList
}
struct GetFriendApply {
	1: string serverID
}
struct GetFriendApplyReq {
	1: string token
	2: GetFriendApply data
	255: optional base.Base Base
}
struct ApplyUserInfo {
	1: UserInfo user
	2: i32 flag
	3: string applyTime
	4: string reqMessage
}
struct GetFriendApplyResp {
	1: BaseResp base
	2: list<ApplyUserInfo> data
}
struct GetFriendList {
	1: string serverID
}
struct GetFriendListReq {
	1: string token
	2: GetFriendList data
	255: optional base.Base Base
}
struct GetFriendListResp {
	1: BaseResp base
	2: list<UserInfo> data
}
struct AddBlacklist {
	1: string uid
	2: string ownerUid
}
struct AddBlacklistReq {
	1: string token
	2: AddBlacklist data
	255: optional base.Base Base
}
struct AddBlacklistResp {
    1: BaseResp base
    2: UserInfo userinfo
}
struct RemoveBlacklist {
	1: string uid
}
struct RemoveBlacklistReq {
	1: string token
	2: RemoveBlacklist data
	255: optional base.Base Base
}
struct GetBlacklist {
	1: string serverID
}
struct GetBlacklistReq {
	1: string token
	2: GetBlacklist data
	255: optional base.Base Base
}
struct GetBlacklistResp {
	1: BaseResp base
	2: list<UserInfo> data
}
struct IsFriend {
	1: string receiveUid
	2: string serverID
}
struct IsFriendReq {
	1: string token
	2: IsFriend data
	255: optional base.Base Base
}
struct IsFriendResp {
	1: BaseResp base
	2: i32 shipType
}
struct IsInBlackList {
	1: string sendUid
	2: string receiveUid
}
struct IsInBlackListReq {
	1: string token
	2: IsInBlackList data
	255: optional base.Base Base
}
struct IsInBlackListResp {
	1: BaseResp base
	2: bool response
}
struct DeleteFriend {
	1: string uid
	2: string serverID
}
struct DeleteFriendReq {
	1: string token
	2: DeleteFriend data
	255: optional base.Base Base
}
struct AddFriendResponse {
	1: string uid
	2: i32 flag
	3: string serverID
}
struct AddFriendResponseReq {
	1: string token
	2: AddFriendResponse data
	255: optional base.Base Base
}
struct SetFriendComment {
	1: string uid
	2: string comment
	3: string serverID
}
struct SetFriendCommentReq {
	1: string token
	2: SetFriendComment data
	255: optional base.Base Base
}

struct GetSingleChatListReq {
    1: string token
    2: string uid
    255: optional base.Base Base
}

struct SingleChat {
    1: string uid
    2: i64 createTime
    3: string name
    5: string icon
    6: string serverId
}

struct GetSingleChatListResp {
    1: BaseResp base
    2: list<SingleChat> chats
    3: map<string, string> settings
}

struct ServerTokenReq {
	1: string appId
	2: string appSecret
	255: optional base.Base Base
}

struct ServerTokenResp {
	1: BaseResp base
	2: string token
	3: i64 expiredTime
}

struct PushMsgReq {
    1: SESSION_TYPE sessionType
    2: string sessionKey
    3: i32 msgId
    4: binary msg
    5: list<string> toIdList
    255: optional base.Base Base
}

struct CreateSingleChatReq {
    1: string token
    2: string targetUid
    3: string serverId
    255: optional base.Base Base
}

struct CreateSingleChatResp {
    1: BaseResp base
    2: SingleChat chat
}

struct CloseChatReq {
    1: string token
    2: SESSION_TYPE sessionType
    3: string sessionKey
    4: bool close
    255: optional base.Base Base
}

struct CloseChatResp {
    1: BaseResp base
    2: SESSION_TYPE sessionType
    3: string sessionKey
    4: string setting
}

struct MuteChatReq {
    1: string token
    2: SESSION_TYPE sessionType
    3: string sessionKey
    4: bool mute
    255: optional base.Base Base
}

struct MuteChatResp {
    1: BaseResp base
    2: SESSION_TYPE sessionType
    3: string sessionKey
    4: string setting
}

struct CheckReport {
    1: string serverMsgId
    2: string sender
    3: string text
}

struct CheckReportReq{
    1: string token
    2: CheckReport data
    255: optional base.Base Base
}

struct BuildGroupIconReq {
    1: string token
    255: optional base.Base Base
}

struct ClearGlobalChannelReq {
    1: string token
    2: string serverId
    255: optional base.Base Base
}

struct CreateCrossGlobalChannelReq {
    1: string token
    2: list<string> keys
    3: i64 expireTime
    255: optional base.Base Base
}

struct CreateCrossGlobalChannelResp {
    1: BaseResp base
    2: map<string, string> keyIdMap
}

struct CloseCrossGlobalChannelReq {
    1: string token
    2: list<string> ids
    255: optional base.Base Base
}

struct CloseCrossGlobalChannelResp {
    1: BaseResp base
    2: list<string> ids
}


service imService {
	// AUTH
	RegisterUserResp registerUser (1: RegisterUserReq req)
	UserTokenResp userToken (1: UserTokenReq req)
	RegisterUserToServerResponse RegisterUserToServer(1: RegisterUserToServerRequest req)
    DeleteUserFromServerResponse DeleteUserFromServer(1: DeleteUserFromServerRequest req)

	// USER
	GetUserInfoResp getUserInfo (1: GetUserInfoReq req)
	BaseResp updateUserInfo (1: UpdateUserInfoReq req)
	DeleteUsersResp deleteUsers (1: DeleteUsersReq req)
	GetAllUsersUidResp getAllUsersUid (1: GetAllUsersUidReq req)
	// BAN
	BanUserResponse banUser (1: BanUserRequest req)
	UnbanUserResponse unbanUser (1: UnbanUserRequest req)
	CheckBannedUserResponse checkBannedUser (1: CheckBannedUserRequest req)
	BatchBanUserGlobalResponse batchBanUserGlobal (1: BatchBanUserGlobalRequest req)
	BatchUnbanUserGlobalResponse batchUnbanUserGlobal (1: BatchUnbanUserGlobalRequest req)
	CheckBannedGlobalResponse checkBannedGlobal (1: CheckBannedGlobalRequest req)
	BatchBanUserInGroupResponse batchBanUserInGroup (1: BatchBanUserInGroupRequest req)
	BatchUnbanUserInGroupResponse batchUnbanUserInGroup (1: BatchUnbanUserInGroupRequest req)
	CheckBannedInGroupResponse checkBannedInGroup (1: CheckBannedInGroupRequest req)
	// CHAT
	GetNewSeqResp getNewSeq (1: GetNewSeqReq req)
	PullMessageResp pullMessage (1: PullMessageReq req)
	UserSendMsgResp userSendMsg (1: UserSendMsgReq req)
	BaseResp fixNewestSeq(1: FixNewestSeqReq req)
	GetNewestSeqBatchResp getNewestSeqBatch (1: GetNewestSeqBatchReq req)
    CreateSingleChatResp createSingleChat(1: CreateSingleChatReq req)
    PullSessionListResp pullSessionList(1: PullSessionListReq req)

    BaseResp deleteMessage(1: DeleteMessageReq req)
    BaseResp deleteUserMsg(1: DeleteUserMsgReq req)
    GetSingleChatListResp getSingleChatList (1: GetSingleChatListReq req)

    BaseResp checkReport(1: CheckReportReq req)

	// GROUP
	CreateGroupResp createGroup (1: CreateGroupReq req)
	DeleteGroupResponse deleteGroup (1: DeleteGroupRequest req)
	BaseResp joinGroup (1: JoinGroupReq req)
	BaseResp quitGroup (1: QuitGroupReq req)
	AddGroupMemberBatchResponse addGroupMemberBatch (1: AddGroupMemberBatchRequest req)
	DelGroupMemberBatchResponse delGroupMemberBatch (1: DelGroupMemberBatchRequest req)
	ModifyGroupMemberBatchResponse modifyGroupMemberBatch(1: ModifyGroupMemberBatchRequest req)
	GetGroupsInfoResp getGroupsInfo (1: GetGroupsInfoReq req)
	GetGroupInfoResp getGroupInfo(1: GetGroupInfoReq req)
	BaseResp setGroupInfo (1: SetGroupInfoReq req)
	GetGroupApplicationListResp getGroupApplicationList (1: GetGroupApplicationListReq req)
	TransferGroupOwnerResp transferGroupOwner (1: TransferGroupOwnerReq req)
	GroupApplicationResponseResp groupApplicationResponse (1: GroupApplicationResponseReq req)
	GetGroupMemberListResp getGroupMemberList (1: GetGroupMemberListReq req)
	GetGroupMembersInfoResp getGroupMembersInfo (1: GetGroupMembersInfoReq req)
	KickGroupMemberResp kickGroupMember (1: KickGroupMemberReq req)
	GetJoinedGroupListResp getJoinedGroupList (1: GetJoinedGroupListReq req)
	InviteUserToGroupResp inviteUserToGroup (1: InviteUserToGroupReq req)
	GetGroupAllMemberResp getGroupAllMember (1: GetGroupAllMemberReq req)
	// FRIEND
	GetFriendInfoResp getFriendsInfo (1: GetFriendsInfoReq req)
	BaseResp addFriend (1: AddFriendReq req)
	GetFriendApplyResp getFriendApplyList (1: GetFriendApplyReq req)
	GetFriendApplyResp getSelfApplyList (1: GetFriendApplyReq req)
	GetFriendListResp getFriendList (1: GetFriendListReq req)
	AddBlacklistResp addBlacklist (1: AddBlacklistReq req)
	BaseResp removeBlacklist (1: RemoveBlacklistReq req)
	IsFriendResp isFriend (1: IsFriendReq req)
	IsInBlackListResp isInBlackList (1: IsInBlackListReq req)
	GetBlacklistResp getBlacklist (1: GetBlacklistReq req)
	BaseResp deleteFriend (1: DeleteFriendReq req)
	BaseResp addFriendResponse (1: AddFriendResponseReq req)
	BaseResp setFriendComment (1: SetFriendCommentReq req)
	ImportFriendResp importFriend (1: ImportFriendReq req)

	// Cross global
    CreateCrossGlobalChannelResp createCrossGlobalChannel(1: CreateCrossGlobalChannelReq req)
    CloseCrossGlobalChannelResp closeCrossGlobalChannel(1: CloseCrossGlobalChannelReq req)

	CloseChatResp closeChat(1: CloseChatReq req)
	MuteChatResp muteChat(1: MuteChatReq req)

	BaseResp bindAlliance(1: BindAllianceReq req)

	BaseResp buildGroupIcon(1: BuildGroupIconReq req)

	BaseResp clearGlobalChannel(1: ClearGlobalChannelReq req)
}

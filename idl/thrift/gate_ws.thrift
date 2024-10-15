namespace java thrift_gen.oasis_im.gate_ws

include "oasis_im_rpc.thrift"

struct Header {
	1: string operationID
	2: i32 msgIncr
}

enum MSGID {
	MSG_ID_INVALID = 0
	PING = 1
	PONG = 2

	GET_NEWEST_SEQ_REQ = 100
	GET_NEWEST_SEQ_RESP = 101
	PULL_MSG_REQ = 102
	PULL_MSG_RESP = 103
	SEND_MSG_REQ = 104
	SEND_MSG_RESP = 105
	USER_MSG = 106
	BASE_RESPONSE = 109
    PULL_SESSION_LIST_REQ = 112
    PULL_SESSION_LIST_RESP = 113
    PULL_NEWEST_SEQ_BATCH_REQ = 114
    PULL_NEWEST_SEQ_BATCH_RESP = 115
    PULL_SESSION_LIST_V2_REQ = 116
    PULL_SESSION_LIST_V2_RESP = 117

    CREATE_GROUP_REQ = 201
    CREATE_GROUP_RESP = 202
    SET_GROUP_INFO_REQ = 203
    SET_GROUP_INFO_RESP = 204
    LEAVE_GROUP_REQ = 205
    LEAVE_GROUP_RESP = 206
    DELETE_GROUP_REQ = 207
    DELETE_GROUP_RESP = 208
    ADD_GROUP_MEMBER_REQ = 209
    ADD_GROUP_MEMBER_RESP = 210
    DEL_GROUP_MEMBER_REQ = 211
    DEL_GROUP_MEMBER_RESP = 212
    SET_GROUP_MEMBER_LEVEL_REQ = 213
    SET_GROUP_MEMBER_LEVEL_RESP = 214
    PULL_GROUP_MEMBER_LIST_REQ = 215
    PULL_GROUP_MEMBER_LIST_RESP = 216
    BAN_USER_IN_GROUP_REQ = 217
    BAN_USER_IN_GROUP_RESP = 218
    UNBAN_USER_IN_GROUP_REQ = 219
    UNBAN_USER_IN_GROUP_RESP = 220
    CREATE_SINGLE_CHAT_REQ = 221
    CREATE_SINGLE_CHAT_RESP = 222
    CLOSE_CHAT_REQ = 223
    CLOSE_CHAT_RESP = 224
    MUTE_CHAT_REQ = 225
    MUTE_CHAT_RESP = 226
    ADD_BLACKLIST_REQ = 227
    ADD_BLACKLIST_RESP = 228
    DEL_BLACKLIST_REQ = 229
    DEL_BLACKLIST_RESP = 230

    JOIN_GROUP_PUSH = 301
    GROUP_MEMBER_UPDATE_PUSH = 302
    LEAVE_GROUP_PUSH = 303
    GROUP_INFO_UPDATE_PUSH = 304
    CROSS_GLOBAL_CHAT_PUSH = 305
}

enum WSERR {
    ERROR_MISS_HEADER = 1000
    ERROR_INVALID_TOKEN = 1001
    ERROR_MSG_TOO_LONG = 1002
    ERROR_SERVER_BUSY = 1003
    ERROR_PERMISSION_DENIED = 1004
    ERROR_ILLEGAL_ARGS = 105
}

struct IMMessage {
	1: MSGID ID
	2: binary binaryBody
	3: string textBody
}

struct Ping {
    1: Header header
}

struct Pong {
    1: i32 msgIncr
}
//CHAT BODY
struct GetNewestSeqReq {
	1: Header header
	2: oasis_im_rpc.SESSION_TYPE msgType
	3: string sessionKey // 私聊为对方 uid，群聊为 groupId，世界频道为 serverId
}
struct GetNewestSeqResp {
	1: i32 msgIncr
	2: i32 errCode
	3: string errMsg
	4: i64 seq
	5: oasis_im_rpc.SESSION_TYPE msgType
    6: string sessionKey // 私聊为对方 uid，群聊为 groupId，世界频道为 serverId
}
struct PullMsgReq {
	1: Header header
	2: i64 seqBegin
	3: i64 seqEnd
	5: oasis_im_rpc.SESSION_TYPE msgType
	6: string sessionKey // 私聊为对方 uid，群聊为 groupId，世界频道为 serverId
}
struct PullMsgResp {
	1: i32 msgIncr
	2: i32 errCode
	3: string errMsg
	4: i64 maxSeq
	5: i64 minSeq
	6: oasis_im_rpc.SESSION_TYPE msgType
	7: oasis_im_rpc.GatherFormat msg
}
struct SendMsgReq {
	1: Header header
	2: i32 platformID
	3: string recvID //uid or groupId
	4: oasis_im_rpc.SESSION_TYPE sessionType
	5: oasis_im_rpc.MSG_FROM msgFrom
	6: oasis_im_rpc.CONTENT_TYPE contentType
	7: string content
	8: string clientMsgID
	9: map<string, string> options
	10: map<string, string> ext
	11: list<oasis_im_rpc.AtUser> atUsers
	12: i64 replySeq
}

struct SendMsgResp {
	1: i32 msgIncr
	2: i32 errCode
	3: string errMsg
	4: string clientMsgID
	5: string serverMsgID
	6: string punishInfo
}

struct PullSessionListReq {
    1: Header header
}

struct PullSessionListResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: list<oasis_im_rpc.GroupInfo> groupChats
    5: list<oasis_im_rpc.SingleChat> singleChats
    6: map<string, string> groupSettings
    7: map<string, string> singleSettings
}

struct PullNewestSeqBatchReq {
    1: Header header
    2: oasis_im_rpc.GetNewestSeqBatch data
}

struct PullNewestSeqBatchResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: map<string, i64> singleSeqMap
    5: map<string, i64> groupSeqMap
    6: map<string, i64> globalSeqMap
    7: map<string, i64> crossSeqMap
}

struct PullSessionListV2Req {
    1: Header header
}

struct PullSessionListV2Resp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: oasis_im_rpc.GlobalSessionInfo globalChat
    5: list<oasis_im_rpc.GroupSessionInfo> groupChats
    6: list<oasis_im_rpc.SingleSessionInfo> singleChats
    7: oasis_im_rpc.CrossGlobalSessionInfo crossChat
    8: list<oasis_im_rpc.UserInfo> blacklist
}

struct CreateGroupReq {
    1: Header header
    2: oasis_im_rpc.CreateGroup data
}

struct CreateGroupResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: string groupId
    5: string ownerId
}

struct DeleteGroupReq {
    1: Header header
    2: oasis_im_rpc.DeleteGroup data
}

struct DeleteGroupResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
}

struct SetGroupInfoReq {
    1: Header header
    2: oasis_im_rpc.SetGroupInfo data
}

struct SetGroupInfoResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
}

struct LeaveGroupReq {
    1: Header header
    2: string groupId
}

struct LeaveGroupResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
}

struct AddGroupMemberReq {
    1: Header header
    2: oasis_im_rpc.AddGroupMemberBatch data
}

struct AddGroupMemberResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: list<oasis_im_rpc.Id2Result> result
}

struct DelGroupMemberReq {
    1: Header header
    2: oasis_im_rpc.DelGroupMemberBatch data
}

struct DelGroupMemberResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: list<oasis_im_rpc.Id2Result> result
}

struct SetGroupMemberBatchReq {
    1: Header header
    2: oasis_im_rpc.ModifyGroupMemberBatch data
}

struct SetGroupMemberBatchResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: list<oasis_im_rpc.Id2Result> result
}

struct PullGroupMemberListReq {
    1: Header header
    2: oasis_im_rpc.GetGroupMemberList data
}

struct PullGroupMemberListResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: list<oasis_im_rpc.GroupMemberFullInfo> memberList
    5: i32 nextSeq
}

struct BanUserInGroupReq {
    1: Header header
    2: oasis_im_rpc.BatchBanUserInGroup data
}

struct BanUserInGroupResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
}

struct UnbanUserInGroupReq {
    1: Header header
    2: oasis_im_rpc.BatchUnbanUserInGroup data
}

struct UnbanUserInGroupResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
}

struct CreateSingleChatReq {
    1: Header header
    2: string targetUid
}

struct CreateSingleChatResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: oasis_im_rpc.SingleChat chat
}


struct CloseChatReq {
    1: Header header
    2: oasis_im_rpc.SESSION_TYPE sessionType
    3: string sessionKey
    4: bool close
}

struct CloseChatResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: oasis_im_rpc.SESSION_TYPE sessionType
    5: string sessionKey
    6: string setting
}

struct MuteChatReq {
    1: Header header
    2: oasis_im_rpc.SESSION_TYPE sessionType
    3: string sessionKey
    4: bool mute
}

struct MuteChatResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: oasis_im_rpc.SESSION_TYPE sessionType
    5: string sessionKey
    6: string setting
}

struct AddBlacklistReq {
    1: Header header
    2: string blockUid
}

struct AddBlacklistResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: oasis_im_rpc.UserInfo blockUserInfo
}

struct DelBlacklistReq {
    1: Header header
    2: string blockUid
}

struct DelBlacklistResp {
    1: i32 msgIncr
    2: i32 errCode
    3: string errMsg
    4: string blockUid
}

struct JoinGroupPush {
    1: oasis_im_rpc.GroupInfo data
}

enum LeaveGroupType {
    LEAVE = 1
    KICKED = 2
    DISBAND = 3
}

struct LeaveGroupPush {
    1: string groupId
    2: LeaveGroupType type
}

struct GroupMemberUpdatePush {
    1: string groupId
    2: list<oasis_im_rpc.ModifyGroupMemberInfo> updateList
    3: list<oasis_im_rpc.GroupMemberFullInfo> addList
    4: list<string> removed
    5: i32 memberCount
}

struct GroupInfoUpdatePush {
    1: oasis_im_rpc.SetGroupInfo data
}

struct CrossGlobalChatPush {
    1: oasis_im_rpc.CrossGlobalSessionInfo data
    2: bool open
}
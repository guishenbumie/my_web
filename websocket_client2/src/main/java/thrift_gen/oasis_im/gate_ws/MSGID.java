/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift_gen.oasis_im.gate_ws;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum MSGID implements org.apache.thrift.TEnum {
  MSG_ID_INVALID(0),
  PING(1),
  PONG(2),
  GET_NEWEST_SEQ_REQ(100),
  GET_NEWEST_SEQ_RESP(101),
  PULL_MSG_REQ(102),
  PULL_MSG_RESP(103),
  SEND_MSG_REQ(104),
  SEND_MSG_RESP(105),
  USER_MSG(106),
  BASE_RESPONSE(109),
  PULL_SESSION_LIST_REQ(112),
  PULL_SESSION_LIST_RESP(113),
  PULL_NEWEST_SEQ_BATCH_REQ(114),
  PULL_NEWEST_SEQ_BATCH_RESP(115),
  PULL_SESSION_LIST_V2_REQ(116),
  PULL_SESSION_LIST_V2_RESP(117),
  CREATE_GROUP_REQ(201),
  CREATE_GROUP_RESP(202),
  SET_GROUP_INFO_REQ(203),
  SET_GROUP_INFO_RESP(204),
  LEAVE_GROUP_REQ(205),
  LEAVE_GROUP_RESP(206),
  DELETE_GROUP_REQ(207),
  DELETE_GROUP_RESP(208),
  ADD_GROUP_MEMBER_REQ(209),
  ADD_GROUP_MEMBER_RESP(210),
  DEL_GROUP_MEMBER_REQ(211),
  DEL_GROUP_MEMBER_RESP(212),
  SET_GROUP_MEMBER_LEVEL_REQ(213),
  SET_GROUP_MEMBER_LEVEL_RESP(214),
  PULL_GROUP_MEMBER_LIST_REQ(215),
  PULL_GROUP_MEMBER_LIST_RESP(216),
  BAN_USER_IN_GROUP_REQ(217),
  BAN_USER_IN_GROUP_RESP(218),
  UNBAN_USER_IN_GROUP_REQ(219),
  UNBAN_USER_IN_GROUP_RESP(220),
  CREATE_SINGLE_CHAT_REQ(221),
  CREATE_SINGLE_CHAT_RESP(222),
  CLOSE_CHAT_REQ(223),
  CLOSE_CHAT_RESP(224),
  MUTE_CHAT_REQ(225),
  MUTE_CHAT_RESP(226),
  ADD_BLACKLIST_REQ(227),
  ADD_BLACKLIST_RESP(228),
  DEL_BLACKLIST_REQ(229),
  DEL_BLACKLIST_RESP(230),
  JOIN_GROUP_PUSH(301),
  GROUP_MEMBER_UPDATE_PUSH(302),
  LEAVE_GROUP_PUSH(303),
  GROUP_INFO_UPDATE_PUSH(304),
  CROSS_GLOBAL_CHAT_PUSH(305);

  private final int value;

  private MSGID(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MSGID findByValue(int value) { 
    switch (value) {
      case 0:
        return MSG_ID_INVALID;
      case 1:
        return PING;
      case 2:
        return PONG;
      case 100:
        return GET_NEWEST_SEQ_REQ;
      case 101:
        return GET_NEWEST_SEQ_RESP;
      case 102:
        return PULL_MSG_REQ;
      case 103:
        return PULL_MSG_RESP;
      case 104:
        return SEND_MSG_REQ;
      case 105:
        return SEND_MSG_RESP;
      case 106:
        return USER_MSG;
      case 109:
        return BASE_RESPONSE;
      case 112:
        return PULL_SESSION_LIST_REQ;
      case 113:
        return PULL_SESSION_LIST_RESP;
      case 114:
        return PULL_NEWEST_SEQ_BATCH_REQ;
      case 115:
        return PULL_NEWEST_SEQ_BATCH_RESP;
      case 116:
        return PULL_SESSION_LIST_V2_REQ;
      case 117:
        return PULL_SESSION_LIST_V2_RESP;
      case 201:
        return CREATE_GROUP_REQ;
      case 202:
        return CREATE_GROUP_RESP;
      case 203:
        return SET_GROUP_INFO_REQ;
      case 204:
        return SET_GROUP_INFO_RESP;
      case 205:
        return LEAVE_GROUP_REQ;
      case 206:
        return LEAVE_GROUP_RESP;
      case 207:
        return DELETE_GROUP_REQ;
      case 208:
        return DELETE_GROUP_RESP;
      case 209:
        return ADD_GROUP_MEMBER_REQ;
      case 210:
        return ADD_GROUP_MEMBER_RESP;
      case 211:
        return DEL_GROUP_MEMBER_REQ;
      case 212:
        return DEL_GROUP_MEMBER_RESP;
      case 213:
        return SET_GROUP_MEMBER_LEVEL_REQ;
      case 214:
        return SET_GROUP_MEMBER_LEVEL_RESP;
      case 215:
        return PULL_GROUP_MEMBER_LIST_REQ;
      case 216:
        return PULL_GROUP_MEMBER_LIST_RESP;
      case 217:
        return BAN_USER_IN_GROUP_REQ;
      case 218:
        return BAN_USER_IN_GROUP_RESP;
      case 219:
        return UNBAN_USER_IN_GROUP_REQ;
      case 220:
        return UNBAN_USER_IN_GROUP_RESP;
      case 221:
        return CREATE_SINGLE_CHAT_REQ;
      case 222:
        return CREATE_SINGLE_CHAT_RESP;
      case 223:
        return CLOSE_CHAT_REQ;
      case 224:
        return CLOSE_CHAT_RESP;
      case 225:
        return MUTE_CHAT_REQ;
      case 226:
        return MUTE_CHAT_RESP;
      case 227:
        return ADD_BLACKLIST_REQ;
      case 228:
        return ADD_BLACKLIST_RESP;
      case 229:
        return DEL_BLACKLIST_REQ;
      case 230:
        return DEL_BLACKLIST_RESP;
      case 301:
        return JOIN_GROUP_PUSH;
      case 302:
        return GROUP_MEMBER_UPDATE_PUSH;
      case 303:
        return LEAVE_GROUP_PUSH;
      case 304:
        return GROUP_INFO_UPDATE_PUSH;
      case 305:
        return CROSS_GLOBAL_CHAT_PUSH;
      default:
        return null;
    }
  }
}

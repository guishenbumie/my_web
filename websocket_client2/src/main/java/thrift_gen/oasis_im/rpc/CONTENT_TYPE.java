/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift_gen.oasis_im.rpc;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum CONTENT_TYPE implements org.apache.thrift.TEnum {
  CT_INVALID(0),
  Text(101),
  Picture(102),
  Voice(103),
  Video(104),
  File(105),
  AtText(106),
  Merger(107),
  Card(108),
  Location(109),
  CUSTOM(110),
  Revoke(111),
  HasReadReceipt(112),
  Typing(113),
  Quote(114),
  SingleTipBegin(200),
  AcceptFriendApplicationTip(201),
  AddFriendTip(202),
  RefuseFriendApplicationTip(203),
  SetSelfInfoTip(204),
  RevokeServer(205),
  C2C_MESSAGE_AS_READ(206),
  KickOnlineTip(303),
  SingleTipEnd(399),
  GroupTipBegin(500),
  TransferGroupOwnerTip(501),
  CreateGroupTip(502),
  JoinGroupTip(504),
  QuitGroupTip(505),
  SetGroupInfoTip(506),
  AcceptGroupApplicationTip(507),
  RefuseGroupApplicationTip(508),
  KickGroupMemberTip(509),
  InviteUserToGroupTip(510),
  DeleteGroupTip(511),
  GroupTipEnd(599);

  private final int value;

  private CONTENT_TYPE(int value) {
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
  public static CONTENT_TYPE findByValue(int value) { 
    switch (value) {
      case 0:
        return CT_INVALID;
      case 101:
        return Text;
      case 102:
        return Picture;
      case 103:
        return Voice;
      case 104:
        return Video;
      case 105:
        return File;
      case 106:
        return AtText;
      case 107:
        return Merger;
      case 108:
        return Card;
      case 109:
        return Location;
      case 110:
        return CUSTOM;
      case 111:
        return Revoke;
      case 112:
        return HasReadReceipt;
      case 113:
        return Typing;
      case 114:
        return Quote;
      case 200:
        return SingleTipBegin;
      case 201:
        return AcceptFriendApplicationTip;
      case 202:
        return AddFriendTip;
      case 203:
        return RefuseFriendApplicationTip;
      case 204:
        return SetSelfInfoTip;
      case 205:
        return RevokeServer;
      case 206:
        return C2C_MESSAGE_AS_READ;
      case 303:
        return KickOnlineTip;
      case 399:
        return SingleTipEnd;
      case 500:
        return GroupTipBegin;
      case 501:
        return TransferGroupOwnerTip;
      case 502:
        return CreateGroupTip;
      case 504:
        return JoinGroupTip;
      case 505:
        return QuitGroupTip;
      case 506:
        return SetGroupInfoTip;
      case 507:
        return AcceptGroupApplicationTip;
      case 508:
        return RefuseGroupApplicationTip;
      case 509:
        return KickGroupMemberTip;
      case 510:
        return InviteUserToGroupTip;
      case 511:
        return DeleteGroupTip;
      case 599:
        return GroupTipEnd;
      default:
        return null;
    }
  }
}

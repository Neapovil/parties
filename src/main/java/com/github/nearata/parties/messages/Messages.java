package com.github.nearata.parties.messages;

public enum Messages
{
    NO_PARTY("no_party"),
    HAS_PARTY("has_party"),
    SENDER_INVITED_EXPIRED("sender_invited_expired"),
    PARTY_INVITED_JOINED("party_invited_joined"),
    SENDER_INVITED_JOINED("sender_invited_joined"),
    PARTY_CHAT_MESSAGE("party_chat_message"),
    SENDER_PARTY_CREATED("sender_party_created"),
    SENDER_CANNOT_DISBAND("sender_cannot_disband"),
    PARTY_DISBANDED("party_disbanded"),
    SENDER_DISBANDED("sender_disbanded"),
    SENDER_NO_PERMISSIONS("sender_no_permissions"),
    SENDER_CANNOT_SELF_INVITED("self_cannot_self_invited"),
    SENDER_INVITED_PLAYER_HAS_PARTY("self_invited_player_has_party"),
    SENDER_PLAYER_ALREADY_INVITED("self_player_already_invited"),
    SENDER_PLAYER_INVITED("self_player_invited"),
    PLAYER_INVITED("player_invited"),
    SENDER_CANNOT_KICK_SELF("sender_cannot_kick_self"),
    SENDER_PLAYER_NOT_IN_PARTY("sender_player_not_in_party"),
    SENDER_CANNOT_KICK_MOD("sender_cannot_kick_mod"),
    SENDER_CANNOT_KICK_LEADER("sender_cannot_kick_leader"),
    PLAYER_KICKED("player_kicked"),
    PARTY_KICKED("party_kicked"),
    SENDER_KICKED("sender_kicked"),
    SENDER_CANNOT_LEAVE_LEADER("sender_cannot_leave_leader"),
    PARTY_PLAYER_LEFT("party_player_left"),
    SENDER_PARTY_LEFT("sender_party_left"),
    SENDER_NO_PERMISSIONS_ONLY_LEADER("sender_no_permissions_only_leader"),
    SENDER_CANNOT_PROMOTE_SELF("sender_cannot_promote_self"),
    SENDER_PLAYER_NOT_FOUND("sender_player_not_found"),
    SENDER_PARTY_RANK_NOT_FOUND("sender_party_rank_not_found"),
    SENDER_PLAYER_ALREADY_MOD("sender_player_already_mod"),
    PLAYER_PROMOTED("player_promoted"),
    PARTY_PROMOTED("party_promoted"),
    SENDER_PROMOTED("sender_promoted"),
    SENDER_CANNOT_DEMOTE_LEADER("sender_cannot_demote_leader"),
    SENDER_PLAYER_NOT_MOD("sender_player_not_mod"),
    PLAYER_DEMOTED("player_demoted"),
    PARTY_DEMOTED("party_demoted"),
    SENDER_DEMOTED("sender_demoted"),
    SENDER_PARTY_LIST_LEADER("sender_party_list_leader"),
    SENDER_PARTY_LIST_MODS("sender_party_list_mods"),
    SENDER_PARTY_LIST_MEMBERS("sender_party_list_members");

    private final String path;

    Messages(String path)
    {
        this.path = path;
    }

    public String get()
    {
        return "messages." + this.path;
    }
}
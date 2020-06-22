package com.food.web.player;

import org.springframework.stereotype.Component;

@Component



public class PlayerDTO {
    private String playerId,playerName,passwd,addrs;
    private Long seq;

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }



    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                ", passwd='" + passwd + '\'' +
                ", addrs='" + addrs + '\'' +
                '}';
    }
}
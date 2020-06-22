package com.food.web.player;

import lombok.*;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Player {
    //playerId,playerName,passwd,addrs
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;
    @Column(length = 50)
    private String playerId;

    @Column(length = 50)
    private String playerName;
    @Column(length = 50)
    private String passwd;
    @Column(length = 50)
    private String addrs;

    @Builder
    public Player(String playerId,String playerName, String passwd,String addrs){
        this.playerId=playerId;
        this.playerName=playerName;
        this.passwd=passwd;
        this.addrs=addrs;
    }



}

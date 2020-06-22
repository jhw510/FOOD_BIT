package com.food.web.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired PlayerService playerService;
    @Autowired PlayerDTO player;
    @GetMapping("")
    public List<PlayerDTO> list(){
        return playerService.retrieve();
    }
    @PostMapping("/{playerId}/access")
    public Map<String, Object> login(
            @PathVariable String  playerId,

            @RequestBody PlayerDTO params){
        Map<String,Object> map = new HashMap<>();
        player = playerService.login(params);
        System.out.println(playerId);
        System.out.println(params.toString());
        if(player != null){
            System.out.println("로그인 정보 "+ player.toString());

            map.put("result", true);
        }else{
            map.put("result", false);
        }
        map.put("player", player);
        return map;
    }
    @PostMapping("/{playerId}/join")
    public Map<String, Object> join(
            @PathVariable String  playerId,
            @RequestBody PlayerDTO params){
        Map<String,Object> map = new HashMap<>();
      playerService.join(params);
        System.out.println("아이디는"+playerId);
        System.out.println(params.toString());

        return map;
    }
}
package com.food.web.player;



import com.food.web.mappers.PlayerMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    final static Logger log = LoggerFactory.getLogger(PlayerServiceImpl.class);
    @Autowired PlayerMapper playerMapper;
    @Override
    public List<PlayerDTO> retrieve() {
        return playerMapper.selectAll();
    }

    @Override
    public PlayerDTO findOne(String searchWord) {
        return playerMapper.selectOne(searchWord);
    }
    @Override
    public PlayerDTO login(PlayerDTO params) {
        return playerMapper.login(params);
    }

    @Override
    public void join(PlayerDTO params) {
        log.info("join()");
        playerMapper.insertPlayer(params);
        log.info("correctly finish");
    }


}
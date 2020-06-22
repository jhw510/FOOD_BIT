package com.food.web.mappers;
import com.food.web.player.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMapper {
    public void insertPlayer(PlayerDTO params);
    public List<PlayerDTO> selectAll();

    public PlayerDTO selectOne(String searchWord);

    public PlayerDTO login(PlayerDTO params);

}
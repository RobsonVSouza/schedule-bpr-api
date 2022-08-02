package com.rd.bpr.domain.player;

import com.rd.bpr.domain.player.dto.PlayerDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PlayerMapper {

    public abstract PlayerDto doToDto(Player playerEntity);

    public abstract Player toPlayerentity(PlayerDto dtoPlayer);


    public abstract List<PlayerDto> toListDto(List<Player> entityList);
}

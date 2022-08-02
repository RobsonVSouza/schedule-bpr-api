package com.rd.bpr.domain.player;

import com.rd.bpr.domain.player.dto.PlayerDto;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private static PlayerRepository playerRepository;

    @Autowired
    private static PlayerMapper playerMapper;

    // save
    public PlayerDto save(PlayerDto dtoPlayer){
        Player playerEntity = playerRepository.findByDocument(dtoPlayer.getDocument());
        if (playerEntity != null){
            throw new EntityExistsException("O usuario ja existe!");
        }
        return playerMapper.doToDto(playerRepository.save(playerMapper.toPlayerentity(dtoPlayer)));
    }

    // Update

    public PlayerDto update(PlayerDto dtoPlayer){
        Player playerEntity = playerRepository.findByDocument(dtoPlayer.getDocument());
        if (playerEntity == null){
            throw new EntityExistsException("O usuario não existe");
        }
        return playerMapper.doToDto(playerRepository.save(playerMapper.toPlayerentity(dtoPlayer)));
    }

    // getById

    public PlayerDto findById(Long id){
        Optional<Player> playeropt = playerRepository.findById(id);
        if (playeropt.isEmpty()){
            throw new EntityNotFoundException("O usuario não existe");
        }
        return playerMapper.doToDto(playeropt.get());
    }

    // GetAll

    public List<PlayerDto> getAll(){
        return playerMapper.toListDto(playerRepository.findAll());
    }

    //DeleteById

    public void deleteById(long id){
        PlayerDto playerDto = findById(id);
        playerRepository.deleteById(id);
    }

}

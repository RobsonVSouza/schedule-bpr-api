package com.rd.bpr.domain.player;


import com.rd.bpr.domain.lessor.Lessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PlayerRepository extends JpaRepository <Player, Long> {

    Player findByDocument(String document);

}

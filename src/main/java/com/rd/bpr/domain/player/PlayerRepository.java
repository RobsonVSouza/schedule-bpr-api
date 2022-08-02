package com.rd.bpr.domain.player;



import org.springframework.data.jpa.repository.JpaRepository;



public interface PlayerRepository extends JpaRepository <Player, Long> {

    Player findByDocument(String email);

}

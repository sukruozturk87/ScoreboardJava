package com.sukruozturk.scoreboard.domain;

import org.springframework.data.repository.CrudRepository;


public interface PlayerRepository extends CrudRepository<Player, Long>{

	Player findByName(String name);
}

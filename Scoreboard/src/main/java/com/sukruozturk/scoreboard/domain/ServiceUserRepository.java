package com.sukruozturk.scoreboard.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceUserRepository extends CrudRepository<ServiceUser, Long> {

	ServiceUser findByUserName(String userName);
}

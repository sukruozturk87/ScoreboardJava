package com.sukruozturk.scoreboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sukruozturk.scoreboard.domain.ServiceUser;
import com.sukruozturk.scoreboard.domain.ServiceUserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private ServiceUserRepository serviceUserRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		ServiceUser currentUser = serviceUserRepository.findByUserName(userName);

		UserDetails user = new User(userName, currentUser.getPassword(),
				true, true, true, true, AuthorityUtils.createAuthorityList(currentUser.getRole()));
		return user;
	}

}

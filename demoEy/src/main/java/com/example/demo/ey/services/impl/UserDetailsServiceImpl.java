package com.example.demo.ey.services.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.ey.models.User;
import com.example.demo.ey.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	final UserRepository userRepository;

    UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String token) throws UsernameNotFoundException {
		User user = userRepository.findByToken(token)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with token: " + token));

		return UserDetailsImpl.build(user);
	}

}

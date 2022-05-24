package com.doan.tstore.Security.Service;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import com.doan.tstore.Security.Entities.UserDetail;
import com.doan.tstore.Model.User;
import com.doan.tstore.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class CustomUserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user =  userRepository.findOneByEmail(email);
		
    if (null == user) {
      throw new UsernameNotFoundException("User Not Found with email " + email);
    }

    UserDetail userDetails = new UserDetail() {};
    List<SimpleGrantedAuthority> authorityList = new ArrayList<>() {
    };
    authorityList.add(new SimpleGrantedAuthority(user.getUserType().getName()));
    userDetails.setEmail(user.getEmail());
    userDetails.setPassword(user.getPassword());
    userDetails.setAuthorities(authorityList);
    userDetails.setAvatar(user.getAvatar());
    userDetails.setName(user.getName());

    // System.out.println("Load " + userDetails.toString());
    // System.out.println("Load " + user.toString());
    
		return userDetails;
	}

}


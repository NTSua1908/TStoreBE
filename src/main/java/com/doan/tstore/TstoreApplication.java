package com.doan.tstore;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.doan.tstore.Model.User;
import com.doan.tstore.Model.UserType;
import com.doan.tstore.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

// import java.io.Console;

// import com.doan.tstore.Model.Game;
// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.JsonMappingException;
// import com.fasterxml.jackson.databind.ObjectMapper;

// import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TstoreApplication {

	// @Autowired
	// private PasswordEncoder passwordEncoder;
	
	// @Autowired
	// private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(TstoreApplication.class, args);
	}

	// @PostConstruct
	// protected void init() {
		
	// 	User user = new User();
		
	// 	user.setEmail("sua@gmail.com");
	// 	user.setPassword(passwordEncoder.encode("123123"));
	// 	UserType type = new UserType();
	// 	type.setId(1);
	// 	user.setUserType(type);
		
	// 	userRepository.save(user);
		
	// }

}

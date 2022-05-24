package com.doan.tstore.Security;

import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.spec.InvalidKeySpecException;

import com.doan.tstore.Security.Config.JWTTokenHelper;
import com.doan.tstore.Security.Entities.LoginResponse;
import com.doan.tstore.Security.Entities.UserDetail;
import com.doan.tstore.Security.Request.AuthenticationRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JWTTokenHelper jWTTokenHelper;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@PostMapping("/auth/login")
	public ResponseEntity<?> login(@RequestBody AuthenticationRequest authenticationRequest) throws InvalidKeySpecException, NoSuchAlgorithmException {

		final Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
				authenticationRequest.getUserName(), authenticationRequest.getPassword()));
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		UserDetail user = (UserDetail) authentication.getPrincipal();

		String jwtToken = jWTTokenHelper.generateToken(user.getUsername());
		
		LoginResponse response=new LoginResponse();
		response.setToken(jwtToken);
		while (user.getAuthorities().iterator().hasNext())
		{
			response.setRole(user.getAuthorities().iterator().next().getAuthority());
			break;
		}
		response.setAvatar(user.getAvatar());
		response.setName(user.getName());
		
		System.out.println(user.toString());
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/auth/userinfo")
	public ResponseEntity<?> getUserInfo(Principal user) {
		UserDetail userObj = (UserDetail) userDetailsService.loadUserByUsername(user.getName());

		// UserInfo userInfo = new UserInfo();
		// userInfo.setFirstName(userObj.getFirstName());
		// userInfo.setLastName(userObj.getLastName());
		// userInfo.setRoles(userObj.getAuthorities().toArray());

		return ResponseEntity.ok("hehe");
	}
	
	@GetMapping("/auth/a")
	public ResponseEntity<?> getUserInfor(Principal user) {

		return ResponseEntity.ok("userInfo");
	}
}

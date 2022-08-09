package com.lms.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.book.model.JwtRequest;
import com.lms.book.model.JwtResponse;
import com.lms.book.service.CustomUserDetailService;
import com.lms.book.util.JwtUtil;

@RestController
public class JWTController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private CustomUserDetailService customUserDetailService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/token")
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{
		System.out.println(jwtRequest);
		try {
			
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUserName(), jwtRequest.getPassword()));
			
		} catch (UsernameNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Bad credentials");
		}  catch (BadCredentialsException e) {
			e.printStackTrace();
			throw new Exception("Bad credentials");
		}
		
		
		// fine area
		UserDetails userDetails = this.customUserDetailService.loadUserByUsername(jwtRequest.getUserName());
		String token = this.jwtUtil.generateToken(userDetails);
		return  ResponseEntity.ok(new JwtResponse(token));
		
	}

}

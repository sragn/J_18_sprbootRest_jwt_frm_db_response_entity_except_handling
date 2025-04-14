package com.thinkconstructive.restdemo.controller;
import org.mindrot.jbcrypt.BCrypt;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.thinkconstructive.restdemo.model.AuthenticationRequest;
import com.thinkconstructive.restdemo.service.MyUserDetailsService;
import com.thinkconstructive.restdemo.service.UserService;
import com.thinkconstructive.restdemo.util.JwtUtil;

import com.thinkconstructive.restdemo.model.AuthenticationResponse;
import com.thinkconstructive.restdemo.response.ResponseHandler;

import org.springframework.web.bind.annotation.CrossOrigin;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


import javax.crypto.spec.IvParameterSpec;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*") // Replace with your allowed origin
public class MainController {

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	//@Autowired
	//MyUserDetailsService myUserDetailsService;

	@Autowired
	UserService myUserDetailsService;

//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//	
	@GetMapping("/hello")
	public String hello() {return "Hello world.";	
	}
	
	

	    // Method to hash a password for storage (if needed)
	    public static String hashPassword(String plainPassword) {
	        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
	    }

	    // Method to verify a user's password during login
	    public static boolean verifyPassword(String plainPassword, String hashedPassword) {
	        return BCrypt.checkpw(plainPassword, hashedPassword);
	    }

	@PostMapping("/authenticate")	
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{

/*		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);    
		//String input = authenticationRequest.getPassword();
		//if(input==null)
		//{
			String input="gone";
		//}
		  // Create a MessageDigest instance for SHA-1
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");

        // Compute the hash (convert input string to bytes)
        byte[] hashBytes = messageDigest.digest(input.getBytes());

        // Convert the hash bytes to a hexadecimal format (optional)
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        
        long timestamp = System.currentTimeMillis() - (5 * 60 + 30) * 60 * 1000;
        System.out.println("timestamp"+timestamp);

     // Convert milliseconds to ZonedDateTime
        ZonedDateTime dateTime = Instant.ofEpochMilli(timestamp)
                                        .atZone(ZoneId.systemDefault());
        // Define the desired format pattern (yyyyMMddHH)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHH");

        // Format the current date and time
        String formattedDateTime = dateTime.format(formatter);

        // Print the formatted date and time
        System.out.println("Formatted DateTime: " + formattedDateTime);
        
        // Print the SHA-1 hash in hex format
        System.out.println("SHA-1 Hash (Hex): " + hexString.toString());
        
        System.out.println("This is befor encoding:"+hexString.toString()+formattedDateTime);
        
        String decodedString = hexString.toString()+formattedDateTime;
        
        String hashedPasswordFromJs = authenticationRequest.getHkey();
        
      boolean matches = passwordEncoder.matches(decodedString, hashedPasswordFromJs);
      if (matches) {
          System.out.println("Password matches!");
      } else {
          System.out.println("Password does not match!");
      }


		String encryptedData = authenticationRequest.getPassword(); // Replace with your encrypted data
		String hashedPassword = authenticationRequest.getHkey();
		System.out.println("encryptedData"+encryptedData+"HKEY"+authenticationRequest.getHkey());
        String key = "YourSecretKey123"; // Must be 16, 24, or 32 bytes
        String iv = "YourIV1234567890"; // Must match the IV used during encryption

        byte[] decodedCiphertext = Base64.getDecoder().decode(encryptedData);
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes("UTF-8"));

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);

        byte[] decryptedBytes = cipher.doFinal(decodedCiphertext);
        String decryptedData = new String(decryptedBytes, "UTF-8");

        System.out.println("Decrypted Data: " + decryptedData);        
      
      if (verifyPassword(decodedString, hashedPassword)) {
          System.out.println("Login Successful!");
      } else {
          System.out.println("Invalid Credentials!");
      }
*/
        
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
			);
		}
		catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}
		
		final
			UserDetails userDetails = myUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		
		final String token = jwtTokenUtil.generateToken(userDetails);
		
		Map<String, Object> response =new HashMap<>();
		response.put("token", token); // Changed from "jwt" to "token"
		return ResponseEntity.ok(response);
		//return ResponseEntity.ok(new AuthenticationResponse(token));
		
	    //return ResponseHandler.responseBuilder("0",HttpStatus.OK, token,"1");
	

	}
}

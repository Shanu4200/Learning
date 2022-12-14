package com.jwt.helper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	
	private static final long serialVersionUID = -2550185165626007488L;
	
	public static final long JWT_TOKEN_VALIDITY = 1000 * 60 * 60 * 10;
	
	private String secret="Vishal";
	
	//Retrieve Username from jwt token
	public String getUsernameFromToken(String token) 
	{
		return getClaimFromToken(token, Claims::getSubject);
	}
	
	//Retrieve expiration date from jwt token
	public Date getExpirationDateFromToken(String token) 
	{
		return getClaimFromToken(token, Claims::getExpiration);
    }
	
	public <T> T getClaimFromToken(String token, Function<Claims, T> claimResolver)
	{
		final Claims claims = getAllClaimsFromToken(token);
		
		return claimResolver.apply(claims);
	}
	
	//For Retrieving any information from token we'll need a Secret Key
	private Claims getAllClaimsFromToken(String token)
	{
		return Jwts.parser().setSigningKey(secret).parseClaimsJwt(token).getBody();
	}
	
	//Check if the Token has Expired
	private Boolean isTokenExpired(String token)
	{
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	//Generate Token for User
	 public String generateToken(UserDetails userDetails)
	 {
	  Map<String, Object> claims = new HashMap<>();
	  return doGenerateToken(claims, userDetails.getUsername());
	 }
	 
	 private String doGenerateToken(Map<String, Object> claims, String subject)
	 {

	   return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
	   .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY))
	   .signWith(SignatureAlgorithm.HS256, secret).compact();
	  }
	 
	 //Validate Token
	  public Boolean validateToken(String token, UserDetails userDetails) 
	  {
	    final String username = getUsernameFromToken(token);
	    return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	  }

}

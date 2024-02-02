package com.royalbrains.springsecurity.services.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Date;

public class JWTServiceImpl {

    public String generateToken(UserDetails userDetails){
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*24))
                .signWith(getSignedKey(), SignatureAlgorithm.ES256)
                .compact();
    }


    private Key getSignedKey(){
        byte[] key= Decoders.BASE64.decode("456789023456789000000098764567898765");
        return Keys.hmacShaKeyFor(key);
    }
}

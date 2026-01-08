package com.anilit.resource;

import io.smallrye.jwt.build.Jwt;
import jakarta.inject.Singleton;
java.lang.*;

@Singleton
public class TokenService {

    public String generateToken(){
        Set<String> roles = new HashSet<>(Arrays.asList("admin", "teacher"));

        return Jwt.issuer("jwt-token")
                .subject("course")
                .groups(roles)
                .expiresAt(System.currentTimeMillis()/ 1000 + 3600)
                .sign();
    }
}

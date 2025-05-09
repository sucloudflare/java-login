package org.example.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    private static final String SECRET_KEY = "secreta";  // Chave secreta pode ser gerenciada de maneira mais segura, por exemplo, em um arquivo de configuração.

    public String generateToken(String username) {
        Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());  // Usando a chave secreta de forma mais segura
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))  // Expira em 10 horas
                .signWith(key, SignatureAlgorithm.HS256)  // Usando o método correto para assinar com a chave
                .compact();
    }
}

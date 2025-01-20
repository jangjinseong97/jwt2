package com.green.jwt.config.security;

import com.green.jwt.config.jwt.JwtUser;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFacade {
    // 기존엔 권한까지 담았지만 지금은 pk값만 있으면 된다

    public static long getSignedUserId(){
        return ((JwtUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getSignedUserId();
    }
}

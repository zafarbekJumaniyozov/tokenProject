package teda.uz.tokenProjectServer.config;

import teda.uz.tokenProjectServer.security.JwtAuthenticationEntryPoint;
import teda.uz.tokenProjectServer.services.AuthService;

public class SecurityConfigBuilder {
    private AuthService authService;
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    public SecurityConfigBuilder setAuthService(AuthService authService) {
        this.authService = authService;
        return this;
    }

    public SecurityConfigBuilder setJwtAuthenticationEntryPoint(JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint) {
        this.jwtAuthenticationEntryPoint = jwtAuthenticationEntryPoint;
        return this;
    }


}
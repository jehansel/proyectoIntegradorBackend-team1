package com.petcare.backend.proyectoIntegrador.service;

import com.petcare.backend.proyectoIntegrador.DTO.AuthResponse;
import com.petcare.backend.proyectoIntegrador.DTO.LoginRequest;
import com.petcare.backend.proyectoIntegrador.DTO.RegisterRequest;
import jakarta.mail.MessagingException;

public interface IAuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
    void enviarCorreoConfirmacion(String to, String subject, String htmlContent) throws MessagingException;
}

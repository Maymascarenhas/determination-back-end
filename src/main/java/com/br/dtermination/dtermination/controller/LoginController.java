package com.br.dtermination.dtermination.controller;

import com.br.dtermination.dtermination.model.Credenciais;
import com.br.dtermination.dtermination.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public LoginController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/login")
    public ResponseEntity<String> logarUsuario(@RequestBody Credenciais credenciais) {
        if (usuarioRepository.validaLoginESenha(credenciais) == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Falhou");
        }
        return ResponseEntity.ok("Sucesso");
    }
}

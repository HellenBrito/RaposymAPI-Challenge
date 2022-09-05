package br.com.fiap.raposymapi.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.raposymapi.model.LoginDto;

@RestController
public class AuthenticationController {

    @PostMapping("/api/auth")
    public ResponseEntity<Object> auth(@RequestBody LoginDto login){
        return ResponseEntity.ok().build();
    }

}

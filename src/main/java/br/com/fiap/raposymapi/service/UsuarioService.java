package br.com.fiap.raposymapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.fiap.raposymapi.model.Usuario;
import br.com.fiap.raposymapi.repository.UsuarioRepository;

public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;

    public void save(Usuario usuario){
        repository.save(usuario);
    }


}

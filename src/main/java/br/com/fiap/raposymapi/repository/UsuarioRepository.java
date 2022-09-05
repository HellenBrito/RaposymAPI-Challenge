package br.com.fiap.raposymapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.raposymapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Usuario findByEmail(String email);
    
}

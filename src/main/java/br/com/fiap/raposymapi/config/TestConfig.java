package br.com.fiap.raposymapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.fiap.raposymapi.model.Exercicio;
import br.com.fiap.raposymapi.model.Usuario;
import br.com.fiap.raposymapi.repository.ExercicioRepository;
import br.com.fiap.raposymapi.repository.UsuarioRepository;

@Configuration
public class TestConfig implements CommandLineRunner{
    @Autowired
    ExercicioRepository exercicioRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {

        exercicioRepository.saveAll(List.of(
            new Exercicio("Respiração", "Inspire fundo o máximo que conseguir, conte até 10 e expire.")
        ));

        Usuario usuario = new Usuario()
            .nome("Hellen")
            .email("hellencpb1@gmail.com")
            .senha(new BCryptPasswordEncoder().encode("123"));

        usuarioRepository.save(
            usuario
        );
        
    }
}

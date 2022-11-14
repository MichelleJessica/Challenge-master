package com.challengeada.PontoEletronico.Persistencia;

import com.challengeada.PontoEletronico.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {



}

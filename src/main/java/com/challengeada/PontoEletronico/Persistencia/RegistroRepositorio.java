package com.challengeada.PontoEletronico.Persistencia;

import com.challengeada.PontoEletronico.Entidades.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepositorio extends JpaRepository<Registro, Long> {



}

package com.challengeada.PontoEletronico.Persistencia;

import com.challengeada.PontoEletronico.Entidades.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {



}

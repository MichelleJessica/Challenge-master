package com.challengeada.PontoEletronico.Persistencia;

import com.challengeada.PontoEletronico.Entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, String> {



}

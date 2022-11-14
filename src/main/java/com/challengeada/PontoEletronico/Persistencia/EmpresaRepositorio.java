package com.challengeada.PontoEletronico.Persistencia;

import com.challengeada.PontoEletronico.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, String> {



}

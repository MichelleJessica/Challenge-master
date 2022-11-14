package com.challengeada.PontoEletronico.Entidades;

import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.List;

@RestController
@Service // denota serviços como spring
@Entity
@Data
@Table(name = "Empresa")

public class Empresa {

    @Id
    private String cnpj;

    @Column(name = "nome_empresa")
    private String nome;

    @OneToMany
    private List<Endereco> enderecoList;

    @OneToMany
    private List<Funcionario> funcionarioList;

}

package br.com.Interprise.cadastro.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Getter
@Setter
public class EmpresaModel extends UsuarioModel {

    private String cnpj;
    private BigDecimal saldo;
    private BigDecimal taxa;
}

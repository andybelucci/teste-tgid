package br.com.Interprise.cadastro.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class TransacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private ClienteModel cliente;
    @ManyToOne
    private EmpresaModel empresa;
    private BigDecimal valor;
    private LocalDateTime dataHora;
}

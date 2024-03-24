package br.com.Interprise.cadastro.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ClienteModel extends UsuarioModel {

    private String cpf;
}

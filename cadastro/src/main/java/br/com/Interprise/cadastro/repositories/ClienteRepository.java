package br.com.Interprise.cadastro.repositories;

import br.com.Interprise.cadastro.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}

package br.com.Interprise.cadastro.repositories;

import br.com.Interprise.cadastro.models.TransacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<TransacaoModel, Long> {
}

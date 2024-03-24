package br.com.Interprise.cadastro.repositories;

import br.com.Interprise.cadastro.models.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaModel, Long> {
}

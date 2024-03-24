package br.com.Interprise.cadastro.service;

import br.com.Interprise.cadastro.repositories.ClienteRepository;
import br.com.Interprise.cadastro.repositories.EmpresaRepository;
import br.com.Interprise.cadastro.repositories.TransacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {

    final TransacaoRepository transacaoRepository;
    final ClienteRepository clienteRepository;
    final EmpresaRepository empresaRepository;

    public TransacaoService(TransacaoRepository transacaoRepository, ClienteRepository clienteRepository, EmpresaRepository empresaRepository) {
        this.clienteRepository = clienteRepository;
        this.transacaoRepository = transacaoRepository;
        this.empresaRepository = empresaRepository;

    }
}

package br.com.Interprise.cadastro.controler;


import br.com.Interprise.cadastro.repositories.ClienteRepository;
import br.com.Interprise.cadastro.repositories.EmpresaRepository;
import br.com.Interprise.cadastro.repositories.TransacaoRepository;
import br.com.Interprise.cadastro.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoControler {

    @Autowired
    ClienteRepository clienteRepository;
    EmpresaRepository empresaRepository;
    TransacaoRepository transacaoRepository;

    final TransacaoService transacaoService;

    public TransacaoControler(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }
}

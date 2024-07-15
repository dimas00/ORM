package csi.ufsm.tarefaorm.service;
import csi.ufsm.tarefaorm.model.Produto;
import csi.ufsm.tarefaorm.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> obterTodosProdutos() {
        return produtoRepository.findAll();
    }
}
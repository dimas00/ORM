package csi.ufsm.tarefaorm.controller;

import csi.ufsm.tarefaorm.model.Produto;
import csi.ufsm.tarefaorm.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.salvarProduto(produto);
    }

    @GetMapping
    public List<Produto> obterProdutos() {
        return produtoService.obterTodosProdutos();
    }
}

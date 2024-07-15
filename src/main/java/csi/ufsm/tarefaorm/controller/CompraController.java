package csi.ufsm.tarefaorm.controller;
import csi.ufsm.tarefaorm.model.Compra;
import csi.ufsm.tarefaorm.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public Compra criarCompra(@RequestBody Compra compra) {
        return compraService.salvarCompra(compra);
    }

    @GetMapping
    public List<Compra> obterCompras() {
        return compraService.obterTodasCompras();
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Compra> obterComprasPorUsuario(@PathVariable Long usuarioId) {
        return compraService.obterComprasPorUsuario(usuarioId);
    }
}
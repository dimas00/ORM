package csi.ufsm.tarefaorm.service;

import csi.ufsm.tarefaorm.model.Compra;
import csi.ufsm.tarefaorm.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public Compra salvarCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public List<Compra> obterTodasCompras() {
        return compraRepository.findAll();
    }

    public List<Compra> obterComprasPorUsuario(Long usuarioId) {
        return compraRepository.findByUsuarioId(usuarioId);
    }

}
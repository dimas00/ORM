package csi.ufsm.tarefaorm.repository;

import csi.ufsm.tarefaorm.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findByUsuarioId(Long usuarioId);

}
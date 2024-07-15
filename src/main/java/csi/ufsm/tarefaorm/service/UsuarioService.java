package csi.ufsm.tarefaorm.service;

import csi.ufsm.tarefaorm.model.Usuario;
import csi.ufsm.tarefaorm.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obterTodosUsuarios() {
        return usuarioRepository.findAll();
    }
}
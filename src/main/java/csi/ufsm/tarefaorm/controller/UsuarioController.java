package csi.ufsm.tarefaorm.controller;

import csi.ufsm.tarefaorm.model.Usuario;
import csi.ufsm.tarefaorm.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> obterUsuarios() {
        return usuarioService.obterTodosUsuarios();
    }
}

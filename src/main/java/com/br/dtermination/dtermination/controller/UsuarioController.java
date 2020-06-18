package com.br.dtermination.dtermination.controller;

import com.br.dtermination.dtermination.model.Usuario;
import com.br.dtermination.dtermination.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
  }
   @PutMapping ("/{id}")
   public ResponseEntity<Usuario> alterarUsuario(@RequestBody Usuario usuario, @PathVariable("id") Long id) {
        if(usuarioRepository.existsById(id)){
           return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
       }
        return ResponseEntity.noContent().build();
   }
   @DeleteMapping ("/{id}")
   public ResponseEntity deletarUsuario(@PathVariable("id") Long id) {
       if(usuarioRepository.existsById(id)){
           usuarioRepository.deleteById(id);
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.noContent().build();
    }


    @GetMapping
    public ResponseEntity<List<Usuario>> buscarUsuarios() {
        return ResponseEntity.ok(usuarioRepository.findAll());
    }




//    @GetMapping("/usuarios/nome/{nome}")
//    public ResponseEntity<List<Usuario>> findByOneUser(@PathVariable("nome")String nome){
//       List<Usuario>usuarios = usuarioRepository.findByName(nome);
//        if(usuarios.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.ok(usuarios);
//    }

}

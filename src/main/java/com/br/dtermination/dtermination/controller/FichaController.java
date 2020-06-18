package com.br.dtermination.dtermination.controller;

import com.br.dtermination.dtermination.model.Ficha;
import com.br.dtermination.dtermination.repository.FichaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ficha")
        public class FichaController {

    @Autowired
    private FichaRepository fichaRepository;

    @PostMapping
    public ResponseEntity<Ficha> cadastrarFicha(@RequestBody Ficha ficha) {
        return ResponseEntity.ok(fichaRepository.save(ficha));
    }

    @GetMapping
    public ResponseEntity<List<Ficha>> buscarFicha() {
        return ResponseEntity.ok(fichaRepository.findAll());
    }

    //        @GetMapping("/usuarios/nome/{nome}")
//        public ResponseEntity<List<Ficha>> findByOneUser(@PathVariable("nome")String nome){
//            List<Ficha>fichas = fichaRepository.findByName(nome);
//            if(fichas.isEmpty()) {
//                return ResponseEntity.noContent().build();
//            }
//            return ResponseEntity.ok(fichas);
//        }
    @PutMapping("/{id}")
    public ResponseEntity atualizarFicha(@PathVariable("id") Long id, @RequestBody Ficha ficha) {
        if (fichaRepository.existsById(id) != true)
            return ResponseEntity.noContent().build();
        fichaRepository.save(ficha);
        return ResponseEntity.ok(ficha);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity atualizarFicha(@PathVariable("id") Long id) {
        if (fichaRepository.existsById(id) != true)
            return ResponseEntity.noContent().build();
        fichaRepository.deleteById(id);
        return ResponseEntity.ok().build();


    }
}
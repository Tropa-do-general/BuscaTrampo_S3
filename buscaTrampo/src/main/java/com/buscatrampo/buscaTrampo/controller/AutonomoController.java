package com.buscatrampo.buscaTrampo.controller;

import com.buscatrampo.buscaTrampo.autonomo.*;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lincoln
 */
@RestController
@RequestMapping("autonomo")
public class AutonomoController {
    @Autowired
    private AutonomoRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<DadosDoAutonomo> getAutonomoPeloID(@PathVariable Long id){
        try {
        DadosDoAutonomo autonomo = new DadosDoAutonomo(repository.getReferenceById(id));
            if (autonomo != null) {
                return ResponseEntity.ok(autonomo);
            } else {
                return ResponseEntity.notFound().build();
            }
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroAutonomo dados){
        repository.save(new Autonomo(dados));
    }

    @PutMapping
    @Transactional
    public void atuliza(@RequestBody @Valid DadosAtualizadoAutonomo dados){
        var autonomo = repository.getReferenceById(dados.id());
        autonomo.atualizarInformacoes(dados);
    }

}

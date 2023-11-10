package br.com.buscatrampo.buscaTrampo.controller;

import jakarta.validation.Valid;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lincoln
 */
@Controller@Setter
@RequestMapping("/cadastro")
public class CadastroController {
    @GetMapping
    public String cadastroBusca(){
        return "register";
    }

//    @Autowired
//    private AutonomoRepository repository;
//
//    @PostMapping
//    public void cadastrar(@RequestBody DadosCadastroAutonomo autonomo){
//        repository.save(new Autonomo(autonomo));
//
//    }

}

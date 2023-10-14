package br.com.buscaTrampo.demo.controller;

import br.com.buscaTrampo.demo.objetos.autonomo.AutonomoRepository;
import br.com.buscaTrampo.demo.objetos.autonomo.Autonomo;
import br.com.buscaTrampo.demo.objetos.autonomo.DadosCadastroAutonomo;
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
        return "cadastro";
    }

    @Autowired
    private AutonomoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroAutonomo autonomo){
        repository.save(new Autonomo(autonomo));
    }

}

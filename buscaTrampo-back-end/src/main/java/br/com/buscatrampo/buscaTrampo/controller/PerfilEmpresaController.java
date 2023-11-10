package br.com.buscatrampo.buscaTrampo.controller;

import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lincoln
 */
@Controller@Setter
@RequestMapping("/perfilempresa")
public class PerfilEmpresaController {
    @GetMapping
    public String cadastroBusca(){
        return "company-profile";
    }
}

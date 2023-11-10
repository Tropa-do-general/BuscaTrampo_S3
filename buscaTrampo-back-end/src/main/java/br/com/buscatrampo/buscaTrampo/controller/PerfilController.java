package br.com.buscatrampo.buscaTrampo.controller;

import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lincoln
 */
@Controller@Setter
@RequestMapping("/perfil")
public class PerfilController {
    @GetMapping
    public String cadastroBusca(){
        return "my-profile-feed";
    }
}

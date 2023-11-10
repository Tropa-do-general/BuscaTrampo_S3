package br.com.buscatrampo.buscaTrampo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lincoln
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String cadastroBusca(){
        return "sign-in";
    }
}

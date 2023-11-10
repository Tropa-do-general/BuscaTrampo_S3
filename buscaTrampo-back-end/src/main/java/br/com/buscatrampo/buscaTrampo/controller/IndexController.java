package br.com.buscatrampo.buscaTrampo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Lincoln
 */

@Controller
@RequestMapping("/buscatrampo")
public class IndexController {
    @GetMapping
    public String buscaTrampo(){
        return "principal";
    }
}

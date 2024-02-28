package br.com.gerenciamento.instituicao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AlunoController {

    @GetMapping
    public String hello(){
        return "Hello Word!";
    }
}

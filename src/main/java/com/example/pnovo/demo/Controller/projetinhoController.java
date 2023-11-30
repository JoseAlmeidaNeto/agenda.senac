package com.example.pnovo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class projetinhoController {
    @GetMapping("/index")
    public String abrir() {
        return "projetinho";
    }
}

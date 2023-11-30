package com.example.pnovo.demo.Controller;

import com.example.pnovo.demo.Model.Cliente;
import com.example.pnovo.demo.dao.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class cadastroController {
    @Autowired
    ClienteRepository clienteRepository;
    @GetMapping("/cadastro")
    public String abrir(Cliente cliente) {return "cadastro";}

        @PostMapping("/cadastrar_cliente")
        public String cadastro(Cliente cliente){
    clienteRepository.save(cliente);

        return "index";
    }
}

package com.paperclip.osworksapi.api.controllers;

import java.util.Arrays;
import java.util.List;

import com.paperclip.osworksapi.domain.models.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> clientes() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setEmail("joao@mail.com");
        cliente1.setTelefone("55 98888-1111");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setEmail("maria@mail.com");
        cliente2.setTelefone("55 97777-2222");

        return Arrays.asList(cliente1, cliente2);
    }
}
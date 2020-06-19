package com.paperclip.osworksapi.domain.services;

import java.util.Optional;

import com.paperclip.osworksapi.domain.exceptions.NegocioException;
import com.paperclip.osworksapi.domain.models.Cliente;
import com.paperclip.osworksapi.domain.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        Optional<Cliente> clienteExistente = clienteRepository.findByEmail(cliente.getEmail());

        if (clienteExistente.isPresent() && !clienteExistente.get().equals(cliente)) {
            throw new NegocioException("Já existe um cliente cadastrado com este e-mail");
        }

        return clienteRepository.save(cliente);
    }

    public void excluir(Long clienteId) {
        clienteRepository.deleteById(clienteId);
    }

}
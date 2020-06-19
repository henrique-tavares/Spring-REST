package com.paperclip.osworksapi.domain.repositories;

import java.util.Optional;

import com.paperclip.osworksapi.domain.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    Optional<Cliente> findByEmail(String email);
}
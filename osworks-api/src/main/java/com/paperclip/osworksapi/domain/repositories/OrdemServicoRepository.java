package com.paperclip.osworksapi.domain.repositories;

import com.paperclip.osworksapi.domain.models.OrdemServico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
    
}
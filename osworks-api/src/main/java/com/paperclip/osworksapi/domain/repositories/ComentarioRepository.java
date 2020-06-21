package com.paperclip.osworksapi.domain.repositories;

import com.paperclip.osworksapi.domain.models.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    
}
package com.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
    // Busca por título exato (já existente)
    public Optional<Postagem> findByTitulo(String titulo);

    // NOVA QUERY METHOD: Busca por termo contido no título (Passo 01 da doc)
    public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
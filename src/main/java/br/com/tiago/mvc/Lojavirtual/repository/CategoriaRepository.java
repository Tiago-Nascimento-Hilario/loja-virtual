package br.com.tiago.mvc.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tiago.mvc.lojavirtual.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
}

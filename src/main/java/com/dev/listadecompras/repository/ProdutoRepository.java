package com.dev.listadecompras.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.listadecompras.model.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, String> {
}

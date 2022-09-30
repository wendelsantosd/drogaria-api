package br.dev.wendel.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.wendel.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short>{

}

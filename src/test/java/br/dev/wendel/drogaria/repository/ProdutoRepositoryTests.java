package br.dev.wendel.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.dev.wendel.drogaria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		Produto p1 = new Produto(
			null,
			"Coca cola",
			Byte.valueOf("15"),
			BigDecimal.valueOf(10.50),
			LocalDate.of(2022, 9, 6)
		);
		
		Produto p2 = new Produto(
			null,
			"Heineken",
			Byte.valueOf("23"),
			BigDecimal.valueOf(8.50),
			LocalDate.of(2022, 4, 6)
		);
		
		produtoRepository.save(p1);
		produtoRepository.save(p2);
	}
}

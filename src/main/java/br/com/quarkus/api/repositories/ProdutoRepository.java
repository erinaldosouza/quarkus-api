package br.com.quarkus.api.repositories;

import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;

import br.com.quarkus.api.models.Produto;

@ApplicationScoped
public class ProdutoRepository {

	public Produto cadastrar(Produto produto) {
		produto.persist();
		return produto;
	}
	
	public Optional<Produto> consultar(Long idProduto) {
		return Produto.findByIdOptional(idProduto);
	}
	
	public void deletar(Long idProduto) {
		this.consultar(idProduto).ifPresent(Produto::delete);
	}

}


import java.util.ArrayList;


public class LivroLista {
	private ArrayList<Livro> colecao= new ArrayList<Livro>();
	private Livro livrinho;
	
	
	public void adicionarLivro(Livro livro) {
		colecao.add(livro);
		System.out.println("Livro adicionado na coleção");
		
	}
	public void removerLivro(Livro livro) {
		if(colecao.contains(livro)) {
			colecao.remove(livro);
			System.out.println("Livro removido");
		}else {
			System.out.println("O livro nao foi encontrado e nao pode ser removido");
		}
	}
	public void imprimirLivros() {
		int tamanho= colecao.size();
		
		colecao.forEach((livro) -> {
			colecao.toString();
			
			System.out.println("LIVROS IMPRESSOS\n\n");
		});
		
	}
	public void verificarLivro(Livro livroProcurado) {
		boolean verifica;
		if(colecao.contains(livroProcurado)) {
			verifica=true;
			
			
			
		}else {
			verifica=false;
			
		}
		if(verifica) {
			System.out.println("O livro foi encontrado");
		}else {
			System.out.println("O livro NÃO foi encontrado");
		}
		
	}
	
	public Livro obterLivro(Livro livroProcurado) {
		this.livrinho=null;
		
		colecao.forEach((livroProcura) ->{
				if(livroProcura.equals(livroProcurado)) {
					this.livrinho=livroProcura;
				}
		}
				);
		
		return this.livrinho;
	}
	public void verificarVazio() {
		int valor= colecao.size();
			if(valor==0) {
				System.out.println("A lista está vazia");
			}else {
				System.out.println("A lista de livros não está vazia");
			}
		
		
	}
	
	

}

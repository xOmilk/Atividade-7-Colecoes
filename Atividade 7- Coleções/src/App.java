
public class App {
	
	public static void main() {
		
		Livro l1= new Livro("Fernandinho","Brinquedo","A historia da lua e do sol",1235);
		Livro l2= new Livro("carlinhos","Brinquedo","a historia de luan",1);
		
		
		LivroLista lista1= new LivroLista();
		lista1.adicionarLivro(l1);
		lista1.adicionarLivro(l2);
		lista1.imprimirLivros();
		
		lista1.removerLivro(l1);
		lista1.imprimirLivros();
		
		lista1.verificarLivro(l2);
		
		
		
		
		
		
	}
	

}

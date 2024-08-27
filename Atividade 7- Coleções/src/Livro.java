
public class Livro {
	private int isbn;
	private String autor, editora, titulo;
	
	public Livro(String autor, String editora, String titulo, int isbn) {
		this.setAutor(autor);
		this.setEditora(editora);
		this.setTitulo(titulo);
		this.setIsbn(isbn);
		
	}
	
	
	
	
	

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", autor=" + autor + ", editora=" + editora + ", titulo=" + titulo + "]";
	}






	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
}

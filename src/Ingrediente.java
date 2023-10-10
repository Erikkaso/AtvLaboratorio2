
public abstract class Ingrediente {
	String nome;
	int id;
	double preco;
	
	public Ingrediente(String nome, int id, double preco) {
		this.nome = nome;
		this.id = id;
		this.preco = preco;
	}
	
	public Ingrediente(int id) {
		this.id = id;
	}
}

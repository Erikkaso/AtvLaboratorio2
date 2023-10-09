
public abstract class Compradores {
	
	public String nome;
	public int matricula;
	public CachorroQuente hotdog;
	public float preco;
	
	public Compradores(String nome, int matricula) {
		this.nome = nome;
		
		this.matricula = matricula;
		
		hotdog = new CachorroQuente();
	}
}

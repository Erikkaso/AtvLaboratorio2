
public abstract class Compradores {
	
	public String nome;
	public int indentificacao;
	public CachorroQuente hotdog;
	public float preco;
	
	public Compradores(String nome, int indentificacao) {
		this.nome = nome;
		
		this.indentificacao = indentificacao;
		
		hotdog = new CachorroQuente();
	}
}

import java.util.ArrayList;

public abstract class Compradores {
	
	public String nome;
	public int indentificacao;
	public ArrayList<CachorroQuente> hotdog;
	public float preco;
	
	public Compradores(String nome, int indentificacao) {
		this.nome = nome;
		
		this.indentificacao = indentificacao;
		
		hotdog = new ArrayList<>();
	}
}

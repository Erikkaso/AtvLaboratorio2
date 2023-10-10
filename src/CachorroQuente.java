import java.util.ArrayList;

public class CachorroQuente {
	public ArrayList<Ingrediente> ingredientes;
	public Ingrediente[] IngredienteSelecionado;

	
	public CachorroQuente() {
		ingredientes = new ArrayList<>();
		IngredienteSelecionado = new Ingrediente[4];

		ingredientes.add(new Proteina("Salsicha", 1, 2));
		ingredientes.add(new Proteina("Linguca", 1, 3));
		ingredientes.add(new Proteina("Frango", 1, 2.5));
		ingredientes.add(new Proteina("Bacon", 1, 3.5));	
		
		ingredientes.add(new Queijo("Mussarela", 2, 2));
		ingredientes.add(new Queijo("Prato", 2, 2.75));
		ingredientes.add(new Queijo("Parmesao", 2, 3));
		ingredientes.add(new Queijo("Coalho", 2, 1));
		
		ingredientes.add(new Adcionais("Maionese", 3, 1.5));
		ingredientes.add(new Adcionais("Ketchup", 3, 1.5));
		ingredientes.add(new Adcionais("Ovo", 3, 3));
		ingredientes.add(new Adcionais("Batata Palha", 3, 5));
		
		ingredientes.add(new Bebida("Coca Cola", 4, 4.5));
		ingredientes.add(new Bebida("Delrio", 4, 3));
		ingredientes.add(new Bebida("Suco do Chaves", 4, 2.5));
	}
}

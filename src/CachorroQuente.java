
public class CachorroQuente {
	public String[] proteina;
	
	public String[] queijo;
	
	public String[] ingredientes;
	
	public String[] bebida;
	
	public int idProteina, idQueijo, idBebida;
	public int[] idIngredientes = new int[4];
	
	public CachorroQuente() {
		
		proteina = new String[4];
		proteina[0] = "Salsicha";
		proteina[1] = "Linguca";
		proteina[2] = "Frango";
		proteina[3] = "Bacon";
		
		queijo = new String[4];
		queijo[0] = "Mussarela";
		queijo[1] = "Prato";
		queijo[2] = "Parmesao";
		queijo[3] = "Coalho";
		
		ingredientes = new String[4];
		ingredientes[0] = "maionese";
		ingredientes[1] = "ketchup";
		ingredientes[2] = "ovo";
		ingredientes[3] = "batata palha";
		
		bebida = new String[3];
		bebida[0] = "Coca Cola";
		bebida[1] = "Delrio";
		bebida[2] = "Suco do Chaves";
	}
}

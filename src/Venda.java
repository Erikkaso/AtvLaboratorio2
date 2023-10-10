import java.util.ArrayList;
import java.util.Scanner;

public class Venda {
	Scanner input = new Scanner(System.in);
	public float dinheiroTotal;
	public ArrayList<Compradores> compradores;
	public CachorroQuente hotdog;
	public boolean done;

	public Venda() {
		int aux, aux2;
		String aux3;
		dinheiroTotal = 0;
		done = false;
		compradores = new ArrayList<>();
		hotdog = new CachorroQuente();

		while (done != true) {
			System.out.println("Informe o nome do cliente:");
			aux3 = input.next();
			System.out.println("Informe o Nº de indentificacao:");
			aux = input.nextInt();
			System.out.println("Informe o id do cliente:");
			aux2 = input.nextInt();

			if (aux2 == 1)
				compradores.add(new Aluno(aux3, aux));
			else if (aux2 == 2)
				compradores.add(new Professor(aux3, aux));
			else
				compradores.add(new Servidor(aux3, aux));

			System.out.println("Se quiser registrar outro cliente selecione 1, caso contrario aperte qualquer valor");
			aux = input.nextInt();
			if (aux != 1)
				done = true;
		}

		FazerPedido();

	}

	public void FazerPedido() {
		int aux, aux2, idSelect;
		System.out.println("Qual cliente fara o pedido?");
		for (int i = 0; i < compradores.size(); i++) {
			System.out.println((i + 1) + ". " + compradores.get(i).nome);
		}
		aux = input.nextInt() - 1;

		System.out.println("Quantos hotdogs deseja?");
		aux2 = input.nextInt();

		for (int j = 0; j < aux2; j++) {
			compradores.get(aux).hotdog.add(hotdog);

			System.out.println("Escolha a proteina");
			for (int i = 0; i < hotdog.ingredientes.size(); i++) {
				if (hotdog.ingredientes.get(i).id == 1)
					System.out.println((i + 1) + ". " + hotdog.ingredientes.get(i).nome);
			}
			idSelect = input.nextInt() - 1;
			compradores.get(aux).hotdog.get(j).IngredienteSelecionado[0] = hotdog.ingredientes.get(idSelect);

			System.out.println("Escolha o queijo");
			for (int i = 0; i < hotdog.ingredientes.size(); i++) {
				if (hotdog.ingredientes.get(i).id == 2)
					System.out.println((i - 3) + ". " + hotdog.ingredientes.get(i).nome);
			}
			idSelect = input.nextInt() - 1;
			compradores.get(aux).hotdog.get(j).IngredienteSelecionado[1] = hotdog.ingredientes.get(idSelect + 4);

			System.out.println("Escolha o adcional");
			for (int i = 0; i < hotdog.ingredientes.size(); i++) {
				if (hotdog.ingredientes.get(i).id == 3)
					System.out.println((i - 7) + ". " + hotdog.ingredientes.get(i).nome);
			}
			idSelect = input.nextInt() - 1;
			compradores.get(aux).hotdog.get(j).IngredienteSelecionado[2] = hotdog.ingredientes.get(idSelect + 8);

			System.out.println("Escolha a bebida");
			for (int i = 0; i < hotdog.ingredientes.size(); i++) {
				if (hotdog.ingredientes.get(i).id == 4)
					System.out.println((i - 11) + ". " + hotdog.ingredientes.get(i).nome);
			}
			idSelect = input.nextInt() - 1;
			compradores.get(aux).hotdog.get(j).IngredienteSelecionado[3] = hotdog.ingredientes.get(idSelect + 12);
			CalcularPreco(compradores.get(aux), j);
		}	
		System.out.println("Preco: "+ dinheiroTotal);
	}

	public void CalcularPreco(Compradores c, int aux) {
		for (int i = 0; i < 4; i++) {
			c.preco += c.hotdog.get(aux).IngredienteSelecionado[i].preco;
			System.out.println("aa"+c.preco);
			System.out.println(dinheiroTotal);
		}
		dinheiroTotal += c.preco;
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class Venda {
	Scanner input = new Scanner(System.in);
	public float dinheiroTotal;
	public ArrayList<Compradores> compradores;
	public boolean done;

	// public CachorroQuente hotdog;

	public Venda() {
		int aux, aux2;
		String aux3;
		dinheiroTotal = 0;
		done = false;
		compradores = new ArrayList<>();

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
			if (aux == 1)
				done = true;
		}

		FazerPedido();

	}

	public void FazerPedido() {
		int aux, aux2;
		System.out.println("Qual cliente fara o pedido?");
		for (int i = 0; i < compradores.size(); i++) {
			System.out.println((i + 1) + ". " + compradores.get(i).nome);
		}
		aux = input.nextInt() - 1;

		System.out.println("Quantos hotdogs deseja?");
		aux2 = input.nextInt();
		
		for (int j = 0; j < aux2; j++) {
			
			System.out.println("Qual a proteina?");
			for (int i = 0; i < 4; i++) {
				System.out.println((i + 1) + ". " + compradores.get(aux).hotdog.proteina[i]);
			}
			compradores.get(aux).hotdog.idProteina = input.nextInt() - 1;

			System.out.println("Qual o queijo?");
			for (int i = 0; i < 4; i++) {
				System.out.println((i + 1) + ". " + compradores.get(aux).hotdog.queijo[i]);
			}
			compradores.get(aux).hotdog.idQueijo = input.nextInt() - 1;

			System.out.println("Qual ingredientes quer por?");
			for (int i = 0; i < 4; i++) {
				System.out.println((i + 1) + ". " + compradores.get(aux).hotdog.ingredientes[i]);
			}
			compradores.get(aux).hotdog.idIngredientes[0] = input.nextInt() - 1;

			System.out.println("Qual a bebida?");
			for (int i = 0; i < 3; i++) {
				System.out.println((i + 1) + ". " + compradores.get(aux).hotdog.bebida[i]);
			}
			compradores.get(aux).hotdog.idBebida = input.nextInt() - 1;
			CalcularPreco(compradores.get(aux));
		}

		System.out.println("O valor final eh:" + compradores.get(aux).preco);
	}

	public void CalcularPreco(Compradores c) {
		for (int i = 0; i < 4; i++) {
			if (c.hotdog.idProteina == 0)
				c.preco += 2;
			if (c.hotdog.idProteina == 1)
				c.preco += 3;
			if (c.hotdog.idProteina == 2)
				c.preco += 2.5;
			if (c.hotdog.idProteina == 3)
				c.preco += 3.5;

			if (c.hotdog.idQueijo == i)
				c.preco += 5 + (i * 2);

			if (c.hotdog.idBebida == i)
				c.preco += 5 + (i * 3);

			if (i != 4) {
				if (c.hotdog.idIngredientes[0] == i)
					c.preco += (i * 3);
			}
		}
		dinheiroTotal += c.preco;
	}
}

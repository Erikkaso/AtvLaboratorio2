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
			if (aux == 1)
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
			compradores.get(aux).hotdog.get(j).proteinaSelecionada = hotdog.ingredientes.get(idSelect);

			System.out.println("Escolha o queijo");
			for (int i = 0; i < hotdog.ingredientes.size(); i++) {
				if (hotdog.ingredientes.get(i).id == 2)
					System.out.println((i - 3) + ". " + hotdog.ingredientes.get(i).nome);
			}
			idSelect = input.nextInt() - 1;
			compradores.get(aux).hotdog.get(j).queijoSelecionada = hotdog.ingredientes.get(idSelect + 4);

			System.out.println("Escolha o adcional");
			for (int i = 0; i < hotdog.ingredientes.size(); i++) {
				if (hotdog.ingredientes.get(i).id == 3)
					System.out.println((i - 7) + ". " + hotdog.ingredientes.get(i).nome);
			}
			idSelect = input.nextInt() - 1;
			compradores.get(aux).hotdog.get(j).adcionaisSelecionada = hotdog.ingredientes.get(idSelect + 8);

			System.out.println("Escolha a bebida");
			for (int i = 0; i < hotdog.ingredientes.size(); i++) {
				if (hotdog.ingredientes.get(i).id == 4)
					System.out.println((i - 11) + ". " + hotdog.ingredientes.get(i).nome);
			}
			idSelect = input.nextInt() - 1;
			compradores.get(aux).hotdog.get(j).bebidaSelecionada = hotdog.ingredientes.get(idSelect + 12);
		}

		// System.out.println("O valor final eh:" + compradores.get(aux).preco);
	}

//	public void CalcularPreco(Compradores c) {
//		for (int i = 0; i < 4; i++) {
//			if (c.hotdog.idProteina == 0)
//				c.preco += 2;
//			if (c.hotdog.idProteina == 1)
//				c.preco += 3;
//			if (c.hotdog.idProteina == 2)
//				c.preco += 2.5;
//			if (c.hotdog.idProteina == 3)
//				c.preco += 3.5;
//
//			if (c.hotdog.idQueijo == i)
//				c.preco += 5 + (i * 2);
//
//			if (c.hotdog.idBebida == i)
//				c.preco += 5 + (i * 3);
//
//			if (i != 4) {
//				if (c.hotdog.idIngredientes[0] == i)
//					c.preco += (i * 3);
//			}
//		}
//		dinheiroTotal += c.preco;
//	}
}

import java.util.Scanner;

public class Venda {
	Scanner input = new Scanner(System.in);
	public float dinheiroTotal;
	public Compradores[] alunos;

	// public CachorroQuente hotdog;

	public Venda() {
		int aux;
		dinheiroTotal = 0;
		alunos = new Compradores[30];

		alunos[0] = new Compradores("Davi", 40028922);
		alunos[1] = new Compradores("Marcia", 676179);
		alunos[2] = new Compradores("Emilia", 11042004);

		System.out.println("Bem Vindo! Escolha a opcao que deseja:\n1.Fazer Pedido\n2.Cadastrar Cliente");
		aux = input.nextInt();
		if (aux == 1) {
			FazerPedido();
		} else if (aux == 2) {
			System.out.println("b");
		}
	}

	public void FazerPedido() {
		int aux;
		System.out.println("Qual aluno fara o pedido?");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + ". " + alunos[i].nome);
		}
		aux = input.nextInt() - 1;

		System.out.println("Qual a proteina?");
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + ". " + alunos[aux].hotdog.proteina[i]);
		}
		alunos[aux].hotdog.idProteina = input.nextInt() - 1;

		System.out.println("Qual o queijo?");
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + ". " + alunos[aux].hotdog.queijo[i]);
		}
		alunos[aux].hotdog.idQueijo = input.nextInt() - 1;

		System.out.println("Qual ingredientes quer por?");
		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + ". " + alunos[aux].hotdog.ingredientes[i]);
		}
		alunos[aux].hotdog.idIngredientes[0] = input.nextInt() - 1;

		System.out.println("Qual a bebida?");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + ". " + alunos[aux].hotdog.bebida[i]);
		}
		alunos[aux].hotdog.idBebida = input.nextInt() - 1;

		CalcularPreco(alunos[aux]);
	}

	public void CalcularPreco(Compradores aluno) {
		for (int i = 0; i < 4; i++) {
			if (aluno.hotdog.idProteina == i)
				aluno.preco += 10 + (i * 2);
			
			if (aluno.hotdog.idQueijo == i)
				aluno.preco += 5 + (i * 2);
			
			if (aluno.hotdog.idBebida == i)
				aluno.preco += 5 + (i * 3);
			
			if(i!=4) {
				if (aluno.hotdog.idIngredientes[0] == i)
					aluno.preco += (i * 3);
			}
		}
		dinheiroTotal += aluno.preco;
		System.out.println("O preco final eh: " + aluno.preco);
	}
}

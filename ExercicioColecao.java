package Familia38;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioColecao {

public static void main(String[] args) {
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n***********************************************************");
			System.out.println("\t1- Deseja adicionar produtos ao estoque?");
			System.out.println("\t2- Deseja atualizar produtos do estoque?");
			System.out.println("\t3- Deseja remover algum produto? ");
			System.out.println("\t4- Deseja mostrar os produtos do estoque?");
			System.out.println("\t0- Encerrar o programa");
			System.out.println("\n***********************************************************");
			System.out.println("\nDigite a sua opção");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1: 
				ler.nextLine();
				System.out.println("Digite o nome do produto que vai ser adicionado no estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o nome do produto que deseja atualizar:");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto "+verifica+": ");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("Produto não registrado anteriormente");
				}
				System.out.println("\n"+estoque);
				break;

			case 3: 
				ler.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = ler.nextLine();
				
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("Produto não registrado anteriormente");
				}
				break;

			case 4:
				System.out.println("\nOs produtos que temos no estoque são:");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\n Programa encerrado!");
			}
		}while(op!=0);
	}

}

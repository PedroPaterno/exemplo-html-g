import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		int quantidadeDeDependentes = 2;
		double salario = 2000.50;
		String nome = "Joao Carlos";
		//Cirar um leitor do terminal
		Scanner leitor = new Scanner(System.in); 
		
		
		System.out.print("Digite a quantidade de dependentes:");
		quantidadeDeDependentes = leitor.nextInt();
		
		System.out.print("Digite o salario:");
		salario = leitor.nextDouble();
		
		leitor.nextLine();
		System.out.print("Digite o seu nome:");
		nome = leitor.nextLine();
								
		
		System.out.println("Voce tem " + quantidadeDeDependentes + " filhos");
		System.out.println("Seu salario eh " + salario);
		System.out.println("Seu nome eh " + nome);
		
		leitor.close();
	}

}

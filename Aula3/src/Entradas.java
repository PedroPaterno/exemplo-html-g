import javax.swing.JOptionPane;

public class Entradas {

	public static void main(String[] args) {
		String nome;
		double salario;
		int quantidadeDeDependentes;
		
		nome = JOptionPane.showInputDialog("Digite seu nome");
		salario = Double.valueOf(JOptionPane.showInputDialog("Digite seu salario"));
		quantidadeDeDependentes = Integer.valueOf(JOptionPane.showInputDialog("Dependentes"));
		
		
		
		JOptionPane.showMessageDialog(null, 
				"Ola, " + nome +
				"\n Seu salario e " + salario +
				"\n Voce tem " + quantidadeDeDependentes + " filhos"
				
				);
		
	}

}

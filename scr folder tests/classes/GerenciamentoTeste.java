package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoTeste {
	static ArrayList <Paciente> pacientes = new ArrayList<>();
	static ArrayList <Paciente> vacinados = new ArrayList<>();
	
	public static void main (String[] args) {
		Gerenciamento g = new Gerenciamento();
		
		Paciente a = new Paciente ("Amanda", 22);
		Paciente b = new Paciente ("Gabriel", 32);
		Paciente c = new Paciente ("Jorge", 82);
		g.posicionarNaLista(a, pacientes);
		g.posicionarNaLista(b, pacientes);
		g.posicionarNaLista(c, pacientes);
		System.out.println("******Lista inicial:******\n");
		g.imprimirLista(pacientes);
		
		Paciente d = new Paciente ("Bruna", 30);
		g.posicionarNaLista(d, pacientes);
		System.out.println("****Lista atualizada:****\n");
		g.imprimirLista(pacientes);
		
		g.removerPeloObjeto(b, pacientes, vacinados);
		System.out.println("****Vacinados:****\n");
		g.imprimirLista(vacinados);
		System.out.println("****Lista atualizada:****\n");
		g.imprimirLista(pacientes);
		
		// receber do teclado
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa para adicionar: ");
		String nome = s.nextLine();
		System.out.println("Digite a idade: ");
		int idade = s.nextInt();
		
		try{
			Paciente x = new Paciente (nome, idade);
			g.posicionarNaLista(x, pacientes);
		}
		catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		System.out.println("****Lista atualizada:****\n");
		g.imprimirLista(pacientes);
		System.out.println("Digite uma posição para retirar da fila/vacinar: ");
		int posicao = s.nextInt();
		try{
			g.removerPelaPosicao(posicao, pacientes, vacinados);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		System.out.println("****Lista atualizada:****\n");
		g.imprimirLista(pacientes);
		System.out.println("****Vacinados:****\n");
		g.imprimirLista(vacinados);
	}
	
}

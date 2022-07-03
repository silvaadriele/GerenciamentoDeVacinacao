package classes;
import java.util.ArrayList;

public class Gerenciamento {

	public boolean posicionarNaLista(Paciente a, ArrayList<Paciente> pacientes){
		for(int i=0; i<pacientes.size(); i++) {
			if (a.getIdade()>((Paciente) pacientes.get(i)).getIdade()){
				pacientes.add(i, a);
				return true;
			}	
		}
		pacientes.add(a);
		return true;
	}
		
	void imprimirLista(ArrayList <Paciente> lista){
		for (Paciente a : lista) {
			System.out.println(a);
		}
	}
		
	boolean removerPeloObjeto(Paciente paciente, ArrayList<Paciente> pacientes, ArrayList<Paciente> vacinados) {
		if (pacientes.contains(paciente)) {
			vacinados.add(paciente);
			pacientes.remove(paciente);
			return true;
		}
		return false;
		
		
	}
	
	void removerPelaPosicao(int index, ArrayList<Paciente> pacientes, ArrayList<Paciente> vacinados) {
		int posicao = index-1;
		if (posicao>pacientes.size()){
			throw new IndexOutOfBoundsException("Posição não encontrada\n");
		}
		else{
			vacinados.add(pacientes.get(posicao));
			pacientes.remove(posicao);
		}
		
	}
	
		
		
}
	

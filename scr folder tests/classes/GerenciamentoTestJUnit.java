package classes;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class GerenciamentoTestJUnit {
	private Gerenciamento g = new Gerenciamento();
	static ArrayList <Paciente> pacientes = new ArrayList<>();
	static ArrayList <Paciente> vacinados = new ArrayList<>();
	
	Paciente b = new Paciente("Carlos", 87);
	Paciente c = new Paciente("Margarida", 22);
	
	@Test
	void testPosicionarNaLista() {
		Paciente a = new Paciente("Caroline", 48);
		assertEquals(g.posicionarNaLista(a, pacientes), true);
	}
	
	@Test
	void testRemoverPeloObjeto() {
		Paciente a = new Paciente("Caroline", 48);
		assertEquals(g.removerPeloObjeto(a, pacientes, vacinados), false); //objeto nao estava adicionado, false
	}
	
}

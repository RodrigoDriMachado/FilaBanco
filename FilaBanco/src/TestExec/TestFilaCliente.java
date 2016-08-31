package TestExec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Exec_11_08.*;

public class TestFilaCliente {
	
	private Cliente clnt1;
	private Cliente clnt2;
	private Cliente clnt3;
	private Cliente clnt4;
	private Cliente clnt5;
	private FilaCliente fila_clnt;

	@Before
	public void setUp() throws Exception {
		clnt1 = new Cliente(15,"Rodrigo");
		clnt2 = new Cliente(25,"Rodrigo");
		clnt3 = new Cliente(65,"Rodrigo");
		clnt4 = new Cliente(75,"Rodrigo");
		clnt5 = new Cliente(90,"Rodrigo");
		fila_clnt = new FilaCliente();
		fila_clnt.addCliente(clnt4);
		fila_clnt.addCliente(clnt5);
	}
	

	@Test
	public void testSizeNormal(){
		fila_clnt.cleanFilaNormal();
		fila_clnt.addCliente(clnt1);
		fila_clnt.addCliente(clnt2);
		fila_clnt.addCliente(clnt3);
		fila_clnt.addCliente(clnt4);
		fila_clnt.addCliente(clnt5);
		fila_clnt.removeNormal();
		fila_clnt.removeNormal();
		fila_clnt.removePrioritario();
		assertEquals(0, fila_clnt.sizeNormal());
    } 

	@Test
	public void testeAtendimentoPrioritario() {
		fila_clnt.cleanFilaPrioritaria();
		fila_clnt.addCliente(clnt3);
		fila_clnt.addCliente(clnt4);
		fila_clnt.addCliente(clnt5);
		fila_clnt.removePrioritario();
		fila_clnt.removePrioritario();
		assertEquals(1,fila_clnt.sizePrioritaria());
	}
	
	@Test
	public void testAtendimentoNormal() {
		fila_clnt.cleanFilaPrioritaria();
		fila_clnt.addCliente(clnt1);
		fila_clnt.addCliente(clnt2);
		fila_clnt.removeNormal();
		fila_clnt.removeNormal();
		Cliente clnt6 = new Cliente(26,"Eduardo");
		assertEquals(1,fila_clnt.sizePrioritaria());
	}
	
}

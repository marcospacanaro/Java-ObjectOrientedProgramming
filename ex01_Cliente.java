package exercicio01;

public class Cliente { // CLASSE / OBJETO //
	private String nomeCliente; // atributos = vari�veis //
	private int idadeCliente;
	private String estadoCliente;
	
	public Cliente (String nomeC, int idC, String est) { // "apelidos" para atributos //
		nomeCliente = nomeC;
		idadeCliente = idC;
		estadoCliente = est;
	}
	
	public String mostrarDados() { // m�todo //
		String infos = nomeCliente+" "+idadeCliente+" "+estadoCliente;	
		return infos;		
	}
}

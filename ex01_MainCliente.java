package exercicio01; // EXECUTA O PROGRAMA //

public class MainCliente {

	public static void main(String[] args) { // 
		Cliente cliente1 = new Cliente ("Jos�", 30, "SP"); // "cliente" = OBJETO / "Jos�, 30, SP" = INST�NCIAS //
		System.out.println(cliente1.mostrarDados()); // APRESENTA��O NO CONSOLE //
		
		Cliente cliente2 = new Cliente ("Maria", 45, "RJ");
		System.out.println(cliente2.mostrarDados());
	}
}

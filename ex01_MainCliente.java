package exercicio01; // EXECUTA O PROGRAMA //

public class MainCliente {

	public static void main(String[] args) { // 
		Cliente cliente1 = new Cliente ("José", 30, "SP"); // "cliente" = OBJETO / "José, 30, SP" = INSTÂNCIAS //
		System.out.println(cliente1.mostrarDados()); // APRESENTAÇÃO NO CONSOLE //
		
		Cliente cliente2 = new Cliente ("Maria", 45, "RJ");
		System.out.println(cliente2.mostrarDados());
	}
}

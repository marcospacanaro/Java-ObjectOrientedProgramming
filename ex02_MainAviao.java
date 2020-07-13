package exercicio02;

public class MainAviao {
	public static void main (String args[]) {
		Aviao nave1 = new Aviao ("Gol", 99, true);
		Aviao nave2 = new Aviao ("Azul", 999, false);
		
		System.out.println(nave1.mostrarDados());
		System.out.println(nave1.verificarStatusVoo());
		
		System.out.println(nave2.mostrarDados());
		System.out.println(nave2.verificarStatusVoo());
		
		
	}
}

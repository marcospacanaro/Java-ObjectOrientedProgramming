package exercicio03;

public class MainProdutoEletronico {
	public static void main (String args[]) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico ("TV", "Smart", 5000, false);
		ProdutoEletronico produto2 = new ProdutoEletronico ("Playstation 5", "Console", 4000, true);
		
		System.out.println(produto1.mostrarDados());
		System.out.println(produto2.mostrarDados());
	}
}
package exercicio03;

public class ProdutoEletronico {
	private String nomeProduto;
	private String descricaoProduto;
	private double valorProduto;
	private boolean statusProduto;	
	
	public ProdutoEletronico (String nomeP, String descricaoP, double valorP, boolean statusP) {
		nomeProduto = nomeP;
		descricaoProduto = descricaoP;
		valorProduto = valorP;
		statusProduto = statusP;
	}
	
	public String mostrarDados() {
		String ligaDesliga;
		
		if (statusProduto == false) {
			ligaDesliga = "Produto está desligado";
		}
		
		else {
			ligaDesliga = "Produto está ligado.";
		}
		
		String informacoes = nomeProduto+" | "+descricaoProduto+" | "+valorProduto+" | "+ligaDesliga;
		return informacoes;
	}
	
	public String ligarProduto() {
		statusProduto = true;
		String status = "O produto está ligado.";
		return status;
	}
	
	public String desligarProduto() {
		statusProduto = false;
		String status = "O produto está desligado.";
		return status;
	}
}

import java.util.ArrayList;

public class Compra {
	private int numero;
	private float valorCompra;
	private String formaDePagamento;
	private int quantidade;
	private ArrayList<Ingresso> ingresso;
	
	public Compra(int numero, float valor, String formaDePagamento) {
		
		this.numero = numero;
		this.valorCompra = valor;
		this.formaDePagamento = formaDePagamento;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getValor() {
		return valorCompra;
	}
	public void setValor(float valor) {
		this.valorCompra = valor;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
	//public float realizarCompra(int quantidade){
		//valorCompra = quantidade*
		//return valorCompra;
	//}
}

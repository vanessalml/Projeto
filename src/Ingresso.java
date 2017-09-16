
public class Ingresso {
	private int id;
	private int valor;
	private char setor;
	private int cadeira;
	
	public Ingresso(int id, int valor, char setor, int cadeira) {
		
		this.id = id;
		this.valor = valor;
		this.setor = setor;
		this.cadeira = cadeira;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public char getSetor() {
		return setor;
	}

	public void setSetor(char setor) {
		this.setor = setor;
	}

	public int getCadeira() {
		return cadeira;
	}

	public void setCadeira(int cadeira) {
		this.cadeira = cadeira;
	}

	public int getId() {
		return id;
	}
	
	
	
}

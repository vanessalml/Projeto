import java.util.ArrayList;

public class Ambiente {
	protected String endereco;
	protected String pontoDeReferencia;
	protected String fotos;
	protected int capacidadeTotal;
	protected int vagasEstacionamento;
	protected ArrayList<Setor> setores;
	
	public Ambiente(String endereco, String pontoDeReferencia, String fotos, int vagasEstacionamento) {
		this.endereco = endereco;
		this.pontoDeReferencia = pontoDeReferencia;
		this.fotos = fotos;
		this.vagasEstacionamento = vagasEstacionamento;
		this.capacidadeTotal = 0;
		this.setores = new ArrayList<>();
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}

	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public int getVagasEstacionamento() {
		return vagasEstacionamento;
	}

	public void setVagasEstacionamento(int vagasEstacionamento) {
		this.vagasEstacionamento = vagasEstacionamento;
	}
	
	
	
}

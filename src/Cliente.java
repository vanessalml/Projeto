import java.util.ArrayList;

public class Cliente {
	private String nome;
	private int cpf;
	private Data dataNascimento;
	private String endereco;
	private String email;
	private String login;
	private String senha;
	private ArrayList <Compra> historicoCompras;
	
		
	public Cliente(String nome, int cpf, Data nascimento, String endereco, String email, String login, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = nascimento;
		this.endereco = endereco;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.historicoCompras = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	public int getCpf() {
		return cpf;
	}
	public Data getNascimento() {
		return dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
		public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void addCompra (Compra compra){
		historicoCompras.add (compra);
	}

	public ArrayList<Compra> getHistoricoCompras() {
		return historicoCompras;
	}
	
}

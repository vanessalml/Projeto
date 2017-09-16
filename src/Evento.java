import java.util.ArrayList;

public class Evento {
	protected Data data;
	protected Hora hora;
	private Ambiente localDeRealização;
	private ArrayList <Ingresso> ingressos;
	
	public Evento(Data data, Hora hora, Ambiente localDeRealização) {
		this.ingressos = new ArrayList<>();
		this.data = data;
		this.hora = hora;
		this.localDeRealização = localDeRealização;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public ArrayList<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(ArrayList<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
	
	public void gerarIngresso (float preco){
		
	}
}


public class Motorista extends Veiculo {

	protected String nome;
	protected String cpf;
		
		
	public Motorista(String rota, float km, String modelo, String placa, String nome, String cpf) {
		super(rota, km, modelo, placa);
		setNome(nome);
		setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if((nome.length()>0)&&(nome.equalsIgnoreCase(nome)))
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length()==14)
			this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome do motorista= ");
		builder.append(nome);
		builder.append(", CPF= ");
		builder.append(cpf);
		builder.append(", combustivel gasto na viagem= ");
		builder.append(combustivelgasto());
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}

	
	
	
}

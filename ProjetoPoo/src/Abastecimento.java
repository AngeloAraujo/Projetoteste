
public class Abastecimento extends Veiculo{

	private float litroscombustivel;
	private double preco;
	
	
	
	public Abastecimento(String rota, float km, String modelo, String placa,float litroscombustivel, double preco) {
		super(rota, km, modelo, placa);
		setLitroscombustivel(litroscombustivel);
		setPreco(preco);
		
		
		
	}

	public float getLitroscombustivel() {
		return litroscombustivel;
	}

	public void setLitroscombustivel(float litroscombustivel) {
		if(litroscombustivel>0)
		this.litroscombustivel = litroscombustivel;
	}

	
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco>0)
		this.preco = preco;
	}
	

	
	public boolean abastecido(float litroscombustivel) {
		if(litroscombustivel<=combustivelgasto()) {
			return true;
		}
		else
			return false;
		}

	
	public float abastece(float litros) {
		if(abastecido(litros)) {
			setTanquecombustivel(getTanquecombustivel()+litros);
		}
		return tanquecombustivel ;
	}
	

	public double valorcombustivel(float litroscombustivel) {
		return (getLitroscombustivel()*getPreco());
	}
	
	
	
	public float custo() {
		return (float) (getLitroscombustivel()*getPreco());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quantidade de litros abastecido= ");
		builder.append(litroscombustivel);
		builder.append(", preco da gasolina= ");
		builder.append(preco);
		builder.append(", quantidade de combustível no tanque após abastecer=");
		builder.append(tanquecombustivel);
		builder.append(", custo da viagem= ");
		builder.append(custo());
		builder.append(", combustivel gasto na viagem=");
		builder.append(combustivelgasto());
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}

	



		
	
	
	}
	
	
	
	
	


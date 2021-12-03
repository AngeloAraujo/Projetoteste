
public class Veiculo extends Rotas {

	protected String modelo;
	protected String placa;
	protected float consumo;
	protected float tanquecombustivel;
	protected int modelotanque;
	
	
	

	public Veiculo(String rota, float km, String modelo, String placa) {
		super(rota, km);
		setModelo(modelo);
		setConsumo(consumo);
		setPlaca(placa);
		setModelotanque(modelotanque);
		setTanquecombustivel(tanquecombustivel);
	}

	

	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		if(modelo.length()>0) {			
		this.modelo = modelo;
	}
	}


	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		if (placa.length()==7)
		this.placa = placa;
	}

	
	public float getConsumo() {
		return consumo;
	}


	public void setConsumo(float consumo) {
		if("Gol".equalsIgnoreCase(modelo)) {
			consumo=(float) 13.3;
		}
		else if ("Onix".equalsIgnoreCase(modelo)){
			consumo=(float) 14.3;
		}
		else if ("Uno".equalsIgnoreCase(modelo)){
			consumo=(float) 13.2;
		}
		else if("Sandero".equalsIgnoreCase(modelo)) {
			consumo=(float) 13.2;
		}
		this.consumo = consumo;
	}


	public int getModelotanque() {
		return modelotanque;
	}


	public void setModelotanque(int modelotanque) {
		if("gol".equalsIgnoreCase(modelo)) {
			modelotanque=50;
		}
		else if ("Onix".equalsIgnoreCase(modelo)){
			modelotanque=54;
		}
		else if ("Uno".equalsIgnoreCase(modelo)){
			modelotanque=48;
		}
		else if("Sandero".equalsIgnoreCase(modelo)) {
			modelotanque=50;
		}
		this.modelotanque = modelotanque;
	}
	
	public float combustivelgasto() {
		return (getKm()/getConsumo());
		
	}
	public float getTanquecombustivel() {
		return tanquecombustivel;
	}


	public void setTanquecombustivel(float tanquecombustivel) {
		this.tanquecombustivel = (getModelotanque()-combustivelgasto());
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo= ");
		builder.append(modelo);
		builder.append(", placa= ");
		builder.append(placa);
		builder.append(", consumo= ");
		builder.append(consumo);
		builder.append(", tanquecombustivel= ");
		builder.append(tanquecombustivel);
		builder.append(", modelotanque= ");
		builder.append(modelotanque);
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}




	


	

	


}
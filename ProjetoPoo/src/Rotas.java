
public class Rotas {

	protected String rota;
	protected float km;
	
	
	
	public Rotas(String rota, float km) {
		setRota(rota);
		setKm(km);
	}



	public String getRota() {
		return rota;
	}



	public void setRota(String rota) {
		if(rota.length()>0)
		this.rota = rota;
	}



	public float getKm() {
		return km;
	}



	public void setKm(float km) {
		if(km>0)
		this.km = km;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rotas= ");
		builder.append(rota);
		builder.append(", km= ");
		builder.append(km);
		return builder.toString();
	}
	
	
	
	
}

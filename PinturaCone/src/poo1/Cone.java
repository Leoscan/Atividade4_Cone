package poo1;

public class Cone {
	private double z, r;
	private int tTinta;
	
	//construtores
	public Cone(double z, double r, int tTinta) {
		setZ(z);
		setR(r);
		settTinta(tTinta);
	}
	
	public Cone(double r, int tTinta) {
		setR(r);
		settTinta(tTinta);
	}
	
	public Cone() {
	}
	
	//get e set
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		if (z > 0)
			this.z = z;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		if (r > 0)
			this.r = r;
	}
	public int gettTinta() {
		return tTinta;
	}
	public void settTinta(int tTinta) {
		if (tTinta > 0 && tTinta < 4)
			this.tTinta = tTinta;
	}
	
	//metodos
	public double geratriz() {			
		return  Math.sqrt(Math.pow(r,2) + Math.pow(z,2));
	}
	public double aFundo() {
		return 3.14 * Math.pow(r,2) ;
	}
	public double aLateral() {
		return 3.14 * r * geratriz();
	}
	public double aTotal() {
		return 3.14 * r * (geratriz() + r) ;
	}
	public double Litros() {
		return 3.45 * aTotal() ;
	}
	public double Latas() {
		return  Math.round(Litros() / 18) ;
	}
	public double preco() {
		if(tTinta == 1) {
			return Latas() * 238.90;
		} else if (tTinta == 2) {
			return Latas() * 467.98;
		} else {
			return Latas() * 758.34;
		}
	}

	
	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone z=");
		builder.append(z);
		builder.append(",\n r=");
		builder.append(r);
		builder.append(",\n tTinta=");
		builder.append(tTinta);
		builder.append(",\n geratriz()=");
		builder.append(geratriz());
		builder.append(",\n aFundo()=");
		builder.append(aFundo());
		builder.append(",\n aLateral()=");
		builder.append(aLateral());
		builder.append(",\n aTotal()=");
		builder.append(aTotal());
		builder.append(",\n Litros()=");
		builder.append(Litros());
		builder.append(",\n Latas()=");
		builder.append(Latas());
		builder.append(",\n preco()=");
		builder.append(preco());
		return builder.toString();
	}
	
	
	
	
}

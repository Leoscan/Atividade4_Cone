package poo1;

public class Main {

	public static void main(String[] args) {
		
		
		//construtor 1 = z, r, tipo de tinta
		Cone cone1 = new Cone(16.53 , 37.78 , 3);
		System.out.println("Cone 1: "+cone1);
		System.out.println("\n");
		
		//construtor 2 = r, tipo de tinta
		Cone cone2 = new Cone(3.5 , 2);
		cone2.setZ(9);
		System.out.println("Cone 2: "+cone2);
		System.out.println("\n");
		
		//construtor 3 = vazio
		Cone cone3 = new Cone();
		cone3.setZ(8);
		cone3.setR(6);
		cone3.settTinta(1);
		System.out.println("Cone 3: "+cone3);
	
	}

}

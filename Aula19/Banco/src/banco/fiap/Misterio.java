package banco.fiap;

public class Misterio {

	double executarUmaDivisaoEstranha() {
		int dividendo = 54;
		int divisor = 0;
		
		return dividendo / divisor;		
	}
	
	public static void main(String[] args) {
		Misterio m = new Misterio();
		double quociente = m.executarUmaDivisaoEstranha();
		System.out.println(quociente);
	}

}

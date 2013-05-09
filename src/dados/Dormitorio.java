package dados;

public class Dormitorio extends Comodo {

	@Override
	public int getTug() {
		if (perimetro<=5) {
			return 1;
		}
		
		int a = (int) Math.floor(perimetro / 5);
		return a;
		
	}
	
	@Override
	public String getTipo() {
		return "Quarto/Sala";
	}

}

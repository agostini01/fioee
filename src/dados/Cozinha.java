package dados;

public class Cozinha extends Comodo {

	@Override
	public int getTug() {
		int a = (int) Math.floor(perimetro / 3.5);
		if (a <= 2) {
			return 2;
		} else {
			return a;
		}
	}
	
	@Override
	public String getTipo() {
		return "Cozinha";
	}

}

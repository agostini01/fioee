package dados;

public class Outros extends Comodo {

	@Override
	public int getTug() {
		if (area <= 6) {
			return 1;
		}

		if (perimetro <= 5) {
			return 1;
		}

		int a = (int) Math.floor(perimetro / 5);
		return a;
	}

	@Override
	public String getTipo() {
		return "Outro";
	}

}

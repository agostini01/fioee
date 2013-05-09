package dados;

public class Comodo {
	public double area;
	public double perimetro;

	public double getPotenciaDeIluminacao() {
		if (area <= 6) {
			return 100;
		} else {
			return 100+60*((int)((area-6)/4));
		}
	}
}

package dados;

public abstract class Comodo {
	public double area;
	public double perimetro;

	public abstract int getTug();
	public abstract String getTipo();
	
	public double getPotenciaDeIluminacao() {
		if (area <= 6) {
			return 100;
		} else {
			return 100+60*((int)((area-6)/4));
		}
	}
	
}

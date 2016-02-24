package ETS;

public class Contador {

private int valor;
	
	public void decrementar() {
		if (valor > 0)
			valor = valor -1;
	}
	
	public int getContador() {
		return valor;	
	}

	public void incrementar() {
		valor = valor +1;
	}
	
	public void printContador() {
		System.out.println(valor);
	}
	
	public void reset() {
		valor = 0;
	}
}

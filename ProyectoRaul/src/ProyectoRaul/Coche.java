package ProyectoRaul;

public class Coche extends Vehiculo {
	public Coche(String marca, String color, String nBastidor, int kilometros, double velocidadMax, boolean electrico, boolean antiguo) {
		super(marca, color, nBastidor, kilometros);
		this.electrico = electrico;
		this.antiguo = antiguo;
	}

	protected boolean electrico;
	private boolean antiguo;

	public boolean isElectrico() {
		return electrico;
	}

	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}

	public boolean isAntiguo() {
		return antiguo;
	}

	public void setAntiguo(boolean antiguo) {
		this.antiguo = antiguo;
	}

	@Override
	public String toString() {
		return "Coche [electrico=" + electrico + ", antiguo=" + antiguo + "]";
	}

}

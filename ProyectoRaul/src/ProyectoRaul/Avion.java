package ProyectoRaul;

public class Avion extends Vehiculo {

	private byte motores;
	private boolean combate;
	
	public Avion(String marca, String color, String nBastidor, int kilometros, boolean combate) {
		super(marca, color, nBastidor, kilometros);
		this.combate = combate;
	}

	public Avion(String marca, String color, String nBastidor, int kilometros, byte motores, double velocidadMax,
			boolean combate) {
		super(marca, color, nBastidor, kilometros);
		this.motores = motores;
		this.velocidadMax = velocidadMax;
		this.combate = combate;
	}

	public byte getMotores() {
		return motores;
	}

	public void setMotores(byte motores) {
		this.motores = motores;
	}

	public boolean isCombate() {
		return combate;
	}

	public void setCombate(boolean combate) {
		this.combate = combate;
	}

	@Override
	public String toString() {
		return "Avion [motores=" + motores + ", velocidadMax=" + velocidadMax + ", combate=" + combate + "]";
	}

}

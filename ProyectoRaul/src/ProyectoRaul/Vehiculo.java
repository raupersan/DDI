package ProyectoRaul;

public abstract class Vehiculo implements Comparable<Vehiculo> {

	public String marca;
	public String color;
	public String nBastidor;
	public int kilometros;
	protected int anoFabricacion;
	protected double velocidadMax;

//Clase abstracta porque no quiero crear objetos de Vehículo sino de las clases hijas
	public Vehiculo(String marca, String color, String nBastidor, int kilometros, int anoFabricacion,
			double velocidadMax) {
		super();
		this.marca = marca;
		this.color = color;
		this.nBastidor = nBastidor;
		this.kilometros = kilometros;
		this.anoFabricacion = anoFabricacion;
		this.velocidadMax = velocidadMax;
	}

	public Vehiculo(String marca, String color, String nBastidor, int kilometros) {
		super();
		this.marca = marca;
		this.color = color;
		this.nBastidor = nBastidor;
		this.kilometros = kilometros;
		this.anoFabricacion = anoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getnBastidor() {
		return nBastidor;
	}

	public void setnBastidor(String nBastidor) {
		this.nBastidor = nBastidor;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public double getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", color=" + color + ", nBastidor=" + nBastidor + ", kilometros="
				+ kilometros + ", anoFabricacion=" + anoFabricacion + "]";
	}

	@Override
	public int compareTo(Vehiculo v) {
		if (velocidadMax > v.getVelocidadMax())
			return 1;
		if (velocidadMax < v.getVelocidadMax())
			return -1;

		return 0;
	}

}

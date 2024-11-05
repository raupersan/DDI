package ProyectoRaul;

public class Barco extends Vehiculo{
	public Barco(String marca, String color, String nBastidor, int kilometros,double velocidadMax, int eslora, int calado, String tipo) {
		super(marca, color, nBastidor, kilometros);
		this.eslora = eslora;
		this.calado = calado;
		this.tipo = tipo;
	}
	private int eslora;
	private int calado;
	private String tipo = "Vela, Pesca, Pasajeros";
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) { //El UMl indica que recojamos la eslora como un double, no se si es un error o no
										//pero he decidio recogerlo como un entero
		this.eslora = eslora;
	}
	public int getCalado() {
		return calado;
	}
	public void setCalado(int calado) {
		this.calado = calado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Barco [eslora=" + eslora + ", calado=" + calado + ", tipo=" + tipo + "]";
	}
	
}

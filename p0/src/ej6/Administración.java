package ej6;

public class Administración extends Persona {
	private String estudios;
	private int antigüedad;
	public Administración(String dNI, String nombre, String apellidos, int salario, String estudios, int antigüedad) {
		super(dNI, nombre, apellidos, salario);
		this.estudios = estudios;
		this.antigüedad = antigüedad;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public int getAntigüedad() {
		return antigüedad;
	}
	public void setAntigüedad(int antigüedad) {
		this.antigüedad = antigüedad;
	}
	
}

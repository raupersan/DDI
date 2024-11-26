package ficheros;

public class Usuario {
	private String nombre;
	private String contrasena;
	private boolean admin;
	private String correo;
	
	public Usuario(String nombre, String contrasena, boolean admin, String correo) {
		super();
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.admin = admin;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
	public String toString () {
		return "Usuario " + getNombre();
	}
}
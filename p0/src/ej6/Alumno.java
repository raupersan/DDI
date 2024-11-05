package ej6;

import java.util.Date;

public class Alumno{
	private static String DNI;
	private static String nombreAlumno;
	private static String apellidos;
	private static Date fechaNac;
	private static boolean hombre;
	private static boolean repetidor;

	public Alumno(String Dni, String nombreAlumno, String apellidos, Date fechaNac, boolean hombre, boolean repetidor, Modulo modulo) {
	}

	public static String getDNI() {
		return DNI;
	}

	public static void setDNI(String dNI) {
		DNI = dNI;
	}

	public static String getNombreAlumno() {
		return nombreAlumno;
	}

	public static void setNombreAlumno(String nombreAlumno) {
		Alumno.nombreAlumno = nombreAlumno;
	}

	public static String getApellidos() {
		return apellidos;
	}

	public static void setApellidos(String apellidos) {
		Alumno.apellidos = apellidos;
	}

	public static Date getFechaNac() {
		return fechaNac;
	}

	public static void setFechaNac(Date fechaNac) {
		Alumno.fechaNac = fechaNac;
	}

	public static boolean isHombre() {
		return hombre;
	}

	public static void setHombre(boolean hombre) {
		Alumno.hombre = hombre;
	}

	public static boolean isRepetidor() {
		return repetidor;
	}

	public static void setRepetidor(boolean repetidor) {
		Alumno.repetidor = repetidor;
	}

}

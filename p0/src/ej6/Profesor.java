package ej6;

public class Profesor extends Persona {
		private int nAsignaturas;
		private boolean tutor;
		public Profesor(String dNI, String nombre, String apellidos, int salario, int nAsignaturas, boolean tutor) {
			super(dNI, nombre, apellidos, salario);
			this.nAsignaturas = nAsignaturas;
			this.tutor = tutor;
		}
		public Profesor(String nombre) {
			super(nombre);
			this.nombre=nombre;
		}
		public int getnAsignaturas() {
			return nAsignaturas;
		}
		public void setnAsignaturas(int nAsignaturas) {
			this.nAsignaturas = nAsignaturas;
		}
		public boolean isTutor() {
			return tutor;
		}
		public void setTutor(boolean tutor) {
			this.tutor = tutor;
		}
	public int wait(int pid) {
		return pid;
	}
}

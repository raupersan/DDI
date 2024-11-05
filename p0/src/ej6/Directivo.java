package ej6;

public class Directivo extends Persona {
	private boolean salesiano;
	private boolean turnoMañana;
	public Directivo(String dNI, String nombre, String apellidos, int salario, boolean salesiano, boolean turnoMañana) {
		super(dNI, nombre, apellidos, salario);
		this.salesiano = salesiano;
		this.turnoMañana = turnoMañana;
	}
	public boolean isSalesiano() {
		return salesiano;
	}
	public void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}
	public boolean isTurnoMañana() {
		return turnoMañana;
	}
	public void setTurnoMañana(boolean turnoMañana) {
		this.turnoMañana = turnoMañana;
	}

}

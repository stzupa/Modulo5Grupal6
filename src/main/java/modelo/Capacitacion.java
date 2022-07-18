package modelo;

public class Capacitacion {
	
	private int id;
	private int rut;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int c_asistentes;
	
	public Capacitacion() {
		super();
	}

	public Capacitacion(int id, int rut, String dia, String hora, String lugar, String duracion, int c_asistentes) {
		super();
		this.id = id;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.c_asistentes = c_asistentes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getC_asistentes() {
		return c_asistentes;
	}

	public void setC_asistentes(int c_asistentes) {
		this.c_asistentes = c_asistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
				+ ", duracion=" + duracion + ", c_asistentes=" + c_asistentes + "]";
	}	
}

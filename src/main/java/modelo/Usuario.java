package modelo;

public class Usuario {
	
	private String nombre;
	private String fechaNac;
	private int rut;
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String fechaNac, int rut) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNac=" + fechaNac + ", rut=" + rut + "]";
	}
	
}

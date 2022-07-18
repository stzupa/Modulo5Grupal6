package modelo;

public class Cliente {
	
	private int rut;
	private String nombre;
	private String apellidos;
	private String telelefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	public Cliente() {
		super();
	}
	public Cliente(int rut, String nombre, String apellidos, String telelefono, String afp, int sistemaSalud,
			String direccion, String comuna, int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telelefono = telelefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelelefono() {
		return telelefono;
	}
	public void setTelelefono(String telelefono) {
		this.telelefono = telelefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telelefono=" + telelefono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + "]";
	}
	
}

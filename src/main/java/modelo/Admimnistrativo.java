package modelo;

public class Admimnistrativo {
	
	private String area;
	private String experiencia;
	public Admimnistrativo() {
		super();
	}
	public Admimnistrativo(String area, String experiencia) {
		super();
		this.area = area;
		this.experiencia = experiencia;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Admimnistrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}	
	

}

package implementacion;

import java.util.List;

import modelo.Capacitacion;

public interface ICapService {
	
	public List<Capacitacion> leerCapacitaciones();
	public void crearCapacitacion(Capacitacion id);

}

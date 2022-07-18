package modelo.dao;

import java.util.List;

import modelo.Capacitacion;

public interface ICapacitacionDAO {
	
	public void crear(Capacitacion cap);
	public List<Capacitacion> leerCapacitaciones();
	public Capacitacion leerCapacitacion(int id);
	public void actualizar(Capacitacion cap);
	public void eliminar(int id);

}

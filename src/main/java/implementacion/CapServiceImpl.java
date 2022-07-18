package implementacion;

import java.util.List;

import modelo.Capacitacion;
import modelo.dao.CapacitacionDAO;
import modelo.dao.ICapacitacionDAO;

public class CapServiceImpl implements ICapService {
	
	ICapacitacionDAO dao = new CapacitacionDAO();

	@Override
	public List<Capacitacion> leerCapacitaciones() {
		return dao.leerCapacitaciones();
	}

}

package implementacion;

import java.util.ArrayList;
import java.util.List;

import interfaces.ICapacitacion;
import modelo.Capacitacion;

public class CapacitacionService implements ICapacitacion {

	@Override
	public List<Capacitacion> getListadoCapacitaciones() {
		
		List<Capacitacion> listado = new ArrayList<Capacitacion>();
		
		listado.add(new Capacitacion(1, 15885445, "Lunes", "16:00", "Valparaiso", "tres semanas", 23));
		listado.add(new Capacitacion(2, 95887445, "Martes", "09:00", "Curauma", "Dos semanas", 15));
		listado.add(new Capacitacion(3, 54885665, "Miercoles", "15:30", "Viña del Mar", "Un mes", 9));
		
		return listado;
	}

	@Override
	public void setCapacitacion(Capacitacion capacitacion) {
		
		List<Capacitacion> listado = getListadoCapacitaciones();		
		Capacitacion cap = new Capacitacion();		
		cap = listado.get(0);		
		System.out.println(cap.toString());

	}

}

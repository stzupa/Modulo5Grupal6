package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import implementacion.CapacitacionService;
import modelo.Capacitacion;

@WebServlet("/crearCap")
public class ServletCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletCrearCapacitacion() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		
		if (sesion.getAttribute("usuario") == null) {
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);			
		}else {
			getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);
		}	
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CapacitacionService capService = new CapacitacionService();
		
		HttpSession sesion = request.getSession();
		
		if (sesion.getAttribute("capacitaciones") == null) {
			sesion.setAttribute("capacitaciones", capService.getListadoCapacitaciones());
		}
		
		List<Capacitacion> capacitaciones = (List<Capacitacion>) sesion.getAttribute("capacitaciones");
		
		Capacitacion cap = new Capacitacion();
				
		cap.setRut(Integer.parseInt(request.getParameter("rutCliente")));
		cap.setDia(request.getParameter("diaSemana"));
		cap.setHora(request.getParameter("hora"));
		cap.setLugar(request.getParameter("lugar"));
		cap.setDuracion(request.getParameter("duracion"));
		cap.setC_asistentes(Integer.parseInt(request.getParameter("nAsistentes")));
		
		capacitaciones.add(cap);
		
		sesion.setAttribute("capacitaciones", capacitaciones);
		
		request.setAttribute("capacitaciones", sesion.getAttribute("capacitaciones"));
		
		getServletContext().getRequestDispatcher("/views/messageCreaCap.jsp").forward(request, response);		
		
	}
	
	private String diaSemana(String dia) {
		
		System.out.println(dia);
		
		String diaString = "";
		
		switch (dia) {
		case "1":
			diaString = "Lunes";
			break;
		case "2":
			diaString = "Martes";
			break;
		case "3":
			diaString = "Miercoles";
			break;
		case "4":
			diaString = "Jueves";
			break;
		case "5":
			diaString = "Viernes";
			break;
		case "6":
			diaString = "Sabado";
			break;
		case "7":
			diaString = "Domingo";
			break;
		default:
			break;
		}		
		return diaString;		
	}

}

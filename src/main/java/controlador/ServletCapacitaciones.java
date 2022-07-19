package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import implementacion.CapServiceImpl;
import implementacion.CapacitacionService;
import implementacion.ICapService;
import modelo.Capacitacion;

@WebServlet("/capacitaciones")
public class ServletCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static ICapService service = new CapServiceImpl();
 
    public ServletCapacitaciones() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();

		if (sesion.getAttribute("usuario") == null) {
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		} else {

			String op = request.getParameter("op");

			String jsp = "";

			if (op == null) {
				op = "list";
			}

			switch (op) {
			case "list":
				request.setAttribute("capacitaciones", service.leerCapacitaciones());
				jsp = "/views/listarCapacitaciones.jsp";
				break;
			case "new":
				jsp = "/views/crearCapacitacion.jsp";
				break;
			default:
				break;
			}
			request.setAttribute("op", op);
			request.setAttribute("capacitaciones", service.leerCapacitaciones());
			getServletContext().getRequestDispatcher(jsp).forward(request, response);

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String op = request.getParameter("op");
		
		Capacitacion cap;

		String jsp = "/views/listarCapacitaciones.jsp";

		if (op == null) {
			op = "list";
		}

		switch (op) {
		case "new":
			cap = new Capacitacion();
			
			cap.setRut(Integer.parseInt(request.getParameter("rutCliente")));
			cap.setDia(request.getParameter("diaSemana"));
			cap.setHora(request.getParameter("hora"));
			cap.setLugar(request.getParameter("lugar"));
			cap.setDuracion(request.getParameter("duracion"));
			cap.setC_asistentes(Integer.parseInt(request.getParameter("nAsistentes")));
			
			service.crearCapacitacion(cap);
			break;
		default:
			break;
		}
		request.setAttribute("op", op);
		request.setAttribute("capacitaciones", service.leerCapacitaciones());
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
		
		doGet(request, response);
	}

}

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

@WebServlet("/listarCap")
public class ServletListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static ICapService service = new CapServiceImpl();
 
    public ServletListarCapacitaciones() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("capacitaciones", service.leerCapacitaciones());
		getServletContext().getRequestDispatcher("/views/listarCapacitaciones.jsp").forward(request, response);
		
		/*
		 * CapacitacionService capService = new CapacitacionService();
		 * 
		 * List<Capacitacion> capacitaciones = new ArrayList<>();
		 * 
		 * HttpSession sesion = request.getSession();
		 * 
		 * if (sesion.getAttribute("capacitaciones") == null) { capacitaciones =
		 * capService.getListadoCapacitaciones(); }else { capacitaciones =
		 * (List<Capacitacion>) sesion.getAttribute("capacitaciones"); }
		 * 
		 * if (sesion.getAttribute("usuario") == null) {
		 * getServletContext().getRequestDispatcher("/views/login.jsp").forward(request,
		 * response); }else { sesion.setAttribute("capacitaciones", capacitaciones);
		 * request.setAttribute("capacitaciones", capacitaciones);
		 * getServletContext().getRequestDispatcher("/views/listarCapacitaciones.jsp").
		 * forward(request, response); }
		 */	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

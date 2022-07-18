package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/creaUser")
public class ServletCrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletCrearUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
		
		if (sesion.getAttribute("usuario") == null) {
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);			
		}else {
			getServletContext().getRequestDispatcher("/views/crearUsuario.jsp").forward(request, response);
		}	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

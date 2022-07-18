package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ingreso")
public class ServletIngreso extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletIngreso() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		String usuario = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		//String estado = "activo";
		
		if (usuario.equals("admin") && pass.equals("1234")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("usuario", usuario);
			//session.setAttribute("estado", estado);
			request.setAttribute("usuario", session.getAttribute(usuario));
			request.setAttribute("estado", "activo");
			getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
		}else {
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		}
	}

}

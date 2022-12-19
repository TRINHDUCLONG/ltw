package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import entity.Product;


@WebServlet("/addCart")
public class AddCartControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        Cookie arr[] = request.getCookies();
        String txt1 = "";
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                txt1 = txt1 + o.getValue();
                o.setMaxAge(0);
                response.addCookie(o);
            }
        }
        if (txt1.isEmpty()) {
            txt1 = id;
        } else {
            txt1 = txt1 + "-" + id;
        }
        Cookie c = new Cookie("id", txt1);
        c.setMaxAge(60 * 60 * 24);
        response.addCookie(c);
        response.sendRedirect("cart");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package Control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sub")
public class SubCartControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id"); // doc id san pham
        Cookie arr[] = request.getCookies(); // arr cookie
        String txt1 = "";
        for (Cookie o : arr) {
            if (o.getName().equals("id")) { // kiem tra cookie co ten = id
                txt1 = txt1 + o.getValue(); //txt = id
                o.setMaxAge(0); // xoa cookie do di
                response.addCookie(o); // 
            }
        }
        String ids[] = txt1.split("-");// mang cooke dang id-id xoa ki tu -
        String txt1OutPut = "";
        int check = 0;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(id)) { // kiem tra id co trong list chua
                check++; //tang check
            }
            if (check != 1) {
                if (txt1OutPut.isEmpty()) { // kiemtra phantu mang cookie chua id san pham 
                    txt1OutPut = ids[i];
                } else {
                    txt1OutPut = txt1OutPut + "-" + ids[i];
                }
            } else {
                check++; //tang check
            }
        }
        if (!txt1OutPut.isEmpty()) {
            Cookie c = new Cookie("id", txt1OutPut);
            c.setMaxAge(60 * 60 * 24);
            response.addCookie(c);
        }
        response.sendRedirect("cart");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

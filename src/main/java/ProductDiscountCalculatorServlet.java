import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    @WebServlet(name = "ProductDiscountCalculatorServlet", value = "/convert")
    public class ProductDiscountCalculatorServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");

            String ProductDescription = request.getParameter("ProductDescription");
            Double ListPrice = Double.parseDouble("ListPrice");
            Double DiscountPercent = Double.parseDouble("DiscountPercent");
            Double DiscountAmount = ListPrice * DiscountPercent * 0.01;
            Double DiscountPrice = ListPrice - DiscountAmount;

            request.setAttribute("ProductDescription", ProductDescription);
            request.setAttribute("ListPrice", ListPrice);
            request.setAttribute("DiscountPercent", DiscountPercent);
            request.setAttribute("DiscountAmount", DiscountAmount);
            request.setAttribute("DiscountPrice", DiscountPrice);
            request.getRequestDispatcher("/display-discount.jsp").forward(request,response);

        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
        }
    }


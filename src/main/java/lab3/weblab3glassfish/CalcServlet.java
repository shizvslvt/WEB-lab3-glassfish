package lab3.weblab3glassfish;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import lab3.weblab3glassfish.logic.CalcFunction;

@WebServlet(name = "calcServlet", value = "/calc-servlet")
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");

        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));
        CalcFunction cf = new CalcFunction(start, end, step);

        request.setAttribute("start", start);
        request.setAttribute("end", end);
        request.setAttribute("step", step);

        //6
        int maxI = cf.getMaxI();
        int minI = cf.getMinI();
        double maxX = cf.getX(maxI);
        double maxY = cf.getY(maxI);
        double minX = cf.getX(minI);
        double minY = cf.getY(minI);
        request.setAttribute("maxI", maxI);
        request.setAttribute("minI", minI);
        request.setAttribute("maxX", maxX);
        request.setAttribute("maxY", maxY);
        request.setAttribute("minX", minX);
        request.setAttribute("minY", minY);


        //7
        double sum = cf.getSum();
        double average = cf.getAverage();
        request.setAttribute("sum", sum);
        request.setAttribute("average", average);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/results.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

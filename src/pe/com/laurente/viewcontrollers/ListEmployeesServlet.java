package pe.com.laurente.viewcontrollers;


import pe.com.laurente.models.HRService;
import pe.com.laurente.models.Employee;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
@WebServlet(name = "ListEmployeesServlet" ,urlPatterns = "/ListEmployeesWithServlets")
public class ListEmployeesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
            throws ServletException, IOException {
        try {
            InitialContext ctx = new InitialContext();
            HRService service = new HRService(ctx);
            PrintWriter out = response.getWriter();

            out.println("Employees**");
            List<Employee> employees = service
                    .findAllEmployees();
            for(Employee employee : employees)   out.println("Employee " + employee.getLastname() + " has "                        );
            } catch (NamingException e1) {
            e1.printStackTrace();
        }


}
}






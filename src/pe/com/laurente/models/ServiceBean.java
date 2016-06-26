package pe.com.laurente.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class ServiceBean  implements Serializable {
    HRService service;
    InitialContext context = null;
    Integer Criteria ;

    public ServiceBean() {
        try {
            context = new InitialContext();
            service = new HRService(context);
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

    public List<Employee> getAllEmployees() { return service.findAllEmployees(); }

    public int getEmployeesForNum() {
        return service.finByNo(this.Criteria);
    }
}


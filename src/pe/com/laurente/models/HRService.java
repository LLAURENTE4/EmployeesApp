package pe.com.laurente.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class HRService {



    private EmployeesEntity employeesEntity;
    Connection connection;
    DataSource dataSource;
    private static String DATA_SOURCE = "jdbc/EmpsDataSource";

    public HRService(InitialContext context) {
        try {
            dataSource = (DataSource) context.lookup(DATA_SOURCE);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }


    public boolean connect() {
        if(connection == null) {
            try {
                connection = dataSource.getConnection();
                return(connection != null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public Connection getConnection() {
        if(connection== null) {
            if(!connect()) {
                return null;
            };
        }
        return connection;
    }

    public EmployeesEntity getEmployeesEntity() {
        if(employeesEntity == null) {
            employeesEntity = new EmployeesEntity();
            employeesEntity.setConnection(getConnection());
        }
        return employeesEntity;
    }

    public List<Employee> findAllEmployees() {
        return getEmployeesEntity().findAll();
    }

    public Employee finByNo(Integer num) { return getEmployeesEntity().findByNo(num);}
}

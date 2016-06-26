package pe.com.laurente.models;

import org.apache.taglibs.standard.lang.jstl.EmptyOperator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class EmployeesEntity extends BaseEntity{


    private static String DEFAULT_QUERY = "SELECT * FROM employees";

    public List<Employee> findAll() {
        String query = DEFAULT_QUERY;
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            List<Employee> employees = new ArrayList<>();
            while(rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("emp_no"),
                        rs.getDate("birth_date"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("gender"),
                        rs.getDate("hire_date")
                );
                employees.add(employee);
            }
            return employees;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Employee findByNo(Integer no) {
        String query = DEFAULT_QUERY + " where emp_no = " + no;
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            if(rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("emp_no"),
                        rs.getDate("birth_date"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("gender"),
                        rs.getDate("hire_date")
                );
                return employee;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}

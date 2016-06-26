package pe.com.laurente.models;

/**
 * Created by GrupoUTP on 25/06/2016.
 */
public class Department {

    private String no;
    private String name;

    public Department(String no , String name ){
        this.no=no;
        this.name=name;

    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

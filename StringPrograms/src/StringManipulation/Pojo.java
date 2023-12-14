package StringManipulation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pojo {
    int id;
    String EmployeeName;
    public Pojo() {}
    public Pojo(int id, String employeeName) {
        super();
        this.id = id;
        EmployeeName = employeeName;
        }
    public int getId() {
        return id;
        }
    public void setId(int id) {
        this.id = id;
        }
    public String getEmployeeName() {
        return EmployeeName;
        }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
        }
    public static void main(String[] args) {
        List<Pojo> maplist = List.of(new Pojo(1,"datta"),new Pojo(2,"sharma"),new Pojo(2,"ram"));
        Map<String, Integer> mapp = maplist.stream().collect(Collectors.toMap(Pojo::getEmployeeName, Pojo::getId));
        mapp.forEach((EmployeeName,id)-> System.out.println(EmployeeName+" : " + id));

    }

 

}


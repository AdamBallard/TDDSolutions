import java.sql.SQLException;

public class User {
    private EmployeeSystem employeeSystem;

    public User(String firstName, String lastName, int ID, int salary){
    }
    public User(EmployeeSystem employeeSystem){
        this.employeeSystem = employeeSystem;
    }

    public int checkEmployeeSalary(int id) throws SQLException {

        int salary = employeeSystem.fetchEmployeeSalary(id);
        return salary;
    }
}

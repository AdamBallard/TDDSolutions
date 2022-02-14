import java.sql.*;

public class EmployeeSystem {

    public EmployeeSystem() {

    }

    public int fetchEmployeeSalary(int ID) throws SQLException {
        Connection conn = DriverManager.getConnection("URL");
        Statement statement = conn.createStatement();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM USER WHERE ID =" + ID + "");
        int salary = rs.getInt("SALARY");

        return salary;
    }
}

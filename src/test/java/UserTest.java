import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserTest {

    private EmployeeSystem employeeSystemMock;
    private User user;

    @BeforeEach
    public void init(){
        employeeSystemMock = mock(EmployeeSystem.class);
        user = new User(employeeSystemMock);

    }

    @Test
    void returnSalaryAll() throws SQLException {

        int salary = 30000;
        when(employeeSystemMock.fetchEmployeeSalary(1)).thenReturn(salary);
        assertEquals(30000, user.checkEmployeeSalary(1));
    }
}

package employee.example.EmployeeProjetc.DTO;

import employee.example.EmployeeProjetc.Entity.Employee;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class EmployeeDTO {
    private String employeeid;
    private String employeename;
    private String email;
    private String phone;
    private int role;

    public EmployeeDTO(String employeeid, String employeename, String email, String phone, int role) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }
    public EmployeeDTO(Employee employee) {
        this.employeeid = String.valueOf(employee.getEmployeeid());
        this.email = employee.getEmail();
        this.employeename = employee.getEmployeename();
        this.phone = employee.getPhone();
        this.role = employee.getRole();
    }
}

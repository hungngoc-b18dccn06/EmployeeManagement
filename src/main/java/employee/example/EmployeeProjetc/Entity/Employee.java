package employee.example.EmployeeProjetc.Entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name="employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeid;
    @Column(name="employee_name", length = 255)
    private String employeename;
    @Column(name="email", length = 255)
    private String email;
    @Column(name="phone", length = 255)
    private String phone;
    @Column(name="password", length = 255)
    private String password;

    public Employee(int employeeid, String employeename, String email, String phone, String password) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Employee() {

    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

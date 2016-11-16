package classes;

public class Employee extends Person{
     String department;
     int empId;
     int sssId;
     int pagibigId;



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSssId() {
        return sssId;
    }

    public void setSssId(int sssId) {
        this.sssId = sssId;
    }

    public int getPagibigId() {
        return pagibigId;
    }

    public void setPagibigId(int pagibigId) {
        this.pagibigId = pagibigId;
    }
}

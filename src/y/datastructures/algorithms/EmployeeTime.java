package y.datastructures.algorithms;

import java.time.LocalTime;

public class EmployeeTime {

    private String employeeName;
    private LocalTime accessTime;

    public EmployeeTime(String employeeName, LocalTime accessTime) {
        this.employeeName = employeeName;
        this.accessTime = accessTime;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public LocalTime getAccessTime() {
        return accessTime;
    }
}

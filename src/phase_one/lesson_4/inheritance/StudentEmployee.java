package phase_one.lesson_4.inheritance;

public class StudentEmployee extends Student{
    private String employeeId;
    private double rateOfPayPerHour;

    public StudentEmployee(String firstName, String lasName, String studentId, String employeeId,
                           double rateOfPayPerHour) {
        super(firstName, lasName, studentId);
        this.employeeId = employeeId;
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getRateOfPayPerHour() {
        return rateOfPayPerHour;
    }

    public void setRateOfPayPerHour(double rateOfPayPerHour) {
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    @Override
    public String toString() {
        return super.toString() + " employee ID " + employeeId + " pay " + rateOfPayPerHour;
    }
}

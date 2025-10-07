public class Employee {
    private int employeeNumber;
    private double payRate;
    private static final int MAX_EMPLOYEE_NUMBER = 9999;
    private static final double MAX_RATE = 60.00;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            employeeNumber = MAX_EMPLOYEE_NUMBER;
        //if (payRate > MAX_RATE)
        //    payRate = MAX_RATE;

        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double computeRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double computeOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }
}
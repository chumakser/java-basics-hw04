public class Employee implements Payable {
  String employeeId = "";
  String name = "";

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public Employee() {
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement
    return 0;
  }

  @Override
  public String toString() {
    long roundedSalary = Math.round(getAverageMonthlySalary());
    double doubleSalary = roundedSalary;
    String formatedSalary = String.format("%.2f", doubleSalary);
    return "Salary of " + getName() + " is " + formatedSalary;
  }

  @Override
  public void calculatePay() {


  }
}

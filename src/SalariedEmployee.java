public class SalariedEmployee extends Employee implements Payable {
  String socialSecurityNumber = "";
  double fixedMonthlyPayment = 0l;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId,name);
    this.employeeId = employeeId;
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  @Override
  public double getAverageMonthlySalary() {
    return getFixedMonthlyPayment();
  }

}

public class ContractedEmployee extends Employee implements Payable{
  String federalTaxId = "";
  double hourlyRate = 0l;
  double numberOfHoursWorked =0l;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId,name);
    this.employeeId = employeeId;
    this.name = name;
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }
  @Override
  public double getAverageMonthlySalary() {
    return getHourlyRate() * getNumberOfHoursWorked();
  }
}



public class employee{
    private double salaryCoefficient;
    private String name;
    public final double basicSalary = 750000;
    public final double maxSalary = 20000000;
    public employee(String name,double salaryCoefficient){
        this.name = name;
        this.salaryCoefficient = salaryCoefficient;
    }
    public String getName(){
        return this.name;
    }
    public double getsalaryCoefficient(){
        return this.salaryCoefficient;
    }
    public boolean increaseSalary(){
        if(caculateSalary() <= maxSalary){
            return true;
        }
        return false;
    }
    public double caculateSalary(){
        return basicSalary * salaryCoefficient;
    }
    public void printInfo(){
        System.out.println("Name: " + name + " | Salary coefficient: " + salaryCoefficient);
    }
}

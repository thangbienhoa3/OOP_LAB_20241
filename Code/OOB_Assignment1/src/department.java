

public class department {
    private String name; 
    private Byte numberOfEmployee;
    public final Byte numberOfEmployeeMax = 20;
    stack employeeStack = new stack();
    public department(String name,Byte numberOfEmployee){
        this.name = name;
        this.numberOfEmployee = numberOfEmployee;
    }
    public String getName(){
        return this.name;
    }
    public Byte getNumberOfEmployee(){
        return this.numberOfEmployee;
    }
    public void addEmployee(employee nv){
        if(numberOfEmployee + 1 <= numberOfEmployeeMax){
            employeeStack.push(nv);
        }
        else System.out.print("Cannot add more employees");
    }
    public void eliminateEmployees(employee nv){
        employeeStack.pop(nv);
    }
    public int caculateTotalSalary(){
        int totalSalary = 0;
        for(int i = 0;i < employeeStack.getSize();i++){
            if(employeeStack.getElement(i) != null){
                totalSalary += employeeStack.getElement(i).caculateSalary();
            }
        }
        return totalSalary;
    }
    public void printInfo(){
        for(int i = employeeStack.getSize()-1;i >= 0;i--){
            if(employeeStack.getElement(i) != null){
                employeeStack.getElement(i).printInfo();
            }
        }
    }
}

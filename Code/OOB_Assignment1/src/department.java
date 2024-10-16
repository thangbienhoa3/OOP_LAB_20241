

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
    public void printInfo(){
        for(int i = 0;i < employeeStack.getSize();i++){
            if(employeeStack.getElement(i) != null){
                employeeStack.getElement(i).printInfo();
            }
        }
    }
}

public class App {
    // Index of the bottom of the stack is zero 
    // Inder of the top of the stack is size of the stack - 1
    public static void main(String[] args) throws Exception {
        department IT = new department("IT", (byte) 10);
        IT.employeeStack.push(new employee("Thang", 2));
        IT.employeeStack.push(new employee("Thai", 3));
        IT.employeeStack.push(new employee("Hai", 4));
        IT.employeeStack.push(new employee("Van", 2));
        IT.employeeStack.push(new employee("Hoa", 3));
        IT.employeeStack.push(new employee("Mai", 4));
        IT.printInfo();
        System.out.println();
        IT.eliminateEmployees(IT.employeeStack.getElement(0));
        IT.printInfo();
    }
}

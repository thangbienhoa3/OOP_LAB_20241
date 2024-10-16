public class App {
    public static void main(String[] args) throws Exception {
        department IT = new department("IT", (byte) 10);
        IT.employeeStack.push(new employee("Thang", 2));
        IT.employeeStack.push(new employee("Thang", 2));
        IT.employeeStack.push(new employee("Thang", 2));
        System.out.println(IT.caculateTotalSalary());
        IT.printInfo();
    }
}

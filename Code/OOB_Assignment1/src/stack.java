import java.util.ArrayList;
import java.util.List;

public class stack {

    public List <employee> employeeList = new ArrayList<employee>();    
    public stack(){

    }
    public void push(employee nv){
        if(employeeList.contains(nv) == false){
            employeeList.add(nv);
        }
    }
    public void pop(employee nv){
        for(int i = 0;i < employeeList.size();i++){
            if(employeeList.get(i).getName().equals(nv.getName())){
                employeeList.remove(i);
            }
        }
    }
    public int getSize() {
       return employeeList.size();
    }
    public employee getElement(int i){
        if(employeeList.get(i) != null){
            return employeeList.get(i);
        }
        return null;
    }
}

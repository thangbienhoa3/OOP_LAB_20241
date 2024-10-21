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
        List <employee> tmpList = new ArrayList<employee>();
        int i = employeeList.size()-1;
        while(i >= 0 && employeeList.get(i).equals(nv) == false){
            tmpList.add(employeeList.get(i));
            employeeList.remove(i);
            i--;
        }
        if(i >= 0){employeeList.remove(i);};
        for(i = tmpList.size()-1;i >= 0;i--){
            employeeList.add(tmpList.get(i));
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

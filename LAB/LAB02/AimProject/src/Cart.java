import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBER_ORDERS = 20;
    private ArrayList <DigitalVideoDisc> itemOrdered1 = new ArrayList<>();
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        itemOrdered1.add(disc);
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(itemOrdered1.contains(disc) == true){
            itemOrdered1.remove(disc);
        }
    }
    public float totalCost(){
        float cost = 0;
        for (DigitalVideoDisc digitalVideoDisc : itemOrdered1) {
            if(digitalVideoDisc != null){
                cost += digitalVideoDisc.getCost();
            }
        }
        return cost;
    }
}

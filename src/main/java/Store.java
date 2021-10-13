import lombok.Data;

public class Store {

    private final int capacity = 15;
    private int unitsInStock;

    public Store(){
        this.unitsInStock = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }
    public synchronized String addUnit(){
        if(this.unitsInStock < this.capacity){
            this.unitsInStock += 1;
            return "One unit added";
        }
        return "Store full";
    }
    public synchronized String substractUnit(){
        if(this.unitsInStock > 0){
            this.unitsInStock -= 1;
            return "One unit added";
        }
        return "Cant' drink, Store empty";
    }


}

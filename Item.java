public class Item{
    private String itemId;
    private String itemName;
    private int quantity;
    private double price;

    //constructor
    public Item(String itemId,String itemName,int quantity,double price){
        this.itemId=itemId;
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
    }

    //getters
    public String getitemId(){
        return itemId;
    }

    public String getitemName(){
        return itemName;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    //setter for quantity
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //toString method
    public String toString(){
        return "ID: " + itemId +"\tName: " + itemName +"\tQuantity: " + quantity +"\tPrice: " + price;
    }
}
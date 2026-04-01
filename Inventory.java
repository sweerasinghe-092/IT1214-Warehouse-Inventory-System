import java.util.ArrayList;

public class Inventory{
    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    //add item to the inventory
    public void addItem(Item item){
        items.add(item);
        System.out.println("Item added successfully!");
    }

    //remove item from inventory
    public void removeItem(String id){
        for (Item item : items) {
            if (item.getitemId().equals(id)) {
                items.remove(item);
                System.out.println("Item removed!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    //update quantity
    public void updateQuantity(String id, int newQty){
        for (Item item : items){
            if (item.getitemId().equals(id)){
                item.setQuantity(newQty);
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    //search item using ID or name
    public void searchItem(String key){
        for (Item item : items) {
            if (item.getitemId().equals(key) || 
                item.getitemName().equalsIgnoreCase(key)){
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    //display all items in inventory
    public void displayItems(){
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        for (Item item : items){
            System.out.println(item);
        }
    }
}

package Association.SingleDirectionEX1;

public class Item {
    private String itemName;
    private double price;

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display_item_details(){
        System.out.println("Item name : " + this.itemName + " & price : " +getPrice() + " RS");
    }
}

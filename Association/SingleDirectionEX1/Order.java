package Association.SingleDirectionEX1;

public class Order {
    private String OrderID;
    private Item[] items;
    public Order(String orderID, Item[] items) {
        OrderID = orderID;
        this.items = items;}
    public void display_order_details(){
        double totalprice = 0.0;
        System.out.println("Order ID - " + this.OrderID);
        System.out.println("Ordered items , ");
        for(int i = 0; i < items.length; i++){
            items[i].display_item_details();
            totalprice = totalprice + items[i].getPrice();
        }
        System.out.print("Total price is : " + totalprice + " RS");
    }
}

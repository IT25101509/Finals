package Association.SingleDirectionEX1;

public class OrderApp {
    public static void main(String[] args) {
        Item item1 = new Item("AD001556556" , 500.00);
        Item item2 = new Item("FF776554466" , 400.00);
        Item item3 = new Item("VX221165442" , 1500.00);
        Item item4 = new Item("VA141154494" , 5550.00);
        Item[] items = {item1 ,item2 , item3 , item4};
        Order order1 = new Order("SDDM4455465644QW" , items);
        order1.display_order_details();
    }
}

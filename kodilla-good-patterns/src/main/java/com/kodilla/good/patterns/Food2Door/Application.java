package Food2Door;

public class Application {
    public static void main(String[] args) {
        ExecuteOrder executeOrder = new ExecuteOrder();

        Order order1 = new Order(35, "spinach");
        Order order2 = new Order(200, "peas");
        Order order3 = new Order(40, "pineapple");

        executeOrder.Run(order1);
        executeOrder.Run(order2);
        executeOrder.Run(order3);
    }
}

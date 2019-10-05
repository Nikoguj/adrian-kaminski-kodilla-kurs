package challenges;

public class ProductOrderRepository implements OrderRepository{

    @Override
    public void createOrder(User user, String product) {
        System.out.println(user.getName() + " ordered " + product + " - has been added to the database");
    }
}

package challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private ProductOderService productOderService;

    public OrderProcessor(InformationService informationService, OrderRepository orderRepository, ProductOderService productOderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.productOderService = productOderService;
    }

    public OrderDto process(final OrderRequest orderRequest)
    {
        boolean isBought = productOderService.order(orderRequest.getUser(), orderRequest.getProduct());

        if(isBought) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        }else {
            System.out.println(orderRequest.getUser().getName() + " can't buy " + orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}

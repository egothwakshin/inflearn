package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        orders[0] = tofu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        orders[1] = kimchi;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;
        orders[2] = cola;

        int totalAmount1 = 0;
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명: " + orders[i].productName
                             + ", 가격: " + orders[i].price
                             + ", 수량: " + orders[i].quantity);
            totalAmount1 += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount1);

        int totalAmount2 = 0;
        for (int i = 0; i < orders.length; i++) {
            ProductOrder pdOrder = orders[i];
            System.out.println("상품명: " + pdOrder.productName
                             + ", 가격: " + pdOrder.price
                             + ", 수량: " + pdOrder.quantity);
            totalAmount2 += pdOrder.price * pdOrder.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount2);

        int totalAmount3 = 0;
        for (ProductOrder pdOrder : orders) {
            System.out.println("상품명: " + pdOrder.productName
                             + ", 가격: " + pdOrder.price
                             + ", 수량: " + pdOrder.quantity);
            totalAmount3 += pdOrder.price * pdOrder.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount3);
    }
}

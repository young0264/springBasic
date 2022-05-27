package hello.core.order;

//회원ID, 상품명, 상품가격을 parameter로 넘기면 주문결과를 return으로 반환한다.

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}



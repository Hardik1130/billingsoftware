package in.bhushansirgur.billingsoftware.service;

import in.bhushansirgur.billingsoftware.io.OrderRequest;
import in.bhushansirgur.billingsoftware.io.OrderResponse;
import in.bhushansirgur.billingsoftware.io.PaymentVerificationRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

   OrderResponse createdOrder(OrderRequest request);

   void deleteOrder(String orderId);

   List<OrderResponse> getLatesOrders();

    OrderResponse verifyPayment(PaymentVerificationRequest request);

    Double sumSalesByDate(LocalDate date);

    Long countByOrderDate(LocalDate date);

    List<OrderResponse> findRecentOrders();

}

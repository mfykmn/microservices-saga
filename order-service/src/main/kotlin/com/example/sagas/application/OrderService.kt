package com.example.sagas.application

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

import com.example.sagas.domain.entity.Order
import com.example.sagas.domain.entity.OrderDetails
import com.example.sagas.domain.entity.OrderId
import com.example.sagas.domain.repository.DbOrder
import com.example.sagas.domain.repository.OrderRepository

//   @Transactional
@Service
class OrderService {

//    @Autowired
//    private SagaManager<CreateOrderSagaState> createOrderSagaManager
//
    @Autowired
    lateinit var orderRepository: OrderRepository
//
//    @Autowired
//    private DomainEventPublisher eventPublisher

    fun createOrder(orderDetails: OrderDetails) : Order {

        // Orderを作る
        val order = Order(orderDetails.itemId, orderDetails.itemName)
//        ResultWithEvents<Order> orderAndEvents = Order.createOrder(orderDetails)
//        Order order = orderAndEvents.result
//
        // Orderをデータベースに永続化する
        orderRepository.save(DbOrder(orderId = order.orderId, itemId = order.itemId, itemName = order.itemName))
//
//        // ドメインイベントをパブリッシュする
//        eventPublisher.publish(Order.class, Long.toString(order.getId(), orderAndEvents.events);
//
//        // Sagaを作成する
//        CreateOrderSagaState data = new CreateOrderSagaState(order.getId(), orderDetails);
//        createOrderSagaManager.create(data, Order.class, order.getId());

        return order;
    }

    fun findById(orderId: OrderId) : Order? {
        val dbOrder = orderRepository.findByOrderId(orderId)
        if (dbOrder != null) {
            return Order(orderId = dbOrder.orderId, itemId = dbOrder.itemId, itemName = dbOrder.itemName)
        }
        return null
    }
}

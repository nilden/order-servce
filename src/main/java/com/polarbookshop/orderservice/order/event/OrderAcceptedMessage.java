package com.polarbookshop.orderservice.order.event;

public record OrderAcceptedMessage(
        long OrderId
) {
}

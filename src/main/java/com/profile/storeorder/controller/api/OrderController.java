package com.profile.storeorder.controller.api;

import com.profile.storeorder.controller.OrderApi;
import com.profile.storeorder.model.dto.OrderDTO;
import com.profile.storeorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OrderController implements OrderApi {

    @Autowired
    private OrderService orderService;

    @Override
    public ResponseEntity<OrderDTO> create(final OrderDTO orderDTO) {
        return ResponseEntity.ok(orderService.create(orderDTO));
    }

    @Override
    public ResponseEntity<OrderDTO> update(final String reference, final OrderDTO orderDTO) {
        return ResponseEntity.ok(orderService.update(reference, orderDTO));
    }

    @Override
    public ResponseEntity<List<OrderDTO>> getAll() {
        return ResponseEntity.ok(orderService.getAll());
    }
}
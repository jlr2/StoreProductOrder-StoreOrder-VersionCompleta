package com.profile.storeorder.service;

import com.profile.storeorder.model.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    OrderDTO create(final OrderDTO orderDTO);

    OrderDTO update(final String reference, final OrderDTO orderDTO);

    List<OrderDTO> getAll();

}

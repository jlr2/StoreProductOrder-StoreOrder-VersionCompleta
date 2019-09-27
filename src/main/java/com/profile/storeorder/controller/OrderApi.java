package com.profile.storeorder.controller;


import com.profile.storeorder.controller.constant.EndPointUris;
import com.profile.storeorder.model.dto.OrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(EndPointUris.ORDERS)
public interface OrderApi {

    @CrossOrigin
    @PostMapping
    ResponseEntity<OrderDTO> create(@Valid @RequestBody final OrderDTO orderDTO);

    @PutMapping(EndPointUris.ORDER)
    ResponseEntity<OrderDTO> update(@PathVariable final String reference, @Valid @RequestBody final OrderDTO orderDTO);

    @GetMapping
    ResponseEntity<List<OrderDTO>> getAll();

}

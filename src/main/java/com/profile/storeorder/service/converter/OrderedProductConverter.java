package com.profile.storeorder.service.converter;

import com.profile.storeorder.model.OrderedProductVO;
import com.profile.storeorder.model.dto.OrderedProductDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderedProductConverter {

    public OrderedProductDTO convertEntityToDTO(final OrderedProductVO orderedProductVO) {
        return OrderedProductDTO.builder().price(orderedProductVO.getPrice()).quantity(orderedProductVO.getQuantity())
                .reference(orderedProductVO.getReference()).build();
    }

    public OrderedProductVO convertDTOToEntity(final OrderedProductDTO orderedProductDTO) {
        return OrderedProductVO.builder().price(orderedProductDTO.getPrice()).quantity(orderedProductDTO.getQuantity())
                .reference(orderedProductDTO.getReference()).build();
    }

}

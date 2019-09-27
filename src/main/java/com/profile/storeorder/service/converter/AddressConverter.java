package com.profile.storeorder.service.converter;

import com.profile.storeorder.model.AddressVO;
import com.profile.storeorder.model.dto.AddressDTO;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter {
    public AddressDTO convertEntityToDTO(final AddressVO addressVO) {

        return AddressDTO.builder().city(addressVO.getCity()).address(addressVO.getAddress())
                .zipCode(addressVO.getZipCode()).build();
    }

    public AddressVO convertDTOToEntity(final AddressDTO addressDTO) {

        return AddressVO.builder().city(addressDTO.getCity())
                .address(addressDTO.getAddress())
                .zipCode(addressDTO.getZipCode()).build();
    }
}

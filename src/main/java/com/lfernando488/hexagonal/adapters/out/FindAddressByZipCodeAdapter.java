package com.lfernando488.hexagonal.adapters.out;

import com.lfernando488.hexagonal.adapters.out.client.FindAddressByZipcodeClient;
import com.lfernando488.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.lfernando488.hexagonal.application.core.domain.Address;
import com.lfernando488.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipcodeClient findAddressByZipcodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressRespone = findAddressByZipcodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressRespone);
    }

}

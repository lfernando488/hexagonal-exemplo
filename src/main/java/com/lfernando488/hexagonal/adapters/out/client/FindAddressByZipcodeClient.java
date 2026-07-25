package com.lfernando488.hexagonal.adapters.out.client;

import com.lfernando488.hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAddressByZipcodeClient", url = "${hexagonal.client.address.url}")
public interface FindAddressByZipcodeClient {

    @GetMapping("/{Zipcode}")
    AddressResponse find(@PathVariable("Zipcode") String Zipcode);

}

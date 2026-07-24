package com.lfernando488.hexagonal.application.ports.out;

import com.lfernando488.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find (String zipCode);
}

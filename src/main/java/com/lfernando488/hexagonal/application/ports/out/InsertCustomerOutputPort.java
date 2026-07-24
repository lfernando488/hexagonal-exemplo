package com.lfernando488.hexagonal.application.ports.out;

import com.lfernando488.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert (Customer customer);

}

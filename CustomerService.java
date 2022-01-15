package com.outfit.outfitshopping.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService {
    public List<Customer> getCustomer() {
        return List.of(
                new Customer(
                        1L,
                        " kelvin",
                        " saka",
                        " blessingskelvinsaka@gamil.com",
                        " notNeeded",
                        " chanco"


                )
        );
    }
}
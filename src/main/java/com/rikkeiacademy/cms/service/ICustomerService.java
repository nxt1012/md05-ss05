package com.rikkeiacademy.cms.service;

import com.rikkeiacademy.cms.model.Customer;
import com.rikkeiacademy.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService extends IGeneralService <Customer>{
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);


    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

    Optional<Customer> findOne(Long id) throws Exception;
}

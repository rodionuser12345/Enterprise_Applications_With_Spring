package com.rodion.springboot.enterprise_applications_with_spring.service;

import com.rodion.springboot.enterprise_applications_with_spring.repository.BillionaireSpringDataJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BillionairesServiceImpl implements BillionairesService {

    private final BillionaireSpringDataJpaRepository billionairesJPADao;

    public BillionairesServiceImpl(BillionaireSpringDataJpaRepository billionairesJPADao) {
        this.billionairesJPADao = billionairesJPADao;
    }
}
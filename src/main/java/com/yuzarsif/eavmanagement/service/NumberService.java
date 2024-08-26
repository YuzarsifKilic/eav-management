package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.model.Number;
import com.yuzarsif.eavmanagement.repository.NumberRepository;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    private final NumberRepository numberRepository;

    public NumberService(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }

    protected void createNumber(Number number) {
        numberRepository.save(number);
    }
}

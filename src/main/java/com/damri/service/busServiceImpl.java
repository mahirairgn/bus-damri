package com.damri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damri.model.Bus;
import com.damri.repository.BusDb;

@Service
public class busServiceImpl implements busService {

    @Autowired
    BusDb busDb;

    @Override
    public List<Bus> getAllBus() {
        return busDb.findAll();
    }
    
}

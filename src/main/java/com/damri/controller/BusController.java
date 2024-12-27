package com.damri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.damri.model.Bus;
import com.damri.service.busService;

public class BusController {

    @Autowired
    private busService busService;

    @GetMapping("/bus/viewall")
    public String listProyek(Model model) {

        List<Bus> listBus = busService.getAllBus();
    
        model.addAttribute("listBus", listBus);

        return "viewall-bus";
    }
}

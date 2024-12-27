package com.damri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import com.damri.model.Bus;
import com.damri.service.busService;

@Controller
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private busService busService;

    @GetMapping("/viewall")
    public String listProyek(Model model) {
        List<Bus> listBus = busService.getAllBus();
        model.addAttribute("listBus", listBus);
        return "viewall-bus"; // Return Thymeleaf template
    }
}

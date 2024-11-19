package com.example.LedgerSystem.CONTROLLERS;

import com.example.LedgerSystem.ENTITIES.Service;
import com.example.LedgerSystem.SERVICES.ServiceManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceManagementController {
    @Autowired
    private ServiceManagementService serviceManagementService;

    @PostMapping
    public Service registerService(@RequestBody Service service) {
        return serviceManagementService.registerService(service);
    }

    @GetMapping
    public List<Service> getAllServices() {
        return serviceManagementService.getAllServices();
    }
}

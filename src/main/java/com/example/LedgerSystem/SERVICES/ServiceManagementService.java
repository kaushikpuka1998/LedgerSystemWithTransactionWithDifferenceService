package com.example.LedgerSystem.SERVICES;

import com.example.LedgerSystem.REPOSITORIES.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.LedgerSystem.ENTITIES.Service;


import java.util.List;

@org.springframework.stereotype.Service
public class ServiceManagementService {
    @Autowired
    private ServiceRepository serviceRepository;

    public Service registerService(Service service) {
        return serviceRepository.save(service);
    }

    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
}

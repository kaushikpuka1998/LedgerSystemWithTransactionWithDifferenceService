package com.example.LedgerSystem.REPOSITORIES;

import com.example.LedgerSystem.ENTITIES.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, String> {
    Service findByName(String name);
    Service save(Service service);

}

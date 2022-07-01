package com.beeauto.repositories;

import com.beeauto.Entities.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.beeauto.Entities.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>{

    @Query("SELECT c FROM Client c " +
            "WHERE c.cin = ?1 AND c.isActive = true")
    Client findByCin(int cin);
}


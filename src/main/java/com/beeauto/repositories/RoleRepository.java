package com.beeauto.repositories;

import com.beeauto.Entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.beeauto.Entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    @Query("SELECT r FROM Role r " +
            "WHERE r.nomrole = ?1")
    Role findByNom(String nom);

}

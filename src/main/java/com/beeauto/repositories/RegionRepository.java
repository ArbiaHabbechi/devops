package com.beeauto.repositories;

import com.beeauto.Entities.Region;
import com.beeauto.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegionRepository extends JpaRepository<Region , Long> {

    @Query("SELECT r FROM Region r " +
            "WHERE r.regionName = ?1")
    Region findByName(String regionName);

}

package com.Spring.Spring.dataAccess;

import com.Spring.Spring.entities.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TravelDao extends JpaRepository<Travel,Integer> {

    Travel findById(int id);

    List<Travel> getByUser_Id(int userId);

}

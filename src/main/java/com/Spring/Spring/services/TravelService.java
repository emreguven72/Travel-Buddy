package com.Spring.Spring.services;

import com.Spring.Spring.entities.Travel;

import java.util.List;

public interface TravelService {

    List<Travel> getAll();

    Travel getById(int id);

    List<Travel> getByUserId(int userId);

    void add(Travel travel);

    List<Travel> getByLocations(String startLocation,String endLocation);

}

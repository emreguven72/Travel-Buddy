package com.Spring.Spring.services;

import com.Spring.Spring.dataAccess.TravelDao;
import com.Spring.Spring.entities.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelManager implements TravelService{
    private TravelDao travelDao;

    @Autowired
    public TravelManager(TravelDao travelDao) {
        this.travelDao = travelDao;
    }

    @Override
    public List<Travel> getAll() {
        return this.travelDao.findAll();
    }

    @Override
    public Travel getById(int id) {
        return this.travelDao.findById(id);
    }

    @Override
    public List<Travel> getByUserId(int userId) {
        return this.travelDao.getByUser_Id(userId);
    }

    @Override
    public String add(Travel travel) {
        this.travelDao.save(travel);
        return "You have successfully created a travel";
    }

}

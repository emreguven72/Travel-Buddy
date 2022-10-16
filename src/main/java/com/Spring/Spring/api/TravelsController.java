package com.Spring.Spring.api;

import com.Spring.Spring.entities.Travel;
import com.Spring.Spring.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/travels")
@CrossOrigin
public class TravelsController {
    private TravelService travelService;

    @Autowired
    public TravelsController(TravelService travelService) {
        this.travelService = travelService;
    }

    @GetMapping(value = "/getAll")
    public List<Travel> getAll() {
        return this.travelService.getAll();
    }

    @GetMapping(value = "/get")
    public Travel getById(@RequestParam int id) {
        return this.travelService.getById(id);
    }

    @GetMapping(value = "/getByUser")
    public List<Travel> getByUserId(@RequestParam int id) {
        return this.travelService.getByUserId(id);
    }

    @PostMapping(value = "/add")
    public String add(@RequestBody Travel travel) {
        return this.travelService.add(travel);
    }

}

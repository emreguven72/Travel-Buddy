package com.Spring.Spring.api;

import com.Spring.Spring.entities.Travel;
import com.Spring.Spring.entities.User;
import com.Spring.Spring.services.TravelService;
import com.Spring.Spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/travels")
@CrossOrigin
public class TravelsController {
    private TravelService travelService;
    private UserService userService;

    @Autowired
    public TravelsController(TravelService travelService, UserService userService) {
        this.travelService = travelService;
        this.userService = userService;
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
    public String add(@RequestBody Travel travel, @RequestParam int userId) {
        User user = this.userService.getById(userId);
        travel.user = user;
        return this.travelService.add(travel);
    }

}

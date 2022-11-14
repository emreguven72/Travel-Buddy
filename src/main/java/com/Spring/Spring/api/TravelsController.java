package com.Spring.Spring.api;

import com.Spring.Spring.entities.Travel;
import com.Spring.Spring.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.travelService.getAll());
    }

    @GetMapping(value = "/get")
    public ResponseEntity<?> getById(@RequestParam int id) {
        return ResponseEntity.ok(this.travelService.getById(id));
    }

    @GetMapping(value = "/getByUser")
    public ResponseEntity<?> getByUserId(@RequestParam int id) {
        return ResponseEntity.ok(this.travelService.getByUserId(id));
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody Travel travel) {
        this.travelService.add(travel);
    }
}

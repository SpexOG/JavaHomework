package com.post_homework.rest_services.controllers;

import com.post_homework.rest_services.models.Charity;
import com.post_homework.rest_services.services.CharityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/charity")
public class CharityController {

    @Autowired
    private CharityService charityService;

    @GetMapping
    public ResponseEntity<List<Charity>> getAll(){

        return ResponseEntity.ok(charityService.findAll());

    }

    @GetMapping("/{event}")
    public ResponseEntity<Charity> getCharityByEvent(@PathVariable String event){

        Charity charity = charityService.getCharityByEvent(event);

        if (charity == null){

            return ResponseEntity.notFound().build();

        }

        return ResponseEntity.ok(charity);

    }

    @PostMapping
    public ResponseEntity<Charity> saveCharity(@RequestBody Charity charity){

        return ResponseEntity.ok(charityService.addCharity(charity));

    }

    @DeleteMapping("/{event}")
    public ResponseEntity<Void> deleteCharity(@PathVariable String event){

        charityService.deleteCharity(event);

        return ResponseEntity.noContent().build();

    }

}

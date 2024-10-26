package com.post_homework.rest_services.repository;

import com.post_homework.rest_services.models.Charity;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CharityRepository {

    private Map<String, Charity> charities = new HashMap<>();

    public List<Charity> findAll(){

        return new ArrayList<>(charities.values());

    }

    public Charity findByEvent(String event){

        return charities.get(event);

    }

    public Charity save(Charity charity){

        charities.put(charity.getEvent(), charity);
        saveToFile(charity);
        return charity;

    }

    public void deleteByEvent(String event){

        charities.remove(event);

    }

    private void saveToFile(Charity charity) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("volunteers.txt", true))) {
            writer.write("Event: " + charity.getEvent() + ", Name: " + charity.getName() + ", Email: " + charity.getEmailAddress() + ", Phone: " + charity.getPhoneNumber());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package com.post_homework.rest_services.services;

import com.post_homework.rest_services.models.Charity;
import com.post_homework.rest_services.repository.CharityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharityService {

    @Autowired
    private CharityRepository charityRepository;

    public List<Charity> findAll(){

        return charityRepository.findAll();

    }

    public Charity getCharityByEvent(String event){

        return charityRepository.findByEvent(event);

    }

    public Charity addCharity(Charity charity){

        return charityRepository.save(charity);

    }

    public void deleteCharity(String event){

        charityRepository.deleteByEvent(event);

    }

}

package com.post_homework.rest_services.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Charity {

    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String event;

}

package com.rest.prosloyka.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Person {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("birthday")
    private Date birthday;
    @JsonProperty("weight")
    private Float weight;
    @JsonProperty("height")
    private Float height;
    @JsonProperty("passportID")
    private String passportID;

    public Person(String name, Date birthday, Float weight, Float height, String passportID) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
        this.passportID = passportID;
    }
}

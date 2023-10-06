package com.okta.developer.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Person {
    
    @Id @GeneratedValue
    private Long id;

    private String birthMonth; 
    private String birthYear; 
    private String countryOfResidence;

    private String name; 
    private String nationality; 

    public Person(String birthMonth, String birthYear, String countryOfResidence, String name, String nationality){
        this.id = null; 
        this.birthMonth = birthMonth; 
        this.birthYear = birthYear; 
        this.countryOfResidence = countryOfResidence; 
        this.name = name; 
        this.nationality = nationality; 

    }

    public Person withId(Long id){
        if(this.id.equals(id)){
            return this; 
        }else {
            Person newPerson = new Person(this.birthMonth, this.birthYear, this.countryOfResidence, this.name, this.nationality);
            newPerson.id = id; 
            return newPerson;
        }
    }

    //Birth m getter and setter
    public String getBirthMonth(){
        return birthMonth;
    }
    public void setBirthMonth(String birthMonth){
        this.birthMonth = birthMonth; 
    }

    //Birth y getter and setter
    public String getBirthYear(){
        return this.birthYear; 
    }
    public void setBirthYear(String birthYear){
        this.birthYear = birthYear; 
    }

    //Country getter and setter
    public String getCountryOfResidence(){
        return countryOfResidence; 
    }
    public void setCountryOfResidence(String countryOfResidence){
        this.countryOfResidence = countryOfResidence; 
    }

    //Name getter and setter
    public String getName(){
        return name; 
    }
    public void setName(String name){
        this.name = name; 
    }

    //Nationality getter and setter
    public String getNationality(){
        return nationality; 
    }
    public void setNationality(String nationality){
        this.nationality = nationality; 
    }

    //ID getter
    public Long getId(){
        return this.id;
    }
}

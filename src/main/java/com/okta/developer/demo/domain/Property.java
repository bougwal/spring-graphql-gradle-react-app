package com.okta.developer.demo.domain;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Property {
    
    @Id
    @GeneratedValue
    private Long id; 
    private String address; 
    private String country;
    private String district;
    private String titleNumber;

    public Property(String address, String country, String district, String titleNumber){
        this.id = id; 
        this.address = address; 
        this.country = country; 
        this.district = district; 
        this.titleNumber = titleNumber; 
    }

    public Property withId(Long id){
        if(this.id.equals(id)){
            return this; 
        }else {
            Property newProperty = new Property(this.address, this.country, this.district, this.titleNumber); 
            newProperty.id = id;
            return newProperty; 
        }
    }

    //Address getter and setter
    public String getAddress(){
        return address; 
    }
    public void setAddress(String address){
        this.address = address; 
    }
    
    //Country getters and setters
    public String getCountry(){
        return country; 
    }
    public void setCountry(){
        this.country = country; 
    }

    //District getters and setters 
    public String getDistrict(){
        return district; 
    }

    public void setDistrict(String district){
        this.district = district; 
    }

    //TitleNumber getters and setters 

    public String getTitleNumber(){
        return titleNumber; 
    }
    public void setTitleNumber(String titleNumber){
        this.titleNumber = titleNumber; 
    }
}

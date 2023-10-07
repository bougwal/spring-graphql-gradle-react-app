package com.okta.developer.demo.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class Company {
    
    @Id
    @GeneratedValue
    private Long id; 
    private String SIC; 
    private String category; 
    private String companyNumber; 
    private String countryOfOrigin; 
    private LocalDate incorporationDate; 
    private Integer mortgageOutstanding; 
    private String name; 
    private String status; 

    // Auto mapping 
    private List<Property> owns = new ArrayList<>(); 
    @Relationship(type = "HAS_CONTROL", direction = Relationship.Direction.INCOMING) 
    private List<Person> controlledBy = new ArrayList<>(); 

    public Company(String SIC, String category, String companyNumber, String countryOfOrigin, LocalDate incorporationDate, Integer mortgageOutstanding, String name, String status){
        this.id = id; 
        this.SIC = SIC; 
        this.category = category; 
        this.companyNumber = companyNumber; 
        this.countryOfOrigin = countryOfOrigin; 
        this.incorporationDate = incorporationDate; 
        this.mortgageOutstanding = mortgageOutstanding; 
        this.name = name; 
        this.status = status; 
    }

    public Company withId(Long id){
        if(this.id.equals(id)){
            return this; 
        }else {
            Company newCompany = new Company(this.SIC, this.category, this.companyNumber, this.countryOfOrigin, this.incorporationDate, this.mortgageOutstanding, this.name, this.status); 
            newCompany.id = id; 
            return newCompany; 
        }
    }

    // SIC 
    public String getSIC(){
        return SIC; 
    }
    public void setSIC(){
        this.SIC = SIC; 
    }

    // Category 

    public String getCategory(){
        return category; 
    }
    public void setCategory(){
        this.category = category; 
    }

    //CompanyNumber 
    public String getCompanyNumber(){
        return companyNumber; 
    }
    public void setCompanyNumber(String cn){
        this.companyNumber = cn; 
    }

    //Country
    public String getCountryOfOrigin(){
        return countryOfOrigin; 
    }
    public void setCountryOfOrigin(String countryOfOrigin){
        this.countryOfOrigin = countryOfOrigin;
    }

    //IncorporationDate 
    public LocalDate getIncorporationDate(){
        return incorporationDate; 
    }
    public void setIncorporationDate(){
        this.incorporationDate = incorporationDate; 
    }

    // Mortgages
    public Integer getMortgagesOutstanding(){
        return mortgageOutstanding; 
    }
    public void setMortgageOutstanding(Integer mortgageOutstanding){
        this.mortgageOutstanding = mortgageOutstanding; 
    }

    //Name 
    public String getName(){
        return name; 
    }
    public void setName(String name){
        this.name = name; 
    }

    //Status 
    public String getStatus(){
        return status; 
    }
    public void setStatus(String status){
        this.status = status;
    }
}

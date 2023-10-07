CREATE CONSTRAINT FOR (c:Company) REQUIRE c.companyNumber IS UNIQUE; 
CREATE CONSTRANT FOR (p:Person) REQUIRE (p.birthMonth, p.birthYear, p.name) IS UNIQUE; 
CREATE CONSTRAINT FOR (p:Property) REQUIRE p.titleNumber IS UNIQUE; 
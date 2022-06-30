package com.exercice.TPSpring.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    @Size(max = 50)
    private String street;
    @Size(max = 50)
    private String complement;
    @Column(nullable = false)
    @Size(max = 10)
    private String zipCode;
    @Column(nullable = false)
    @Size(max = 255)
    private String city;
    @Column(nullable = false)
    @Size(max = 255)
    private String country;

    public Adresse() {

    }

    public Adresse(long id, String street, String complement, String zipCode, String city, String country) {
        this.id = id;
        this.street = street;
        this.complement = complement;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

package com.usa.misiontic.MasterClass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "partyroom")
public class Partyroom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPartyroom;
    private String name;
    private String owner;
    private String capacity;
    private String description;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    @JsonIgnoreProperties("Partyroom")
    private Category category;


    /*
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("libs")
    private Category category;

     */

    public Integer getIdPartyroom() {
        return idPartyroom;
    }

    public void setIdPartyroom(Integer idPartyroom) {
        this.idPartyroom = idPartyroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

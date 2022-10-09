package com.usa.misiontic.MasterClass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "partyroom")
    @JsonIgnoreProperties({"tool","messages"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "partyroom")
    @JsonIgnoreProperties({"partyroom","messages"})
    private List<Reservation> reservations;



    /*
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "Partyroom")
    @JsonIgnoreProperties({"Partyroom","client"})
    private List<Message> messages;

     */


    /*
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("libs")
    private Category category;

     */

///////////////////////////////////////////////////////////////////////////////////////

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

// /////////////////////////////////////////////////////////////////////////////////

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

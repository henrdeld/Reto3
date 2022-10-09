package com.usa.misiontic.MasterClass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status = "created";

    @ManyToOne
    @JoinColumn(name = "idPartyroom")
    @JsonIgnoreProperties("reservations")
    private Partyroom partyroom;

    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;

    /*
    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservas")
    private Library library;



    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"reservas", "messages"})
    private Client client;

     */

    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Partyroom getPartyroom() {
        return partyroom;
    }

    public void setPartyroom(Partyroom partyroom) {
        this.partyroom = partyroom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

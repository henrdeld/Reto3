package com.usa.misiontic.MasterClass3.controller;


import com.usa.misiontic.MasterClass3.entities.Category;
import com.usa.misiontic.MasterClass3.entities.Reservation;
import com.usa.misiontic.MasterClass3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return reservationService.delete(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation p){
        return reservationService.update(p);
    }
/*
    //Reto 5
    @GetMapping("/report-dates/{fecha1}/{fecha2}")
    public List<Reservation> getReservationBetweenDatesReport(@PathVariable("fecha1") String fecha1, @PathVariable("fecha2") String fecha2){
        return reservationService.getReservationBetweenDatesReport(fecha1 ,fecha2);
    }

    @GetMapping("/report-status")
    public CompletedAndCancelled getReservationsStatusReport(){
        return reservationService.getReservationsStatusReport;
    }

    @GetMapping("/report-clients")
    public List<TotalAndClient> getTopClientsReport(){
        return reservationService.getTopClientsReport;
    }
*/
}
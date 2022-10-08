package com.usa.misiontic.MasterClass3.controller;


import com.usa.misiontic.MasterClass3.entities.Product;
import com.usa.misiontic.MasterClass3.entities.Reservas;
import com.usa.misiontic.MasterClass3.service.ReservasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservas")
public class ReservasController {

    @Autowired
    private ReservasService reservasService;

    @GetMapping("/all")
    public List<Reservas> getAll(){
        return reservasService.getAll();
    }
    @PostMapping("/save")
    public Reservas save(@RequestBody Reservas p){
        return reservasService.save(p);
    }




}

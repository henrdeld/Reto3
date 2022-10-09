package com.usa.misiontic.MasterClass3.controller;


import com.usa.misiontic.MasterClass3.entities.Category;
import com.usa.misiontic.MasterClass3.entities.Library;
import com.usa.misiontic.MasterClass3.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Lib")
public class LibraryController {


    @Autowired
    private LibraryService libraryService;

    @GetMapping("/all")
    public List<Library> getAll(){
        return libraryService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Library save(@RequestBody Library p){
        return libraryService.save(p);
    }




}

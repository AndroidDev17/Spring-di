package com.ankit.springdi.controllers;

import com.ankit.localEntity.PetService;
/**
 * created by Ankit on 16 of Apr, 2022
 */

public class PetController {

    private final PetService service;


    public PetController( PetService service) {
        this.service = service;
    }

    public void run() {
        System.out.println(service.getPetType() +" is running");
    }
}

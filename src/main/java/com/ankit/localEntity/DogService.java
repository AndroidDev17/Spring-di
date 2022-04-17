package com.ankit.localEntity;

/**
 * created by Ankit on 16 of Apr, 2022
 */


public class DogService implements PetService{
    @Override
    public String getPetType() {
        return "Dog";
    }
}

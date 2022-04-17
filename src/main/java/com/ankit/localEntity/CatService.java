package com.ankit.localEntity;

/**
 * created by Ankit on 16 of Apr, 2022
 */

public class CatService implements PetService{
    @Override
    public String getPetType() {
        return "Cat";
    }
}

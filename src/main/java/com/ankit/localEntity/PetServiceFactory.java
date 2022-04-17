package com.ankit.localEntity;

/**
 * created by Ankit on 17 of Apr, 2022
 */

public class PetServiceFactory {
    public PetService create(PetType type) {
        switch (type) {
            case CAT:
                return new CatService();
            case DOG:
                return new DogService();
            default:
                throw new IllegalArgumentException("Pet type doesn't exists");
        }
    }
}

package com.company;

import com.company.models.Cat;
import com.company.models.Dog;
import com.company.models.Parrot;
import com.company.models.Pet;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<AnimalsType, List<Pet> > petMap = new HashMap<>();
        petMap.put(AnimalsType.CAT, Arrays.asList(new Cat("AL")));
        petMap.put(AnimalsType.DOG, Arrays.asList(new Dog("Ash")));
        petMap.put(AnimalsType.PARROT, Arrays.asList(new Parrot("Kyle")));

        System.out.println(petMap);
        System.out.println(petMap.keySet());

    }
}

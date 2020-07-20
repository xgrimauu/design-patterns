package org.xavigrimau.designpatterns.factory.animals;

import org.xavigrimau.designpatterns.factory.IndigestionException;
import org.xavigrimau.designpatterns.factory.foods.DogFood;
import org.xavigrimau.designpatterns.factory.foods.Food;

public class Dog implements Animal {

    @Override
    public void eat(Food food) {

        if (food instanceof DogFood) {
            System.out.println("Dog: Yummy!");
        } else {
            throw new IndigestionException("That was bad..");
        }

    }
}

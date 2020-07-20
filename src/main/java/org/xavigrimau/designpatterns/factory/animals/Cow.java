package org.xavigrimau.designpatterns.factory.animals;

import org.xavigrimau.designpatterns.factory.IndigestionException;
import org.xavigrimau.designpatterns.factory.foods.CowFood;
import org.xavigrimau.designpatterns.factory.foods.Food;

public class Cow implements Animal {

    @Override
    public void eat(Food food) {

        if (food instanceof CowFood) {
            System.out.println("Cow: Yummy!");
        } else {
            throw new IndigestionException("That was bad..");
        }
    }
}

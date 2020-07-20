package org.xavigrimau.designpatterns.factory.animals;

import org.xavigrimau.designpatterns.factory.IndigestionException;
import org.xavigrimau.designpatterns.factory.foods.Food;
import org.xavigrimau.designpatterns.factory.foods.RabbitFood;

public class Rabbit implements Animal {

    @Override
    public void eat(Food food) {

        if (food instanceof RabbitFood) {
            System.out.println("Rabbit: Yummy!");
        } else {
            throw new IndigestionException("That was bad..");
        }
    }
}

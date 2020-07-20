package org.xavigrimau.designpatterns.factory;

import org.xavigrimau.designpatterns.factory.animals.Animal;
import org.xavigrimau.designpatterns.factory.animals.Cow;
import org.xavigrimau.designpatterns.factory.animals.Dog;
import org.xavigrimau.designpatterns.factory.animals.Rabbit;
import org.xavigrimau.designpatterns.factory.foods.CowFood;
import org.xavigrimau.designpatterns.factory.foods.DogFood;
import org.xavigrimau.designpatterns.factory.foods.Food;
import org.xavigrimau.designpatterns.factory.foods.RabbitFood;

public class FoodFactory {

    public Food createFoodFor(Animal animal) {

        if (animal instanceof Rabbit)
            return new RabbitFood();

        if (animal instanceof Dog)
            return new DogFood();

        if (animal instanceof Cow)
            return new CowFood();

        throw new RuntimeException("We don't have food for your animal :(");
    }
}

package org.xavigrimau.designpatterns.factory;

import org.xavigrimau.designpatterns.factory.animals.Animal;
import org.xavigrimau.designpatterns.factory.foods.Food;

public class FeedingService {

    private final FoodFactory foodFactory;

    public FeedingService() {
        this.foodFactory = new FoodFactory();
    }

    public void feedAnimal(Animal animal) {
        Food food = foodFactory.createFoodFor(animal);
        animal.eat(food);
    }
}

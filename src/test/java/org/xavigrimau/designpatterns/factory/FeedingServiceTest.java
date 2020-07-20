package org.xavigrimau.designpatterns.factory;

import org.junit.jupiter.api.Test;
import org.xavigrimau.designpatterns.factory.animals.Cow;
import org.xavigrimau.designpatterns.factory.animals.Dog;
import org.xavigrimau.designpatterns.factory.animals.Rabbit;

class FeedingServiceTest {

    private final FeedingService feedingService = new FeedingService();

    @Test
    void rabbit_does_not_get_an_indigestion() {
        Rabbit rabbit = new Rabbit();
        feedingService.feedAnimal(rabbit);
    }

    @Test
    void cow_does_not_get_an_indigestion() {
        Cow cow = new Cow();
        feedingService.feedAnimal(cow);
    }

    @Test
    void dog_does_not_get_an_indigestion() {
        Dog dog = new Dog();
        feedingService.feedAnimal(dog);
    }
}
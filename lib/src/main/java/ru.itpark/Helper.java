package ru.itpark;

import com.github.javafaker.Faker;

public class Helper {
    public String generate() {
        Faker faker = new Faker();
        return faker.name().name();
    }
}

package com.example.loadmylist;

import com.example.loadmylist.model.Animal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Utils {

    public static List<Animal> getAnimalsList() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Clifford", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("CatDog", "Cat/Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Stimpy", "Cat", 2, true, getRandomDate()));
        animals.add(new Animal("Ren", "Dog", 2, true, getRandomDate()));
        animals.add(new Animal("Cow-alsky", "Cow", 2, true, getRandomDate()));
        animals.add(new Animal("Chik ken", "Chicken", 2, true, getRandomDate()));
        animals.add(new Animal("Dumpling", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Tofu", "cat", 4, true, getRandomDate()));
        animals.add(new Animal("Garfield", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Snowball", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("Kimchi", "Cat", 4, true, getRandomDate()));
        animals.add(new Animal("Com Nan", "Dog", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        animals.add(new Animal("", "", 4, true, getRandomDate()));
        return animals;
    }

    private static Date getRandomDate() {
        int day = new Random().nextInt((31 - 1) + 1) + 1;
        int month = new Random().nextInt((12 - 1) + 1) + 1;
        int year = new Random().nextInt((2019 - 1900) + 1) + 1900;
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        try {
            date = sdf.parse(day + "/" + month + "/" + year);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}

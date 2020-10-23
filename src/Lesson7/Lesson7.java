package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Cat {
    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        fed = plate.decreaseFood(appetite);
    }

    public void info() {
        System.out.println(name + " " + (fed ? " full " : " hungry "));
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int appetite) {
        if (food - appetite < 0) {
            return false;
        }
        else {
            food -= appetite;
            return true;
        }
    }

    public void info() {
        System.out.println("plate " + food);
    }

    public void addFood(int food) {
        this.food += food;
    }
}

class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Matroskin", 30),
                new Cat("Tom", 30),
                new Cat("Garfield", 50),
        };

        Plate plate = new Plate(100);
        for(Cat itemCat:cats) {
            itemCat.eat(plate);
            itemCat.info();
        }
    }
}
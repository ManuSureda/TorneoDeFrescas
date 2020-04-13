package models;

import interfaces.IDrink;
import interfaces.IUrinate;

import java.util.Random;

public class Human implements IUrinate, IDrink {
    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    public int random(int aux){

        Random ran = new Random();

        int val = ran.nextInt()%aux;

        if (val<0)
        {
            val = val* (-1);
        }
        if (val == 0){
            val++;
        }
        return val;
    }

    @Override
    public int drink() {
        return 0;
    }

    @Override
    public int urinate(int aux) {
        return 0;
    }
}

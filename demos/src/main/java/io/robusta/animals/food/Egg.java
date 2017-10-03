package io.robusta.animals.food;

import io.robusta.HasPrice;

public class Egg implements Ingredient{

    int nutriment =  5;
    int price = 3;

    @Override
    public int getNutriment() {
        return nutriment;
    }
    public int getPrice() {
        return price;
    }
}

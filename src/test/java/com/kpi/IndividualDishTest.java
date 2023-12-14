package com.kpi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Vector;

public class IndividualDishTest {
    @Test
    void testCalcPriceOne() {
        Ingredient ingredient1 = new Ingredient("ingredient 1", 60, 5.2f, 5.2f, 5.2f, 60, 60);
        Vector<Ingredient> ingredients = new Vector<>();
        ingredients.add(ingredient1);

        IndividualDish individualDish = new IndividualDish(ingredients);
        Integer resPrice = individualDish.calcPrice();

        Assertions.assertEquals(ingredient1.getPrice(), resPrice);
    }

    @Test
    void testCalcPriceTwo() {
        Ingredient ingredient1 = new Ingredient("ingredient 1", 60, 5.2f, 5.2f, 5.2f, 60, 60);
        Ingredient ingredient2 = new Ingredient("ingredient 2", 50, 15.5f, 0.0f, 0.5f, 50, 80);
        Vector<Ingredient> ingredients = new Vector<>();
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);

        IndividualDish individualDish = new IndividualDish(ingredients);
        Integer resPrice = individualDish.calcPrice();

        Assertions.assertEquals(ingredient1.getPrice() + ingredient2.getPrice(), resPrice);
    }

    @Test
    void testCalcPrice() {
        Ingredient ingredient1 = new Ingredient("ingredient 1", 60, 5.2f, 5.2f, 5.2f, 60, 60);
        Ingredient ingredient2 = new Ingredient("ingredient 2", 50, 15.5f, 0.0f, 0.5f, 50, 80);
        Ingredient ingredient3 = new Ingredient("ingredient 3", 100, 8.5f, 6.7f, 25.5f, 100, 0);
        Ingredient ingredient4 = new Ingredient("ingredient 4", 80, 15.5f, 7.3f, 8.5f, 66, 155);
        Ingredient ingredient5 = new Ingredient("ingredient 5", 30, 20.1f, 10.0f, 12.3f, 59, 63);
        Vector<Ingredient> ingredients = new Vector<>();
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        ingredients.add(ingredient3);
        ingredients.add(ingredient4);
        ingredients.add(ingredient5);

        IndividualDish individualDish = new IndividualDish(ingredients);
        Integer resPrice = individualDish.calcPrice();
        Integer expPrice = 0;
        for (Ingredient ingredient : ingredients)
            expPrice += ingredient.getPrice();

        Assertions.assertEquals(expPrice, resPrice);
    }
}

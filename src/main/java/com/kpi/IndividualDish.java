package com.kpi;

import java.util.Vector;

/**
 * An Individual Dish object.
 *
 * An Individual Dish object extends {@link Item}, so contains the general parameters and
 * methods of a product item in food ordering Information System. These parameters are name,
 * weight, proteins, fats, carbs, calories and price.
 * In addition, as an individual dish, it has a list of {@link Ingredient}s, which
 * represented as a vector of {@link Ingredient}s that consumer choose.
 *
 * See also: {@link Item}
 *
 * @author nemivika
 * @version 1.0.0 Dec 13, 2023
 */
public class IndividualDish extends Item {
    /** The vector of {@link Ingredient}s of which consists the dish */
    private Vector<Ingredient> ingredients;

    /**
     * Constructs an individual dish with the specified initial vector
     * of {@link Ingredient}s of which consists the dish.
     *
     * Constructor sets default name as "Individual dish" and calculates
     * values of parameters - weight, proteins, fats, carbs, calories and price
     * based on gotten vector of ingredients.
     *
     * @param ingredients   vector of {@link Ingredient}s of which consists the dish.
     */
    public IndividualDish( Vector<Ingredient> ingredients) {
        super();
        this.setName("Individual dish");
        this.ingredients = ingredients;

        for (Ingredient ingredient : ingredients) {
            this.weight += ingredient.getWeight();
            this.proteins += ingredient.getProteins();
            this.fats += ingredient.getFats();
            this.carbs += ingredient.getCarbs();
            this.calories += ingredient.getCalories();
            this.price += ingredient.getPrice();
        }

        this.weight -= this.weight / 5; // weight - 5%
    }

    public Integer calcPrice() {
        Integer resPrice = 0;
        for (Ingredient ingredient : ingredients)
            resPrice += ingredient.getPrice();

        return resPrice;
    }

    /**
     * Returns the vector of {@link Ingredient}s of which consists the dish.
     * @return the vector of {@link Ingredient}s of which consists the dish.
     */
    public Vector<Ingredient> getIngredients() {
        return this.ingredients;
    }

    /**
     * Sets the vector {@link Ingredient}s of which consists this dish to be the specified vector.
     * The previous vector of {@link Ingredient}s is discarded.
     *
     * @param ingredients   what the vector of {@link Ingredient}s is to be set to
     */
    public void setIngredients(Vector<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}

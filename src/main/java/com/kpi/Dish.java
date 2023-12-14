package com.kpi;

/**
 * A Dish object.
 *
 * A Dish object extends {@link Item}, so contains the general parameters and
 * methods of a product item in food ordering Information System. These parameters are name,
 * weight, proteins, fats, carbs, calories and price.
 * In addition, as a dish, it has a list of ingredients, which represented as string.
 *
 * See also: {@link Item}
 *
 * @author nemivika
 * @version 1.0.0 Dec 13, 2023
 */
public class Dish extends Item{
    /** The <strong>ingredients</strong> of which consists the dish. */
    private String ingredients;

    /**
     * Constructs a Dish with the specified initial parameters
     * name, ingredients, weight, proteins, fats, carbs, calories and price.
     *
     * @param name          the <strong>name</strong> of this ingredient
     * @param ingredients   the <strong>ingredients</strong> of which consists the dish
     * @param weight        the <strong>weight</strong> of this ingredient
     * @param proteins      the amount of <strong>proteins</strong> per <strong>weight</strong> in this ingredient
     * @param fats          the amount of <strong>fats</strong> per <strong>weight</strong> in this ingredient
     * @param carbs         the amount of <strong>carbohydrates</strong> per <strong>weight</strong> in this ingredient
     * @param calories      the amount of <strong>calories</strong> per <strong>weight</strong> in this ingredient
     * @param price         the <strong>price</strong> of this ingredient
     */
    public Dish(String name, String ingredients, Integer weight, Float proteins,
                Float fats, Float carbs, Integer calories, Integer price) {
        super(name, weight, proteins, fats, carbs, calories, price);
        this.ingredients = ingredients;
    }

    /**
     * Returns ingredients of which consists the dish.
     * @return ingredients of which consists the dish.
     */
    public String getIngredients() {
        return this.ingredients;
    }

    /**
     * Sets ingredients of which consists this dish to be the specified ingredients.
     * The previous ingredients is discarded.
     *
     * @param ingredients   what ingredients is to be set to
     */
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
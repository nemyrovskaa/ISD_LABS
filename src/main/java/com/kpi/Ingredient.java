package com.kpi;

/**
 * An Ingredient object.
 *
 * An Ingredient object extends {@link Item}, so contains the general parameters and
 * methods of a product item in food ordering Information System. These parameters are name,
 * weight, proteins, fats, carbs, calories and price.
 *
 * See also: {@link Item}
 *
 * @author nemivika
 * @version 1.0.0 Dec 13, 2023
 */
public class Ingredient extends Item {
    /**
     * Constructs an Ingredient with the specified initial parameters
     * name, weight, proteins, fats, carbs, calories and price.
     *
     * @param name      the <strong>name</strong> of this ingredient
     * @param weight    the <strong>weight</strong> of this ingredient
     * @param proteins  the amount of <strong>proteins</strong> per <strong>weight</strong> in this ingredient
     * @param fats      the amount of <strong>fats</strong> per <strong>weight</strong> in this ingredient
     * @param carbs     the amount of <strong>carbohydrates</strong> per <strong>weight</strong> in this ingredient
     * @param calories  the amount of <strong>calories</strong> per <strong>weight</strong> in this ingredient
     * @param price     the <strong>price</strong> of this ingredient
     */
    Ingredient(String name, Integer weight, Float proteins, Float fats,
               Float carbs, Integer calories, Integer price) {
        super(name, weight, proteins, fats, carbs, calories, price);
    }
}

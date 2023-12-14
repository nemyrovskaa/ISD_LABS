package com.kpi;

/**
 * An Item object.
 *
 * An Item object contains the general parameters of a product item
 * in food ordering Information System. These parameters are name,
 * weight, proteins, fats, carbs, calories and price.
 *
 * @author nemivika
 * @version 1.0.0 Dec 13, 2023
 */
public class Item {
    /** The <strong>name</strong> of this item. */
    protected String name;

    /** The <strong>weight</strong> of this item. Measured in grams. */
    protected Integer weight;

    /** The amount of <strong>proteins</strong> per <strong>weight</strong> in this item. Measured in grams. */
    protected Float proteins;

    /** The amount of <strong>fats</strong> per <strong>weight</strong> in this item. Measured in grams. */
    protected Float fats;

    /** The amount of <strong>carbohydrates</strong> per <strong>weight</strong> in this item. Measured in grams. */
    protected Float carbs;

    /** The amount of <strong>calories</strong> per <strong>weight</strong> in this item. Measured in kcal. */
    protected Integer calories;

    /** The <strong>price</strong> of this item. Measured in uah. */
    protected Integer price;

    /**
     * Constructs a default Item. Name initialized as an empty string.
     * Weight, proteins, fats, carbs, calories and price - as zero.
     */
    public Item() {
        this.name = "";
        this.weight = 0;
        this.proteins = 0.0f;
        this.fats = 0.0f;
        this.carbs = 0.0f;
        this.calories = 0;
        this.price = 0;
    }

    /**
     * Constructs an Item with the specified initial parameters
     * name, weight, proteins, fats, carbs, calories and price.
     *
     * @param name      the <strong>name</strong> of this item
     * @param weight    the <strong>weight</strong> of this item (grams)
     * @param proteins  the amount of <strong>proteins</strong> per <strong>weight</strong> in this item (grams)
     * @param fats      the amount of <strong>fats</strong> per <strong>weight</strong> in this item (grams)
     * @param carbs     the amount of <strong>carbohydrates</strong> per <strong>weight</strong> in this item (grams)
     * @param calories  the amount of <strong>calories</strong> per <strong>weight</strong> in this item (kcal)
     * @param price     the <strong>price</strong> of this item (uah)
     */
    public Item(String name, Integer weight, Float proteins, Float fats,
                Float carbs, Integer calories, Integer price) {
        this.name = name;
        this.weight = weight;
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
        this.calories = calories;
        this.price = price;
    }

    /**
     * Returns the name of this Item.
     * @return the name of this Item.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the weight of this Item.
     * @return the weight of this Item.
     */
    public Integer getWeight() {
        return this.weight;
    }

    /**
     * Returns the amount of proteins in this Item.
     * @return the amount of proteins in this Item.
     */
    public Float getProteins() {
        return this.proteins;
    }

    /**
     * Returns the amount of fats in this Item.
     * @return the amount of fats in this Item.
     */
    public Float getFats() {
        return this.fats;
    }

    /**
     * Returns the amount of carbohydrates in this Item.
     * @return the amount of carbohydrates in this Item.
     */
    public Float getCarbs() {
        return this.carbs;
    }

    /**
     * Returns the amount of calories in this Item.
     * @return the amount of calories in this Item.
     */
    public Integer getCalories() {
        return this.calories;
    }

    /**
     * Returns the price of this Item.
     * @return the price of this Item.
     */
    public Integer getPrice() {
        return this.price;
    }

    /**
     * Sets the name of this Item to be the specified name.
     * The previous name is discarded.
     *
     * @param name what the name is to be set to
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the weight of this Item to be the specified weight.
     * The previous weight is discarded.
     *
     * @param weight what the weight is to be set to
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * Sets the amount of proteins in this Item to be the specified amount of proteins.
     * The previous amount of proteins is discarded.
     *
     * @param proteins what the amount of proteins is to be set to
     */
    public void setProteins(Float proteins) {
        this.proteins = proteins;
    }

    /**
     * Sets the amount of fats in this Item to be the specified amount of fats.
     * The previous amount of fats is discarded.
     *
     * @param fats what the amount of fats is to be set to
     */
    public void setFats(Float fats) {
        this.fats = fats;
    }

    /**
     * Sets the amount of carbohydrates in this Item to be the specified amount of carbohydrates.
     * The previous amount of carbohydrates is discarded.
     *
     * @param carbs what the amount of carbohydrates is to be set to
     */
    public void setCarbs(Float carbs) {
        this.carbs = carbs;
    }

    /**
     * Sets the amount of calories in this Item to be the specified amount of calories.
     * The previous amount of calories is discarded.
     *
     * @param calories what the amount of calories is to be set to
     */
    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    /**
     * Sets the price of this Item to be the specified price.
     * The previous price is discarded.
     *
     * @param price what the price is to be set to
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}

package Task_02_WildFarm.Animals;

import Task_02_WildFarm.Interfaces.SoundProducible;
import Task_02_WildFarm.Foods.Food;
import Task_02_WildFarm.Interfaces.Edible;

/**
 * Created by ivano on 2/19/2017.
 */
public abstract class Animal implements SoundProducible, Edible {
    private String name;
    private String type;
    private Double weight;
    private Integer eaten;

    protected Animal(String name, String type, Double weight) {
        this.setName(name);
        this.setType(type);
        this.setWeight(weight);
        this.eaten = 0;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setType(String type) {
        this.type = type;
    }

    private void setWeight(Double weight) {
        this.weight = weight;
    }

    protected String getName() {
        return name;
    }

    protected String getType() {
        return type;
    }

    protected Double getWeight() {
        return weight;
    }

    protected Integer getEaten() {
        return eaten;
    }

    @Override
    public void produceSound() {

    }

    @Override
    public void eatFood(Food food) {
        this.eaten += food.getQuantity();
    }
}

package Task_02_WildFarm.Animals;

import Task_02_WildFarm.Foods.Food;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by ivano on 2/19/2017.
 */
public class Mouse extends Mammal {
    private List<String> edibleFood;

    public Mouse(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
        this.initializeEdibleFood();
    }

    @Override
    public void produceSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eatFood(Food food) {
        if (this.edibleFood.contains(food.toString())){
            super.eatFood(food);
        } else {
            System.out.println("Mouses are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        df.setMaximumFractionDigits(340);
        return String.format("Mouse[%s, %s, %s, %d]",
                super.getName(),
                df.format(super.getWeight()),
                super.getLivingRegion(), super.getEaten());
    }

    private void initializeEdibleFood(){
        this.edibleFood = new ArrayList<>();
        this.edibleFood.add("Vegetable");
    }
}

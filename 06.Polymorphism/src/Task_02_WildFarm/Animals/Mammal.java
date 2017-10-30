package Task_02_WildFarm.Animals;

/**
 * Created by ivano on 2/19/2017.
 */
public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight);
        this.setLivingRegion(livingRegion);
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }
}

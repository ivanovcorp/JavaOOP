package Task_08_ShapesVolume;

/**
 * Created by ivano on 2/12/2017.
 */
public class TriangularPrism {
    private Double baseSide;
    private Double heightFromBaseSide;
    private Double lenght;

    public TriangularPrism(Double baseSide, Double heightFromBaseSide, Double lenght) {
        this.baseSide = baseSide;
        this.heightFromBaseSide = heightFromBaseSide;
        this.lenght = lenght;
    }

    public Double getBaseSide() {
        return this.baseSide;
    }

    public Double getHeightFromBaseSide() {
        return this.heightFromBaseSide;
    }

    public Double getLenght() {
        return this.lenght;
    }
}

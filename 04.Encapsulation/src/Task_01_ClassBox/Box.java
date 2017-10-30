package Task_01_ClassBox;

/**
 * Created by ivano on 2/13/2017.
 */
public class Box {
    private Double lenght;
    private Double width;
    private Double height;


    public Box(Double lenght, Double width, Double height) {
        this.setLenght(lenght);
        this.setWidth(width);
        this.setHeight(height);
    }


    public void setLenght(Double lenght) {
        if (lenght <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        } else {
            this.lenght = lenght;
        }

    }

    public void setHeight(Double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        } else {
            this.height = height;
        }

    }

    public void setWidth(Double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        } else {
            this.width = width;
        }

    }

    public void getSurfaceArea() {
        Double result = (2 * lenght * width) + (2 * lenght * height) + (2 * width * height);
        System.out.printf("Surface Area - %.2f%n", result);
    }

    public void getLateralSurfaceArea() {
        Double result = (2 * lenght * height) + (2 * width * height);
        System.out.printf("Lateral Surface Area - %.2f%n", result);
    }

    public void getVolume() {
        Double result = width * lenght * height;
        System.out.printf("Volume - %.2f%n", result);
    }
}

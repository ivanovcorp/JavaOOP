package Task_01_ClassBox;

/**
 * Created by ivano on 2/13/2017.
 */
public class Main {

    public static void main(String[] args) {
        /*Class boxClass = Box.class;
        Field[] fields = boxClass.getDeclaredFields();
        System.out.println(Arrays.asList(fields)
                .stream()
                .filter(f -> Modifier.isPrivate(f.getModifiers())).count());*/
        Box box = null;
        try {
            box = new Box(1.3, -1.0, 6.0);
            box.getSurfaceArea();
            box.getLateralSurfaceArea();
            box.getVolume();
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }



    }
}

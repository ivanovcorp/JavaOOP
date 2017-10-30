package Task_03_ManKind;

/**
 * Created by ivano on 2/13/2017.
 */
public class Main {

    public static void main(String[] args) {
        Student st = new Student("Ivan", "Ivanov", 5);
        System.out.println(st.toString());

        Worker wk = new Worker("Ivan", "Petrov", 1590.0, 10.0);
        System.out.println(wk.toString());
    }
}

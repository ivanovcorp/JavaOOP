package Task_03_LastDigitName;

import java.util.Scanner;

/**
 * Created by ivano on 2/12/2017.
 */
class Number {
    private Integer num;

    public Number(Integer num) {
        this.num = num;
    }

    String getEnglishName() {
        String name = "";
        int lastDigit = this.num % 10;

        switch (lastDigit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return"seven";
            case 8:
                return "eight";
            case 9:
                return "nine";

        }

        return name;
    }
}

public class Task_03_LastDigitName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = Integer.parseInt(sc.nextLine());
        Number num = new Number(n);
        System.out.println(num.getEnglishName());
    }
}

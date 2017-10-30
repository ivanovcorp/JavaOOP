package Task_04_NumberInReversedOrder;

import java.util.Scanner;

/**
 * Created by ivano on 2/12/2017.
 */
class DecimalNumber{
    String number;

    public DecimalNumber(String number) {
        this.number = number;
    }

    StringBuilder reversedDecimal(){
        StringBuilder reversed = new StringBuilder("");

        for (int i = number.length() - 1; i >= 0; i--) {
            reversed.append(number.charAt(i));
        }
        return reversed;
    }
}

public class Task_04_NumberInReversedOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        DecimalNumber a = new DecimalNumber(input);

        System.out.println(a.reversedDecimal());
    }
}

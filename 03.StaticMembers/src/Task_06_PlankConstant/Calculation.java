package Task_06_PlankConstant;

import static java.lang.Math.exp;

/**
 * Created by ivano on 2/12/2017.
 */
public class Calculation {
    private static double planckConstant =  exp(6.62606896e-34);
    private static double mathPi = 3.14159;

    public static void getReducedPlanckConstant() {
        double result = planckConstant / (2 * mathPi);
        System.out.println(result);
    }
}

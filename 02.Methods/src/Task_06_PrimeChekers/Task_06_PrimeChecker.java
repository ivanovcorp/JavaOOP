package Task_06_PrimeChekers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ivano on 2/12/2017.
 */
class Number{
    Integer number;
    boolean isPrime;

    Number(Integer number){
        this.number =  number;
        this.isPrime = isPrime(number);
    }

    boolean isPrime(int num) {
        if (num == 2 || num == 1 || num == 0) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    int nextPrime(){
        int currNumber = this.number;
        while (true){
            currNumber++;
            if (isPrime(currNumber)){
                return currNumber;
            }
        }
    }
}

public class Task_06_PrimeChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(sc.readLine());

        Number num = new Number(number);

        System.out.printf("%d, %s", num.nextPrime(), num.isPrime);
    }

}

package BigInteger_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(1235235342L);
        BigDecimal bd2 = BigDecimal.TEN;
        System.out.println(bd1);
        bd1.add(bd2);
        int i = bd1.compareTo(bd2);
        if(i == 0){
            System.out.println("bd1 = bd2");
        } else if (i > 0) {
            System.out.println("bd1 > bd2");
        }else {
            System.out.println("bd1 <  bd2");
        }
        BigDecimal bigDecimal1 = new BigDecimal(12523.342946234562345).setScale(3, RoundingMode.HALF_UP);
        BigDecimal bigDecimal2 = new BigDecimal(142.5400);
        BigDecimal bigDecimal3 = BigDecimal.valueOf(142.5400);
//        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2.equals(bigDecimal3));
    }
}

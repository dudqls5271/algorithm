package nexon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> sampleMoney = List.of(2, 4, 4, 4, 8);
        minCost(sampleMoney);

    }
    public static int minCost(List<Integer> money) {
        int maxCount = 0;
        int mostFrequentNumber = -1;

        for (int num : money) {
            int count = Collections.frequency(money, num);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentNumber = num;
            }
        }

        System.out.println(mostFrequentNumber);

        int cost = 0;

        for (int i = 0; i < money.size(); i++) {
            if(money.get(i) != mostFrequentNumber) {
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(money.get(i));
                integers.add(money.get(i)+1);
                integers.add(money.get(i)*2);
                System.out.println(integers.get(integers.size()/2));
            }
        }

        return 1;
    }

}

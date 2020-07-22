package Coding_Practice;

import java.util.ArrayList;
import java.util.List;

public class Max {

    public static void main (String []args){
        List<Integer> prices = new ArrayList<Integer>();

        prices.add(3);
        prices.add(4);
        prices.add(5);
        prices.add(3);
        prices.add(5);
        prices.add(2);

        long totalProfit = 0;
        long maximLocal = prices.get(prices.size() - 1);
        long stocksHeld = 0;
        long expenseSoFar = 0;
        for(int i = prices.size() - 2; i >= 0; i--){
            long current = prices.get(i);
            if(current >= maximLocal){
                totalProfit += stocksHeld*maximLocal - expenseSoFar;
                stocksHeld = 0;
                expenseSoFar = 0;
                maximLocal = current;
            }else{
                stocksHeld++;
                expenseSoFar += prices.get(i);
            }
        }
        if(stocksHeld > 0){
            totalProfit += stocksHeld*maximLocal - expenseSoFar;
        }
        System.out.println(totalProfit);
    }
}

package comm.framework;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class MonthValue {

    public static Integer monthValue(String monthName) {
         Map<String, Integer> monthValue = new HashMap<String, Integer>();
         monthValue.put("January",1);
        monthValue.put("February",2);
        monthValue.put("March",3);
        monthValue.put("April",4);
        monthValue.put("May",5);
        monthValue.put("June",6);
        monthValue.put("July",7);
        monthValue.put("August",8);
        monthValue.put("September",9);
        monthValue.put("October",10);
        monthValue.put("November",11);
        monthValue.put("December",12);
        return monthValue.get(monthName);
    }
    public static String monthValue(Integer monthCount) {
        Map<Integer, String> monthValue = new HashMap<Integer, String>();
        monthValue.put(1,"January");
        monthValue.put(2,"February");
        monthValue.put(3,"March");
        monthValue.put(4,"April");
        monthValue.put(5,"May");
        monthValue.put(6,"June");
        monthValue.put(7,"July");
        monthValue.put(8,"August");
        monthValue.put(9,"September");
        monthValue.put(10,"October");
        monthValue.put(11,"November");
        monthValue.put(12,"December");
        return monthValue.get(monthCount);
    }
}

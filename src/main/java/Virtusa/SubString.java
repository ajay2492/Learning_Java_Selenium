package Virtusa;

import java.util.HashMap;

public class SubString {
    static String s1 = "hello";
    static String s2 = "World";


    public static void main(String []args){
        char[] inputs1 = s1.toCharArray();
        char[] inputs2 = s2.toCharArray();
        Boolean result = false;

        HashMap<Character, Integer> inputMap = new HashMap<Character, Integer>();

        for(Character input : inputs1){
            if(inputMap.get(input) != null){
                inputMap.put(input,inputMap.get(input)+1);
            }else
            {
                inputMap.put(input,1);
            }
        }
        for(Character input : inputs2){
            if (inputMap.get(input) != null){
                result = true;
                break;

            }
        }
        System.out.println(result);
    }
}

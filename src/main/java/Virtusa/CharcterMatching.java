package Virtusa;

public class CharcterMatching {
    static String input = "AABAAB";

    public static void main(String []args){
        int tempResult = 0;
        char input1 = input.charAt(0);

        for(int i = 1;i<input.length();i++){
            if(input1 == input.charAt(i)){
                tempResult += 1;
                input1 = input.charAt(i);
            }
            else
            {
                input1 = input.charAt(i);
            }
        }
        System.out.println(tempResult);
    }
}

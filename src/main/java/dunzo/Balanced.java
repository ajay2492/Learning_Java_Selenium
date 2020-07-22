/*
* Consider a string consisting of the characters< and > only. The string is balanced if each < always appears before
* (i.e., to the left of) a corresponding > character (they do not need to be adjacent). Moreover, each < and > act as
* a unique pair of symbols and neither symbol can be considered as part of any other pair of symbols.
* To balance a string, any > character can be replace with <>. Given an expression and a maximum number of replacements,
* determine whether the string can be balanced.
* Example = ['<<>>','<>','<><>','>>','<<>','><><']
* maxReplacements = [0,1,2,2,2,2]
* Process a series of expressions and their corresponding maxReplacements. Each of the first three expression is
* balanced already. The String expression[3] = '>>' can be balanced in two moves by replacing each > with a <> to make
* <><>. Neither of the last two strings can ever be balanced.
*Function Description -
* Compete the function balancedOrNot in the editor below.
*
*
* */
package dunzo;

public class Balanced {
    public static int[] Balanced(String[] input1, int[] input2) {
        int[] resultArray = new int[input1.length];
        int dummpingValue = 0, resluValueInsert = 1;
        for (int x = 0; x < input1.length; x++) {
            for (int i = 0; i < input1[x].length(); i++) {
                if (i % 2 == 0) {
                    if (input1[x].charAt(i) != '<') {
                        dummpingValue++;
                        if (dummpingValue > input2[x]) {
                            resluValueInsert = 0;
                            break;
                        }
                    }
                } else {
                    if (input1[x].charAt(i) != '>') {
                        dummpingValue++;
                        if (dummpingValue > input2[x]) {
                            resluValueInsert = 0;
                            break;
                        }
                    }
                }
            }
            resultArray[x] = resluValueInsert;
        }
       return resultArray;
    }
    public static void main(String []args){
        String[] inputString ={"<>","<>><"};
        int[] maxReplacement= {1,0};

        int[] reslut = Balanced(inputString,maxReplacement);

        for(int reslutValue : reslut){
            System.out.println(reslutValue);
        }

    }

}

package Strobogrammatic;

import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0, flag = 0;
        char[] arr = ("" + num).toCharArray();
        int len = arr.length;
        for (i = 0; i <= (len / 2); i++) {
            if ((((arr[i] == '6') && (arr[len - 1 - i] == '9')) || ((arr[i] == '9') && (arr[len - 1 - i] == '6')))
                    || ((arr[i] == arr[len - 1 - i]) && ((arr[i] == '0') || (arr[i] == '8') || (arr[i] == '1')))) {
                        continue;
            } 
            else{
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Number is strobogrammatic");
        } 
        else {
            System.out.println("Number is not strobogrammatic");
        }
    }
}

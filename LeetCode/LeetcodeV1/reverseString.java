package LeetcodeV1;

import java.util.Arrays;
import java.util.Scanner;


public class reverseString {
    public static void main(String[] args) {
        Scanner kbr= new Scanner(System.in);
        System.out.print("Enter a name: ");
        String x=kbr.nextLine();
        char[] reversed= new char[x.length()];
        for(int i=0, j=reversed.length-1; i<= reversed.length-1; i++, j--){
            reversed[i]= x.charAt(j);
        }
        System.out.println(Arrays.toString(reversed));
    }

}

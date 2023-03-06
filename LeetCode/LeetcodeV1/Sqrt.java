package LeetcodeV1;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner kbr= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= kbr.nextInt();

        System.out.println(mySqrt(num));

    }

    public static int mySqrt(int x) {
        long r=x;
        while(r*r > x){
            r = (r + x/r) / 2;
        }

        return (int) r;
    }
}

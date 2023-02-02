package Blind75;

public class Lt371 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println(getSum(a, b));
    }
    //Bit manipulation
    public static int getSum(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;

        while(b!=0){
            int carry= a&b; // same as 1 (0001) && 2(0010) = (0000)
            a=a^b; //a= a XOR b => (0001) XOR (0010) = 0011 =3 in decimal
            b=carry << 1; //b= 
        }

        return a;
    }
}

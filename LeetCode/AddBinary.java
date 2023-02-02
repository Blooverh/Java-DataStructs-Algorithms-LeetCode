import java.util.Stack;

/*
 * Given two binary strings a and b, return their sum as a binary string.
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary{

    public static void main(String[] args) {
        String a="1010";
        String b= "1011";
        String c="11";
        String d= "1";
        System.out.println(addBinary(a, b));
        System.out.println(addBinary(c, d));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while(i>=0 || j>=0){
            int n1 = i<0 ? 0 : Character.getNumericValue(a.charAt(i--));
            int n2 = j<0 ? 0 : Character.getNumericValue(b.charAt(j--));
            int r = c+n1+n2;
            sb.append(r%2);
            c=r/2;
        }
        if(c!=0){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}


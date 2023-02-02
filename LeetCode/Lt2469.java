import java.util.Arrays;
import java.util.Scanner;

public class Lt2469 {
    public static void main(String[] args) {
        Scanner kbr= new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        double celsius= kbr.nextDouble();
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }

    public static double[] convertTemperature(double celsius) {
        double[] temp= new double[2];
        for(int i=0; i< temp.length; i++){
            if(i==0){
                temp[i]= celsius + 273.15;
            }else if(i ==1){
                temp[i]= celsius *1.80 + 32;
                
            }
        }

        return temp;
    }
}

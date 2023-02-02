package DataAndAlgoL.Chpt2RecursionAndBackTracking;

import java.util.Scanner;

/*Tower's of Hanoi*/
public class Problem1 {
    public static void main(String[] args) {
        Scanner kbr= new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n= kbr.nextInt();
        towersOfHanoi(n, 'A', 'B', 'C');

    }

    public static void towersOfHanoi(int n, char source, char dest, char auxiliar){
        //if only 1 disk, make the move and return
        if( n==1){
            System.out.println("Move disk 1 from "+ source +" to "+ dest);
            return;
        }

        /*Move top n-1 disks from A to B using C as Auxiliar*/
        towersOfHanoi(n-1, source, auxiliar, dest);

        //Move remaining disks from A to C
        System.out.println("Move disk from tower "+ source+ " to "+ dest);

        //Move n-1 disks from B to C using A as auxiliar 
        towersOfHanoi(n-1, auxiliar, dest, source);
    }


}

package LeetcodeV1;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KclosestPointsToOrigin_Lt973 {
    public static void main(String[] args) {
        
    }

    public static int[][] kClosest(int[][] points, int k) {
        // If the k points close to origin are all the points in the array, return the array
        if (k == points.length){
            return points;
        }

        // priority queue holds each point as max heap, thus sorted by the distance from origin in descending order
        PriorityQueue<int[]> pq= new PriorityQueue<>(k, new Comparator<int[]>() {
            // Comparator is used to compare two points and return the one that is closer to the origin
            // compares which points ? -> compares the distance from origin of each point
            @Override
            public int compare(int[] a, int[] b){
                return (b[0] *b[0] +b[1]*b[1]) - (a[0] *a[0] + a[1]* a[1]); // b-a because we want max heap
            }
        });

        for(int[] point: points){
            pq.add(point);
            if(pq.size() > k){ // When size of PQ is > than k we poll remove first element (root) as it is the furthest from the origin
                pq.poll();
            }

        }

        return pq.toArray(new int[0][0]);
    }
}

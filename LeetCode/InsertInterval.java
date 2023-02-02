import java.util.LinkedList;
/*
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and 
 *      the end of the ith interval and intervals is sorted in ascending order by starti. 
 * You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 *      Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals 
 *      still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * Return intervals after the insertion.
 */
public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals= {{1,3},{6,9}};
        int[] newInterval={2,5};
        System.out.println(insert(intervals, newInterval));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> result= new LinkedList<>(); //list of array of integers

        int i=0;

        //add all intervals ending before newInterval starts
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            result.add(intervals[i]);
            i++;
        }

        //merge all overlapping intervals to one considering newInterval
        while(i< intervals.length && intervals[i][0] <= newInterval[1]){
            //we could mutate interval here also
            newInterval[0]= Math.min(newInterval[0], intervals[i][0]);
            newInterval[1]= Math.min(newInterval[1], intervals[i][1]);
            i++;
        }

        //add the union of intervals we got
        result.add(newInterval);

        //add the rest of the intervals
        while(i < intervals.length){
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);

    }


}

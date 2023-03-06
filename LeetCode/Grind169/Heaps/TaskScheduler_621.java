package Grind169.Heaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

/*
Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task.
Tasks could be done in any order. Each task is done in one unit of time. 
For each unit of time, the CPU could complete either one task or just be idle.
However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), 
    that is that there must be at least n units of time between any two same tasks.
Return the least number of units of times that the CPU will take to finish all the given tasks.

Example 1:

Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: 
A -> B -> idle -> A -> B -> idle -> A -> B
There is at least 2 units of time between any two same tasks.
 */

public class TaskScheduler_621 {
    public static void main(String[] args) {
        char[] tasks= {'A','A','A','B','B','B'};
        int n=2;

        System.out.println(leastInterval(tasks, n));
    }

    public static int leastInterval(char[] tasks, int n) {
        //if there is no cooldown time between same tasks, units of time are the amount of tasks
        if( n==0){
            return tasks.length;
        }

        //To store the occurrences of each task 
        HashMap<Character, Integer> map= new HashMap<>();

        for(int i=0; i< tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1); // if tasks are equal increase value, default value for each task that has no occurrence
        }

        //by default pq is a Min heap; hence the reverse order 
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

        //add all the frequency values into pq 
        pq.addAll(map.values());

        //find the max frequency
        int maxFreq= pq.poll(); // polls highest frequency by priority 

        //total idle time is the maxFrequency of a task * time units n of cooldown 
        int totalIdleTime=(maxFreq-1) * n;

        //Looping through all the frequencies 
        while(!pq.isEmpty()){
            //find current frequency
            int currentFreq= pq.poll();

            //if it is equal to max frequency then we need to add 1 since we to consider last task
            //Example A -> B -> Idle -> A -> B -> Idle -> A -> B (this B has to be considered)
            if(maxFreq == currentFreq){
                totalIdleTime-=currentFreq;
                totalIdleTime+=1;
            }else{
                //else we just keep subtracting idle time
                totalIdleTime-=currentFreq;
            }
        }

        //if its greater than 0 then add it to tasks.length 
        if(totalIdleTime >0){
            return totalIdleTime + tasks.length;
        }else{
            return tasks.length;
        }

    }
}

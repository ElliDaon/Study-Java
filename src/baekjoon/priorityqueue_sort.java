package baekjoon;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityqueue_sort {

	public static void main(String[] args) throws IOException {
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		int answer = 0;
		//Integer a[] = Arrays.stream(A).boxed().toArray(Integer[]::new); 
        PriorityQueue<Integer> queue_a = new PriorityQueue<>();
        
        //Integer b[] = Arrays.stream(B).boxed().toArray(Integer[]::new); 
        PriorityQueue<Integer> queue_b = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<A.length; i++) {
        	queue_a.add(A[i]);
        	queue_b.add(B[i]);
        }
        for(int i=0; i<A.length; i++){
            answer += queue_a.poll()*queue_b.poll();
        }
		System.out.println(answer);
	}
}

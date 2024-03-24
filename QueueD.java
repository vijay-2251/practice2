import java.io.*;
import java.util.*;

class QueueD{
public static void main(String args[]){
	Queue<Integer> q = new LinkedList<>();
	q.add(10);
	q.add(20);
	q.add(30);
	q.add(40);
	System.out.println("Elements present in the Queue are:"+ q);
	q.remove(30);
	System.out.println("Elements present in the Queue are:"+ q);
	System.out.println("Front Elements present in the Queue is:"+ q.peek());
	}
}
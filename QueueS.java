import java.io.*;
import java.util.*;

class QueueD{
public static void main(String args[]){
	Queue<String> q = new LinkedList<>();
	q.add("Hi");
	q.add("Hello");
	q.add("Anil");
	q.add("Deepak");
	System.out.println("Elements present in the Queue are:"+ q);
	q.remove("Hi");
	System.out.println("Elements present in the Queue are:"+ q);
	System.out.println("Front Elements present in the Queue is:"+ q.peek());
	}
}
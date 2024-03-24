import java.io.*;
import java.util.*;

public class StackD{
	public static void main(String args[]){
		Stack<String> st= new Stack<String>();
		st.push("Vijay");
		st.push("Sai");
		st.push("Pavan");
		System.out.println("Elements in the stack;"+st);
		st.pop();
		System.out.println(st.peek());
		System.out.println(st);
	}
}
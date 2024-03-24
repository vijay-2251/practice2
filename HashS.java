import java.io.*;
import java.util.*;

class HashS{
public static void main(String[] args){
HashSet<ArrayList> st = new HashSet<>();
ArrayList<Integer> list1 = new ArrayList<>();
list1.add(3);
list1.add(5);
list1.add(7);
list1.add(2);
list1.add(6);
list1.add(3);
st.add(list1);
System.out.println(st);
}
}

/*
import java.io.*;
import java.util.*;

class HashS{
public static void main(String[] args){
HashSet<Integer> st = new HashSet<>();
//ArrayList<Integer> st = new ArrayList<>();
st.add(3);
st.add(5);
st.add(7);
st.add(2);
st.add(6);
st.add(3);
//st.add(st);
System.out.println(st);
}
}*/

/*
import java.io.*;
import java.util.*;

class HashS{
public static void main(String[] args){
HashSet<ArrayList> st = new HashSet<>();
ArrayList<Integer> list1 = new ArrayList<>();
ArrayList<Integer> list2 = new ArrayList<>();
list1.add(3);
list1.add(5);
list1.add(7);
list2.add(2);
list2.add(6);
list2.add(3);
st.add(list1);
st.add(list2);
System.out.println(st);
}
}
*/
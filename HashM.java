import java.io.*;
import java.util.*;

class HashM{
public static void main(String[] args){
HashMap<String, Integer> mp = new HashMap<>();
mp.put("Sai",5);
mp.put("David",10);
mp.put("Varun", 15);
mp.put("Anil",20);
System.out.println("Size of the Hashmap is:"+mp.size());
System.out.println(mp);

if(mp.containskey("Sai")){
Integer a = mp.get("Sai");
System.out.println("value for key"+a);
}
}
}
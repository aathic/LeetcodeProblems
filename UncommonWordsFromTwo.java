package leetcode;
import java.util.*;
public class UncommonWordsFromTwo {
	public static void main(String[] args) {
		String s1="apple apple";
		String s2="bananna";
		System.out.println(Arrays.toString(uncommonFromSentences(s1,s2)));
	}
	 public static String[] uncommonFromSentences(String s1, String s2) {
	       String[]a=s1.split(" ");
	       String[]b=s2.split(" ");
	       List<String> bag1=new ArrayList<>(Arrays.asList(a));
	       List<String> bag3=new ArrayList<>();
	       List<String> bag2=new ArrayList<>(Arrays.asList(b));
	       bag1.retainAll(bag2);
	       for(String s:a) {
	    	   if(!bag1.contains(s)) {
	    		  bag3.add(s); 
	    	   }
	       }
	       for(String s:b) {
	    	   if(!bag1.contains(s)) {
	    		  bag3.add(s); 
	    	   }
	       }
	       String[]res=new String[bag3.size()];
	       for(int i=0;i<res.length;i++) {
	    	   res[i]=bag3.get(i);
	       }
	       return res;
	       
	    }
}

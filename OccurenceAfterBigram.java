package leetcode;

import java.util.Arrays;

public class OccurenceAfterBigram {
	   public static String[] findOcurrences(String text, String first, String second) {
	        String[]a=text.split(" ");
	        int l=0;
	        for(int i=0;i<a.length-1;i++){
	            if(a[i].equals(first) && a[i+1].equals(second)&& i+1!=a.length-1)
	            l++;
	        }
	        String[]res=new String[l];
	         for(int i=0,x=0;i<a.length-2;i++){
	            if(a[i].equals(first) && a[i+1].equals(second)&& i+1!=a.length-1 )
	            res[x++]=a[i+2];
	        }
	        return res;
	    }
	   public static void main(String[] args) {
		String  text = "alice is a good girl she is a good student", first = "a", second = "good";
		String[]a=findOcurrences(text,first,second);
		System.out.println(Arrays.toString(a));
	}
}

package ytcode;
import java.util.*;
public class MaxWindowSubString {
	public static void main(String[] args) {
		int[]a= {1,2,3,-3,4,5,7};//output: [ 3,3,4,5,7 ]
		int[]res=solve(a,3);
		System.out.println(Arrays.toString(res));
	}
	public static int[] solve(int[]a,int k) {
		int[]ans=new int[a.length-k+1];
		ArrayDeque<Integer>de=new ArrayDeque<>();
		for(int i=0,x=0;i<a.length;i++) {
			//maintain the window size
			if(!de.isEmpty() && de.peekFirst()<=i-k) {
				de.poll();
			}
			//remove smaller element from back
			while(!de.isEmpty() && a[de.peekLast()]<a[i]) {
				de.pollLast();
			}
			//store the current index
			de.add(i);
			if(i>=k-1) {
				ans[x++]=a[de.peekFirst()];
			}
		}
		return ans;
	}
}

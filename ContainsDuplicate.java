package ytcode;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[]a= {1,2,3,5,1};
		System.out.println(isDuplicate2(a));
	}
	//Brute force time complexity is O(n^2)
	public static boolean isDuplicate(int[]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					return true;
			}
		}
		return false;
	}
	//2.optimal O(n log n)
	public static boolean isDuplicate1(int[]a) {
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1])
				return true;
		}
		return false;
	}
	//3.optimal is O(n)
	public static boolean isDuplicate2(int[]a) {
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(set.contains(a[i]))
				return true;
			set.add(a[i]);
		}
		return false;
	}
}

package ytcode;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Given a target and find two index {i,j} where a[i]+a[j]==target;
 * */
public class TwoSum {
	public static void main(String[] args) {
		int[]a= {1,2,7,9,10};
		//int[]ans=BF(a,9);
		int[]ans=Op2(a,9);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] BF(int[]a,int target) {//time complexity:O(n^2)
		for(int i=0;i<a.length-1;i++) {
			int find=target-a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==find)
					return new int[] {i,j};
			}
		}
		return new int[] {};
	}
	public static int[] Op(int[]a,int target) {//time complexity: O(n log n)
		Arrays.sort(a);
		int l=0,r=a.length-1;
		while(l<r) {
			int sum=a[l]+a[r];
			if(sum==target)
				return new int[] {l,r};
			else if(sum>target) {
				r--;
			}
			else 
				l++;
		}
		return new int[] {};
	}
	public static int[] Op2(int[]a,int target) {
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int sum=target-a[i];
			if(map.containsKey(sum))
				return new int[] {map.get(sum),i};
			map.put(a[i], i);
		}
		return new int[] {};
	}
}

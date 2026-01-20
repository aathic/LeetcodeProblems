package ytcode;

import java.util.HashSet;

/*
 * given an array nums and integer k return true if ther are two distinct
 * indices i and in the array such that nums[i]==num[j] and abs(i-j)<=k
 * */
public class ContainsDuplicate2 {
	public static void main(String[] args) {
		int[]a= {1,2,3,1,5};
		System.out.println(containsDuplicate1(a,3));
	}
	//Brute Force
	public static boolean containsDuplicate(int[]a,int k) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && j-i<=k)
					return true;
			}
		}
		return false;
	}
	//optimal
	public static boolean containsDuplicate1(int[]a,int k) {
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(set.contains(a[i]))
				return true;
			set.add(a[i]);
			if(set.size()>k)
				set.remove(a[i-k]);
		}
		return false;
	}
}

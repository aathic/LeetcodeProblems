package ytcode;

import java.util.*;
class LongestSubStringWithoutRepeatingCharacter 
{
	public static void main(String[] args) 
	{
		String s="abcabctvm";
		int max=solve(s);
		System.out.println(max);
	}
	public static int solve(String s){
		Set<Character>set=new HashSet<>();
		int left=0,max=0;
		for(int right=0;right<s.length();right++){
			char c=s.charAt(right);
			System.out.println(c);
			while(set.contains(c)){
				set.remove(s.charAt(left));
				left++;
			}
			set.add(c);
			max=Math.max(max,right-left+1);
		}
		return max;
	}
}


package ytcode;

import java.util.HashMap;

public class MinimumSubString {
	public static void main(String[] args) {
		String s="ABAXCBAC";
		String t="ABC";//o/p: BAC
		String ans=solve(s,t);
		System.out.println(ans);
	}
	public static String solve(String s,String t) {
		if(t.length()>s.length()) {
			return "";
		}
		HashMap<Character,Integer>mapt=new HashMap<>();
		for(int i=0;i<t.length();i++) {
			mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i), 0)+1);
		}
		int required=mapt.size(),create=0;
		int[]ans= {-1,0,0};
		HashMap<Character,Integer>maps=new HashMap<>();
		int l=0,r=0;
		while(r<s.length()) {
			char c=s.charAt(r);
			int count=maps.getOrDefault(c, 0);
			maps.put(c, count+1);
			if(mapt.containsKey(c) && maps.get(c).intValue()==mapt.get(c).intValue()) {
				create++;
			}
			while(l<=r && required==create) {
				c=s.charAt(l);
				if(ans[0]==-1 || ans[0]>=r-l+1) {
					ans[0]=r-l+1;
					ans[1]=l;
					ans[2]=r;
				}
				maps.put(c, maps.get(c)-1);
				if(mapt.containsKey(c) && maps.get(c).intValue()<mapt.get(c).intValue()) {
					create--;
				}
				l++;
			}
			r++;
		}
		if(ans[0]==-1)
			return "";
		return s.substring(ans[1],ans[2]+1) ;
	}
}

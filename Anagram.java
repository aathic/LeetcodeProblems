package ytcode;

public class Anagram {
	public static void main(String[] args) {
		String s="cat";
		String t="tac";
		System.out.println(isAnagram1(s,t));
	}
	//Brute force
	public static boolean isAnagram(String s,String t) {
		if(s.length()!=t.length())
			return false;
		int c=0;
		boolean[] visit=new boolean[s.length()];
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<t.length();j++) {
				if(!visit[i] && s.charAt(i)==t.charAt(j)) {
					c++;
				}
			}
		}
		return c==s.length();
	}
	//optimal
	public static boolean isAnagram1(String s,String t) {
		if(s.length()!=t.length())
			return false;
		int[]a=new int[26];
		for(int i=0;i<s.length();i++) {
			a[s.charAt(i)-'a']++;
			a[t.charAt(i)-'a']--;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)
				return false;
		}
		return true;
	}
}

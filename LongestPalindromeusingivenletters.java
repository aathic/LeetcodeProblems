package leetcode;

public class LongestPalindromeusingivenletters {
	public static void main(String[] args) {
		String s="abccccdd";
		System.out.println(solve(s));
	}
	public static int solve(String s) {
		int[]ch=new int[128];
		for(char c:s.toCharArray()) {
			ch[c]++;
		}
		int length=0;
		boolean hasodd=false;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]%2==0)
				length+=ch[i];
			else {
				length+=ch[i]-1;
				hasodd=true;
			}
		}
		return hasodd?length+1:length;
	}
}

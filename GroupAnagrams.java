package ytcode;
import java.util.*;
public class GroupAnagrams {
	public static void main(String[] args) {
		String[]s= {"eat","tea","tan","ate","nat","bat"};
		System.out.println(solve(s));
		
	}
	public static List<List<String>> solve(String[]a){
		if(a.length==0)
			return new ArrayList<>();
		Map<String,List<String>>ans=new HashMap<>();
		int[]count=new int[26];
		for(String s:a) {
			Arrays.fill(count,0);
			for(char c:s.toCharArray())
				count[c-'a']++;
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<26;i++) {
				sb.append("#");
				sb.append(count[i]);
			}
			String key=sb.toString();
			if(!ans.containsKey(key))
				ans.put(key,new ArrayList<String>());
			ans.get(key).add(s);
		}
		return new ArrayList<>(ans.values());
		
	}
}

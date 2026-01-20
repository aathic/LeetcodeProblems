package ytcode;

import java.util.*;

public class TopKFreq {
	public static void main(String[] args) {
		int[]a= {1,1,1,2,2,3};
		int k=2;
		int[]res=solve(a,k);
		System.out.println(Arrays.toString(res));
	}
	public static int[] solve(int[]a,int k) {
		if(a.length==k)
			return a;
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i:a) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		PriorityQueue<Integer>que=new PriorityQueue<>((m,b)-> map.get(m)-map.get(b));
		for(int n:map.keySet()) {
			que.add(n);
			if(que.size()>k) {
				que.poll();
			}
		}
		
		System.out.println(que);
		int[]ans=new int[k];
		for(int i=0;i<k;i++) {
			ans[i]=que.poll();
		}
		
		return ans;
	}
}

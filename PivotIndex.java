package leetcode;

public class PivotIndex {
	public static void main(String[] args) {
		int[]a= {1,2,3,2,1};
		System.out.println(solve(a));
	}
	public static int solve(int[]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		int left=0;
		for(int i=0;i<a.length;i++) {
			if(left==sum-left-a[i])
				return i;
			left+=a[i];
		}
		return -1;
	}
}

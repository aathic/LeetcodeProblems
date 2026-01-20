package leetcode;

public class TrappingH2O {
	public static void main(String[] args) {
		int[]a= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(a));
	}
	public static int trap(int[]a) {
		int water=0;
		int left=0,right=a.length-1;
		int leftm=0,rightm=0;
		while(left<right) {
			if(a[left]<a[right]) {
				if(a[left]>=leftm) {
					leftm=a[left];
				}
				water+=leftm-a[left];
				left++;
			}
			else {
				if(a[right]>=rightm) {
					rightm=a[right];
				}
				water+=rightm-a[right];
				right--;
			}
		}
		
		return water;
	}
}

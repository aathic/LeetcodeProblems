package ytcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		int[]res=solve(a);
		System.out.println(Arrays.toString(res));
		int[]res2=solve2(a);
		System.out.println(Arrays.toString(res2));
		
	}
	public static int[] solve(int[]a) {
		int[]res=new int[a.length];
		int pre=1,post=1;
		for(int i=0;i<a.length;i++) {//left product
			res[i]=pre;
			pre*=a[i];
		}
		for(int i=a.length-1;i>=0;i--) {//right product
			res[i]*=post;
			post*=a[i];
		}
		return res;
	}
	public static int[] solve2(int[]a) {
		int[]res=new int[a.length];
		res[0]=1;
		for(int i=1;i<a.length;i++) {
			res[i]=a[i-1]*res[i-1];
		}
		System.out.println(Arrays.toString(res));
		int product=1;
		for(int i=a.length-2;i>=0;i--) {
			product=product*a[i+1];
			res[i]*=product;
		}
		return res;
	}
}

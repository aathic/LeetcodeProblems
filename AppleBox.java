package leetcode;

import java.util.Arrays;

public class AppleBox {
	public static void main(String[] args) {
		int[]a= {1,3,2};
		int[]c= {4,3,1,5,2};
		Arrays.sort(c);
		int l=0,r=c.length-1;
		while(l<r) {
			int temp=c[l];
			c[l]=c[r];
			c[r]=temp;
			l++;
			r--;
		}
		System.out.println(minimumBoxes(a,c));
	}
	public static int minimumBoxes(int[] apple, int[] capacity) {
        int l=0,c=0;
        for(int i=0;i<capacity.length;i++){
            if(l<apple.length &&apple[l]>=capacity[i] ){
               apple[l]=apple[l]-capacity[i];
                c++;
                if(apple[l]==0)
                l++;
            }
            else if(l<apple.length){
                capacity[i]=capacity[i]-apple[l];
                l++;
                if(capacity[i]==0)
                c++;
                else
                i-=1;
            }
        }
        return c;
    }

}

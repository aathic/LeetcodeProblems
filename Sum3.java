package leetcode;
import java.util.*;
class Sum3
{
	public static void main(String[] args) 
	{
		int[]a={-1,0,1,2,-1,-4};
		Arrays.sort(a);
		System.out.println(threeSum(a));
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> bag=new LinkedList<>();
       
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1])
            	continue;
            int left=i+1,right=nums.length-1;
            while(left<right){
				int sum=nums[i]+nums[left]+nums[right];
				if(sum==0){
					bag.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					right--;
					while(left<right && nums[left]==nums[left-1])
						left++;
					while(left<right && nums[right]==nums[right+1])
						right--;
				}
			else if(sum<0){
				left++;
			}
			else{
				right--;
			}
			}
        }
        return bag;
    }
}

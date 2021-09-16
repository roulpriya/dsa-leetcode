//search insert position
package priya;

public class Search_Insert_Position {
	    public int searchInsert(int[] nums, int target) {
	       //nums.length;
	        for(int i=0;i<nums.length;i++)
	       {
	           if(nums[i]==target)
	               return i;
	           else if(nums[i]>target)
	               return i;
	           
	       }
	        
	        return nums.length;
	    }
	}


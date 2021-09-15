package priya;
import java.util.*;

public class Duplicate_Element {
	    public int removeElement(int[] nums) {
	        
	        int j=0;
	        int i=1;
	        
	        while(i<nums.length){
	            if(nums[j]!=nums[i])
	            {
	                nums[j]=nums[i];
	                j++;
	            }
	            i++;
	        }
	        
	        return j+1;
	        
	    }
}

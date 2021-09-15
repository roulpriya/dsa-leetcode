package priya;

public class Remove_Element {
		    public int removeElement(int[] nums, int val) {
		        
		        int j=0;
		        int i=0;
		        
		        while(i<nums.length){
		            if(nums[i]!=val)
		            {
		                nums[j]=nums[i];
		                j++;
		            }
		            i++;
		        }
		        
		        return j;
		        
		    }
		}


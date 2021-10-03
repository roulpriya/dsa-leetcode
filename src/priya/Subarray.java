package priya;

public class Subarray {

	    public int splitArray(int[] nums, int m) {
	        
	        int start =0;
	        int end = 0;
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            start=Math.max(start,nums[i]); //max
	            end += nums[i];                 //sum of all values
	        }
	        
	        //binary search
	        
	        while(start<end){
	            int mid = start + (end-start)/2;
	            
	            //calculate no of pieces with max sum
	            int sum=0;
	            int pieces = 1;
	            for(int i : nums){
	                if(sum+i > mid){
	                    //cannot add this in subarray
	                    //new subarray sum=num
	                    sum=i;
	                    pieces++;
	                }
	                else{
	                    sum+=i;
	                }
	           }
	            if(pieces > m)
	            {
	                start = mid+1;
	            }
	            else{
	                end = mid;
	            }
	        }
	        return end;
	    }

	    
}

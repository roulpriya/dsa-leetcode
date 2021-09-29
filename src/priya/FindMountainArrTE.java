package priya;

public class FindMountainArrTE {
	    public int findInMountainArray(int target, MountainArray mountainArr) {
	        
	      int p = peak(mountainArr);
	      int firstTry = search(mountainArr, target,0,p);
	        
	        if(firstTry != -1)
	        {
	            return firstTry;
	        }
	        
	        return search(mountainArr,target,p+1,mountainArr.length()-1);
	            
	    }
	    
	    public int peak(MountainArray nums)
	    {
	         int start = 0;
	        int end = nums.length()-1;
	        
	        while(start<end)
	        {
	            int mid = start +(end-start)/2;
	            
	            if(nums.get(mid)>nums.get(mid+1))
	            {
	                end=mid;
	            }
	            else
	            {
	                start = mid+1;
	            }
	        }
	        return start;
	    }
	     int search(MountainArray nums,int target,int start,int end)
	    {
	         boolean isAsc = nums.get(start) < nums.get(end);

	        while(start<=end){
	            int mid=start + (end - start);
	            
	            if(nums.get(mid)==target)
	                return mid;
	            
	            if(isAsc)
	            {
	                if(target < nums.get(mid))
	                end = mid-1;
	            else if(target > nums.get(mid))
	                start = mid+1;
	            }
	            else{
	                if(target > nums.get(mid))
	                end = mid-1;
	            else if(target > nums.get(mid))
	                start = mid+1;
	            }
	        }
	         return -1;
	    }
	}
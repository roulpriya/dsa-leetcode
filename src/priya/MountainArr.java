package priya;

public class MountainArr {
	    public int findInMountainArray(int target, MountainArray mountainArr) {
	        int peakIndex = peak(mountainArr);
	       
	        int left = 0, right = peakIndex;
	        while (left < right) {
	            int mid = left + (right - left >> 1);
	            if (mountainArr.get(mid) >= target) {
	                right = mid;
	            } else {
	                left = mid + 1;
	            }
	        }
	        if (mountainArr.get(left) == target) {
	            return left;
	        }
	        
	        left = peakIndex;
	        right = mountainArr.length();
	        while (left < right) {
	            int mid = left + (right - left >> 1);
	            if (mountainArr.get(mid) <= target) {
	                right = mid;
	            } else {
	                left = mid + 1;
	            }
	        }
	        return left < mountainArr.length() && mountainArr.get(left) == target ? left : -1;
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
}

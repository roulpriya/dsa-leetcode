package priya;

import java.util.ArrayList;

import java.util.*;

public class sortbyparity {
	class Solution {
	    public int[] sortArrayByParity(int[] nums) {
	        List<Integer> even = new ArrayList<>();
	        List<Integer> odd = new ArrayList<>();
	        
	        for(int no : nums){
	            if(no%2 == 0)
	                even.add(no);
	            else
	                odd.add(no);
	        }
	        
	        int i = 0;
	        
	        for(int no : even)
	        {
	            nums[i++]=no;
	        }
	         
	        for(int no : odd)
	        {
	            nums[i++]=no;
	        }
	         return nums;
	    }
	}
}

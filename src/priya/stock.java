package priya;

public class stock {
	
	    public int maxProfit(int[] prices) {
	    
	        if(prices == null || prices.length == 0) return 0;
	        int min = prices[0];
	        int max = 0;
	        
	        for(int i = 0; i < prices.length; i++){
	            int sum = prices[i] - min;
	            if(sum > max) max = sum;
	            if(prices[i] < min) min = prices[i];
	        }
	        
	        return max;
	        
	    }
	}


package priya;
//Leetcode Solution for Richest Customer Wealth
public class Richest_Wealth {
	public int maximumWealth(int[][] accounts) {
    int maximum=0;
    int sum=0;
        for(int i=0;i<accounts.length;i++)
        {
            sum=max(accounts[i]);
            
            if(sum>maximum)
                maximum=sum;
        }
    return maximum;
}

int max(int[] accounts){
    int sum=0;
        for(int j=0;j<accounts.length;j++){
            
            sum=sum+accounts[j];
        }
    return sum;
    
}
}

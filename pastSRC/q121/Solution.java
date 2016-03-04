package q121;

public class Solution {

	public static int maxProfit(int[] prices) {
		int m=prices.length;
		if(m<1) return 0;
		int max=0;
		int buy=prices[0];
		for(int i=1;i<prices.length;i++){
			if(prices[i]>=buy){
				max=Math.max(max, prices[i]-buy);
			}else{
				buy=prices[i];
			}
		}
		return max;
	}

//	public static void main(String[] args) {
//		int[] a={111,2,3,4,5,11,9,3,1111};
//		System.out.print(maxProfit(a));
//	}

}

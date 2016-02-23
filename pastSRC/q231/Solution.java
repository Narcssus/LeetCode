package q231;

public class Solution {

	public static boolean isPowerOfTwo(int n) {
        if(n<=0)	return false;
        while(n!=1){
            if(n!=(n/2)*2) return false;
            n=n/2;
        }
        return true;
    }

//	public static void main(String[] args) {
//		System.out.print(isPowerOfTwo(0));
//	}

}

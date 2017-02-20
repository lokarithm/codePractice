/*
 Given an integer, write a function to determine if it is a power of two.
 */
public class _231_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
    	if(n == 1){
            return true;
        }
        String numString = Integer.toBinaryString(n);

    	if(numString.charAt(0) =='1'){
    		for(int i=1;i<numString.length();i++){
    			System.out.println("char at "+i+" is "+numString.charAt(i));
        		if(numString.charAt(i) == '1'){
        			return false;
        		}
        	}
    	}
    	
        return true;
    }
    
    private static boolean toBinary(int number, int base) {
        final boolean[] ret = new boolean[base];
        int fCounter = 0;
        for (int i = 0; i < base; i++) {
            ret[base - 1 - i] = (1 << i & number) != 0;
            if(ret[base - 1 - i]){
                fCounter++;
            }
        }
        System.out.println(fCounter);
        return fCounter == 1;
    }
    
    public static boolean isPowerOfTwo2(int n) {
        if(n < 0){
            return false;
        }
        if(n == 2 || n == 1){
            return true;
        }

        return toBinary(n, 32);
    }
    
    public static void main(String[] args) {

    	System.out.println(isPowerOfTwo2(4));
	}
	
}



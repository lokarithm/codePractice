public class countPrimesSolution {
    public static int countPrimes(int n) {
        if (n < 3)
            return 0;
    
        boolean[] f = new boolean[n];

        int count = n / 2;
        for (int i = 3; i * i < n; i += 2) {
        	System.out.println("iii = "+i);
            if (f[i]){
                continue;
            }
            
            for (int j = i * i; j < n; j += 2 * i) {
            	System.out.println("j = "+j);
                if (!f[j]) {
                    --count;
                    f[j] = true;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {

    	countPrimes(1977);
	}
    
}
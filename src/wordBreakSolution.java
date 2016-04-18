import java.util.HashSet;
import java.util.Set;

public class wordBreakSolution {

	    public static boolean wordBreak(String s, Set<String> wordDict) {
	    	int nextCuttingPoint = 0;
	    	int i=0;
	        while(i<=s.length()){
	            if(isContain(s,wordDict, nextCuttingPoint, i)){
	            	if(i == (s.length())){
	                    return true;
	                }
	            	
	                nextCuttingPoint = i;
	            }	            
	            i++;
	        }
	        
	        while(i<=s.length()){
	            if(isContain(s,wordDict, nextCuttingPoint, i)){
	            	if(i == (s.length())){
	                    return true;
	                }
	            	
	                nextCuttingPoint = i;
	            }	            
	            i++;
	        }
	        
	        return false;
	    }
	    
	    public static boolean isContain(String s, Set<String> wordDict, int startingPoint, int endingPoint){
	    	if(wordDict.contains(s.substring(startingPoint,endingPoint))){
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public static void main(String[] args) {
	        Set<String> set = new HashSet<String>();
	        
//	        set.add("code");
//	        set.add("now");
//	        set.add("leet");
	        set.add("aaaa");
	        set.add("aaa");

	        try{

//	           System.out.println(wordBreak("leetcode",set));
	           System.out.println(wordBreak("aaaaaaa",set));
	     
	           
	        }
	        catch(Exception e){}
	     }
}

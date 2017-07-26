package string;
/*
 Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.

 For example, given
 s = "helloworld",
 dict = ["hello", "word"].
 
 Return true because "helloworld" can be segmented as "hello word". 
 
 */
import java.util.HashSet;
import java.util.Set;

public class _139_WordBreak {

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
	        
	        set.add("aaaa");
	        set.add("aaa");

	        try{
	           System.out.println(wordBreak("aaaaaaa",set));     
	        }
	        catch(Exception e){}
	     }
}

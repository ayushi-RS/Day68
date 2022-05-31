/* reducing method O(n^2)   012345           (select 1st word & compare with others)
                            flower
                            flowe
                            flow
   str[1].indexOf(flow)   => return starting index of word or -1 if not found  */                         

class Solution {
    public String longestCommonPrefix(String[] str) {
        
       if(str.length == 0) return "";
      
      String pre = str[0];
      
        for(int i=1; i<str.length; i++){
            
            while(str[i].indexOf(pre) != 0){
                
                pre = pre.substring(0, pre.length()-1);
            }
        }
        
        if(pre.equals("")) return "";
        return pre;
        
    }
}
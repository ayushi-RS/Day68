class Solution {
    public static int romanToInt(String s) {
       
        int v = 0, sum=0;
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == 'I')
                v=1;
            else if(s.charAt(i) == 'V')
                v=5;
            else if(s.charAt(i) == 'X')
                v=10;
            else if(s.charAt(i) == 'L')
                v=50;
            else if(s.charAt(i) == 'C')
                v=100;
            else if(s.charAt(i) == 'D')
                v=500;
            else if(s.charAt(i) == 'M')
                v=1000;
            
            if(i<=s.length()-2){
            if(s.charAt(i)=='I' && s.charAt(i+1) == 'V' ){
                 v=4;
                 i++;
            }              
            else if(s.charAt(i)=='I' && s.charAt(i+1) == 'X' ){
                 v=9;
                 i++;
            }
            else if(s.charAt(i)=='X' && s.charAt(i+1) == 'L' ){
                 v=40;
                 i++;
            }
              
            else if(s.charAt(i)=='X' && s.charAt(i+1) == 'C' ){
                 v=90;
                 i++;
            }
              
             else if(s.charAt(i)=='C' && s.charAt(i+1) == 'D' ){
                 v=400;
                 i++;
            }

            else if(s.charAt(i)=='C' && s.charAt(i+1) == 'M' ){
                 v=900;
                 i++;
            }
            }
            
            sum =sum+v;
            
        }
     
        
        
        return sum;
    }
}
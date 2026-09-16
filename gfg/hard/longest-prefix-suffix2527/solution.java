class Solution {
    public int getLPSLength(String s) {
        int k = s.length();
        int[] LPS = new int[k];
        
        int len =0;
        int i =1;
        
        while (i<k){
            if (s.charAt(i) == s.charAt(len)){
                len ++;
                LPS[i] = len;
                i++;
            }
            else{
                if (len != 0){
                    len = LPS[len -1];
                }
                else{
                    LPS[i]=0;
                    i++;
                    
                }
                }
            }
               return LPS[k-1] ;
            }
        }

# Longest Prefix Suffix

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string  **s**, of lowercase english alphabets, find the length of the longest proper prefix which is also a suffix.
 **Note:**  Prefix and suffix can be overlapping but they should not be equal to the entire string.

 **Examples :** 

```
Input: s = "abab"
Output: 2
Explanation: The string "ab" is the longest prefix and suffix. 
```

```
Input: s = "aabcdaabc"
Output: 4
Explanation: The string "aabc" is the longest prefix and suffix.

```

```
Input: s = "aaaa"
Output: 3
Explanation: "aaa" is the longest prefix and suffix. 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T11:22:12.606Z  

```java
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

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-prefix-suffix2527/1)
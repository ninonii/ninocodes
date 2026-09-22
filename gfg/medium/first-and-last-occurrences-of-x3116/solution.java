import java.util.ArrayList;

import java.util.*;

class Solution {
    ArrayList<Integer> find(int[] a, int x) {
        int low = 0, high = a.length - 1, first = -1, last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] >= x) high = mid - 1;
            else low = mid + 1;

            if (a[mid] == x) first = mid;
        }
        low = 0;
        high = a.length - 1; 
       while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] <= x) low = mid + 1;
            else high = mid - 1;

            if (a[mid] == x) last = mid;
        }

        return new ArrayList<>(Arrays.asList(first, last));
    }
}
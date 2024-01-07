/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution : GuessGame {
    public int GuessNumber(int n) {
        int left = 1;
        int right = n;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);
            
            if (result == 0) {
                return mid; // Found the number
            } else if (result == -1) {
                right = mid - 1; // The picked number is lower, search in the left half
            } else {
                left = mid + 1; // The picked number is higher, search in the right half
            }
        }
        
        return -1; // Not found, but this should not happen in this problem
    }
}

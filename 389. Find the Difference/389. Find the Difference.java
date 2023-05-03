
class Solution {
    public char findTheDifference(String s, String t) {
    char ans = 0;
    for(int i=0;i<s.length();i++)
        ans^=s.charAt(i);

    for(int i=0;i<t.length();i++)
        ans^=t.charAt(i);

    return ans;

    }
}
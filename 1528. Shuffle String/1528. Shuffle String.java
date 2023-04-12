class Solution {
    public String restoreString(String s, int[] indices) {
        int x;
        x=s.length();
        char[] result=new char[x];
        int i=0;
        int a;
        while(i<x){
            a=indices[i];
            result[a] = s.charAt(i);
            i++;
        }
        String last = new String(result);
        return last;

    }
}
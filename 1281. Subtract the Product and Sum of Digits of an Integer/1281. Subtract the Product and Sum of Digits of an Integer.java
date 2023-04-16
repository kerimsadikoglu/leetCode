class Solution {
    public int subtractProductAndSum(int n) {
        int c=1;
        int i=0;
        int bas;
        int toplam=0;
        String x=String.valueOf(n);
        bas=x.length();
            while(i<bas){
                c=c*(   x.charAt(i)-'0' );
                i++;
            }
        i=0;  
        while(i<bas){
                toplam=toplam+(   x.charAt(i)-'0' );
                i++;
            }
            return c-toplam;
        }
    }
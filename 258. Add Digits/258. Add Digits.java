class Solution {
    public int addDigits(int num) {
        int tmp=num;
        int i = 0;
        int leng;
        int result=0;
        if(num<10)
            return num;
        while(tmp>=1){
            tmp=tmp/10;
            i++;
        }
        
        leng=i;
        i=0;
        tmp=num;
        while(leng!=1 && leng!=0){
            result=0;
            i=0;
                while(tmp>=1){
                result+=tmp%10;    
                tmp=tmp/10;
                i++;
            }
            leng=i;
            tmp=result;    
        }

        return result;
    }


}
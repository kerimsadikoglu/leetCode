class Solution {
    public int countSegments(String s) {
        int i=0;
        int t=0;
        int j=0;
        if(s.length()==1){
            if(s.charAt(0)!=' ')
                return 1;
            return 0;
        }
            
        if(s.length()==0)
            return 0;
        for(j=0;j<s.length()-1;j++){
            if(s.charAt(j)==' ')
                t=1;
        }
        if(t==0)
            return 1;
        else if(s.charAt(0)==' '){
            for(j=0;j<s.length()-1;j++){
            if(s.charAt(j+1)!=' '){
                t=1;
                if(s.charAt(j)==' ')
                    i++;
            }
        }
        if(t==0)
            return 0;
        
        return i;
        }
        /////////////////////////////////////////////////////
        t=0;
        i=1;
        for(j=0;j<s.length()-1;j++){
            if(s.charAt(j+1)!=' '){
                t=1;
                if(s.charAt(j)==' ')
                    i++;
            }
        }
        if(t==0)
            return 0;
        
        return i;

    

    }
}
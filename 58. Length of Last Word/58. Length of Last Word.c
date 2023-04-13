int lengthOfLastWord(char * s){
    int i=0;
    int y=0;
    int r=0;

    while(s[i]){
        if(s[i]==' ')
            r=1;
        i++;
    }
    i--;
    if(r==0 && i==0)
        return 1;
        
    
    while(s[i]==' '){
        i--;
    }
    while(i>=0 &&  s[i]!=' '){
        i--;
        y++;
    }
    
    return y;

}
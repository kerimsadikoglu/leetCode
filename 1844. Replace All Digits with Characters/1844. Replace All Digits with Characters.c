char * replaceDigits(char * s){
    int i = 0;
    
    while(s[i])
    {
        if(i % 2 == 1)
        {
            s[i] = s[i-1] + (s[i] - 48); //in ASCII 48: '0'   
        }
        ++i;
    }
    return s;
}
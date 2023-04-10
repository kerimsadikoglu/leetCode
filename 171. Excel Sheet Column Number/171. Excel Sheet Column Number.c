int titleToNumber(char * columnTitle){
    int i=0;
    int n=0;
    int result=0;
    while(columnTitle[n])
        n++;
     for(i = 0; i<n; i++){
            result*=26;
            result+=(columnTitle[i]- 'A'+1);
     }
    return result;
}
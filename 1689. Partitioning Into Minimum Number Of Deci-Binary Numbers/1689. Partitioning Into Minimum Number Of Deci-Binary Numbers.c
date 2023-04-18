int minPartitions(char * n){
    int i=0;
    int r=0;
    char max;
    max=n[0];
    while(n[i]){
        if(n[i]>max){
            max=n[i];
        }
        i++;
    }
    return max-'0';
}
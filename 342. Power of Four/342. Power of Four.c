bool isPowerOfFour(int n){
    int tmp=n;
    if(n==1){
        return true;
    }
    if(n<=0){
        return false;
    }
    while(tmp%4==0){
        tmp=tmp/4;
    }
    if(tmp==1){
        return true;
    }
    return false;
}
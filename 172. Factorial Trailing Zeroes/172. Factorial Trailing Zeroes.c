int trailingZeroes(int n){
    int result=0;
    int tmp=5;
    if(n<5){
        return 0;
    }
     while (n >= tmp){
        result = result + n/tmp;
        tmp*=5;
    }
    return result;
}
int mySqrt(int x){
    int i=1;
    while(i*i<x && i<46340){
        i++;
    }
    if(i*i>x)
        return i-1;
    return i;
}
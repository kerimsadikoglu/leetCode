bool detectCapitalUse(char * word){
    int i=0;
    int r=1;
    int a=2;

    if(word[0]<='Z' && word[0]>='A'){
        if(word[1]<='Z' && word[1]>='A'){
            a=0;
        }
        else{
            a=1;
        }
    }

    if(a==0){
        while(word[i]){
        if(word[i]<='Z' && word[i]>='A'){
            i++;
        }
        else{
            r=0;
            i++;
        }
     }
    }
    else if(a==1){
        i=1;
     while(word[i]){
        if(word[i]<='z' && word[i]>='a'){
            i++;
        }
        else{
            r=0;
            i++;
        }
        }
    }
    else{
        while(word[i]){
        if(word[i]<='z' && word[i]>='a'){
            i++;
        }
        else{
            r=0;
            i++;
        }
    }
    }

    if(r==0)
        return false;

    return true;

}
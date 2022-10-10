class Solution {
    public int romanToInt(String s) {
        char[] str = s.toCharArray();
        int num =0;
        for(int i=str.length-1;i>=0;i--){
        switch(str[i]){
            case 'I':
                   num+=1;
                break;
            case 'V':
                if(i>0 && str[i-1] == 'I'){
                     num+=4;
                    i = i-1;
                }
                else{
                    num+=5;
                }
               
                break;
            case 'X':
                if(i>0 && str[i-1] == 'I'){
                     num+=9;
                    i = i-1;
                }
                else{
                    num+=10;
                }
                
                break;
            case 'L':
                if(i>0 && str[i-1] == 'X'){
                     num+=40;
                    i = i-1;
                }
                else{
                    num+=50;
                }
                
                break;
            case 'C':
                if(i>0 && str[i-1] == 'X'){
                     num+=90;
                    i = i-1;
                }
                else{
                    num+=100;
                }
               
                
                break;
            case 'D':
                if(i>0 && str[i-1] == 'C'){
                     num+=400;
                    i = i-1;
                }
                else{
                    num+=500;
                }
                
                break;
            case 'M':
                if(i>0 && str[i-1] == 'C'){
                     num+=900;
                    i = i-1;
                }
                else{
                    num+=1000;
                     
                }
               
                break;
            }
        }
        return num;
    }
}

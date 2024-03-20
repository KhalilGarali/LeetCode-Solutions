class Solution {
public:
    string defangIPaddr(string address) {
        string newIPAddress = "";
        for(int i = 0; i < address.length(); i++){
            if(address[i]!='.'){
                newIPAddress += address[i];
            }
            else{
                newIPAddress += "[.]";
            }
        }
        
        return newIPAddress;
    }
};
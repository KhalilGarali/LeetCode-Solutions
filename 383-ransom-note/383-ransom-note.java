class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count =0;
        char[] chars = magazine.toCharArray();
        for(int i=0; i<ransomNote.length();i++){
            for(int j=0;j<chars.length;j++){
                if(ransomNote.charAt(i)==chars[j]){
                    chars[j]='.';
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        if(ransomNote.length() == count) return true;
        else return false;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoNum =  new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if((nums[i]+nums[j]==target) && i!=j){
                    twoNum[0]=i;
                    twoNum[1]=j;
                }
            }
        }
        return twoNum;
    }
}
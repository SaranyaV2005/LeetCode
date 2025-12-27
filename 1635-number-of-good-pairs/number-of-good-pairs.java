class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count=new int[10000];
        for(int i=0;i<nums.length;i++)
         count[nums[i]]++;
        int totalCount=0;
        for(int i=0;i<count.length;i++){
            int freq = count[i];
            totalCount+=((freq)*(freq-1))/2;
        }return totalCount;        
    }
}
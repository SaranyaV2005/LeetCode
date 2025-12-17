class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> res=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
        Integer[] arr = new Integer[res.size()];
        arr = res.toArray(arr);
        if(arr.length>2)
         return arr[arr.length-3];
        return arr[arr.length-1];
    }
}
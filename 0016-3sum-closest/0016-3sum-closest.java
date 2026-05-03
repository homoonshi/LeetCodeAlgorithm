class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int res = 1000000;

        Arrays.sort(nums);
        
        for(int i=0; i<len-2; i++){
            int left = i+1;
            int right = len-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target-res) > Math.abs(target-sum)){
                    res = sum;
                }
                if(target > sum){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return res;   
    }
}
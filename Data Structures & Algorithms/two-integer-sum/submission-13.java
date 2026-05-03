class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ansArr = new int[2];
        int[] dupArr = nums.clone();
        int flag = 0;
        Arrays.sort(dupArr);
        int i=0,j=dupArr.length -1;
        while(i < j){
        if(dupArr[i]+dupArr[j] == target){
            for(int k=0;k<nums.length;k++){
                if(nums[k] == dupArr[i] && flag == 0){
                    ansArr[0] = k;
                    flag++;
                }
                else if(nums[k] == dupArr[j]){
                    ansArr[1] = k;
                }

            }
           break; 
        }
        else if(dupArr[i]+dupArr[j] < target){
            i++;
        }
        else if(dupArr[i]+dupArr[j] > target){
            j--;
        }
        }
        if(ansArr[0]>ansArr[1]){
            int temp =ansArr[1];
            ansArr[1]=ansArr[0];
            ansArr[0]=temp;
        }
       return ansArr;
    } 
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] temp =new int[nums.length];
        temp = nums.clone();

        int product = 1;
        int productWithZero = 1,cnt = 0;
        for(int i=0;i<nums.length;i++){
            product = product * nums[i]; 
            
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i] == 0){
                temp[i] = 1;
                cnt++;
            }
            productWithZero = productWithZero*temp[i];
        }

        for(int i=0;i<nums.length;i++){
            if(cnt>1)
            output[i] = 0;
            else if(cnt == 0)
            output[i] = product/nums[i];
            else if(cnt == 1)
            {
                if(nums[i]==0)
                output[i]=productWithZero;
                else
                output[i]=0;
            }
        }
        return output;
    }
}  

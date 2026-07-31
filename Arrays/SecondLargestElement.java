class Solution {
    public int secondLargestElement(int[] nums) {
        int n=nums.length;
        int Flargest=nums[0];
        int Slargest=-1;
        for(int i=1;i<n;i++){
            if(nums[i]>Flargest){
                Flargest=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>Slargest && nums[i]!=Flargest){
               Slargest=nums[i];
            }
       }
        return Slargest;

    
    }
}
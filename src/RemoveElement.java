class Solution {
    public int removeElement(int[] nums, int val) {
        int bad = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) bad++;
        }
        if(bad == 0) return nums.length;
        
        int numChanged = 0;
        for(int i = 0; i < nums.length; i++) {
            // if current element is a match, search for the next element that is not a match
            
            if(nums[i] == val) {
                int j = 0;
                while(i+j < nums.length && nums[i + j] == val) {
                    j++;
                }
                //then swap nums[i+j], nums[i]
                if(i + j == nums.length) return i;
                    
                int temp = nums[i];
                nums[i] = nums[i+j];
                nums[i+j] = temp;
                
            }
            numChanged = i;
        }
        return numChanged;
    }
}

/*
 *Solution
 * public int removeElement(int[] nums, int val) {
 * 	int i = 0;
 * 	for(int j = 0; j < nums.length; j++) {
 * 		if(nums[j] != val) {
 * 			nums[i] = nums[j];
 * 			i++;
 * 		}
 * 	}
 * 	return i;
 * } 
 */

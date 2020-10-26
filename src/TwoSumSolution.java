/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
//Verified
public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) {
            int[] solution = {-1, -1};
            return solution;
        }
        if(nums.length == 2 && nums[0] + nums[1] == target) {
            int[] solution = {0, 1};
            return solution;
        } else if(nums.length == 2){
            int[] solution = {-1, -1};
            return solution;
        }
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j <= nums.length - 1; j++) {
                if(nums[i] + nums[j] == target) {
                    int[] solution = {i, j};
                    return solution;
                }
            }
        }
        int[] noSol = {-1, -1};
        return noSol;
    }
}

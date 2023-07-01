package LeetCodePractice;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return true;


        }
        return false;
}

    public static void main(String[] args) {
         containsDuplicate(int [] nums);

            }
        };




class S {
    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {

                if(target == nums[i] + nums[j]) {
                    System.out.println("[" + i + "," + j + "]");
                    return new int[]{i, j};
                }
                else {
                    System.out.println("[" + i + "," + j + "]" + " not equal to target");
                }
            }
        }

        return new int[]{};
    }
}

public class Solution {
    public static void main(String args[]) {

        S solS = new S();

        solS.twoSum(new int[]{3,2,1,4}, 9);
    }
}
    


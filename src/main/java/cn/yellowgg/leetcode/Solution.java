package cn.yellowgg.leetcode;

/**
 * @Author:黄广
 * @Description: 刷会lettcode的题
 * @Date: Created in 19-6-8 下午7:40
 */
public class Solution {

    /**
     * https://leetcode.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * https://leetcode.com/problems/palindrome-number/
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int count = 0;
        int temp = x;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int zhishu = count - 1;
        int xcopy = x;

        for (int i = 0; i < count / 2; i++, xcopy /= 10) {
            temp = xcopy % 10;
            int first = (int) (x / (Math.pow(10, zhishu--))) % 10;
            if (temp != first) {
                return false;
            }
        }

        return true;
    }

    /**
     * https://leetcode.com/problems/search-insert-position/
     */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        if (target <= nums[0]) {
            return 0;
        } else if (target >= nums[nums.length - 1]) {
            return nums.length;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= target && nums[i + 1] >= target) {
                    return i + 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{1, 3, 5, 6};
        System.out.println(solution.searchInsert(array, 5));
        System.out.println(solution.searchInsert(array, 2));
        System.out.println(solution.searchInsert(array, 7));
        System.out.println(solution.searchInsert(array, 0));

    }
}

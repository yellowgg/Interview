package cn.yellowgg.leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author:黄广
 * @Description: 刷会lettcode的题
 * @Date: Created in 19-6-8 下午7:40
 */
public class Solution {

    /**
     * 树节点
     */
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

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

    /**
     * https://leetcode.com/problems/jewels-and-stones/
     */
    public int numJewelsInStones(String J, String S) {
        if (S == null || S.isEmpty() || J == null || J.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == J.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * https://leetcode.com/problems/to-lower-case/
     */
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Character.toChars(c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * https://leetcode.com/problems/reverse-string/
     */
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < (s.length / 2); i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    /**
     * https://leetcode.com/problems/sort-array-by-parity/
     */
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];

        int head = 0;
        int tail = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 0) {
                result[head++] = A[i];
            } else {
                result[tail--] = A[i];
            }
        }

        return result;
    }

    /**
     * https://leetcode.com/problems/flipping-an-image/
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int temp, length;
        for (int i = 0; i < A.length; i++) {
            length = A[i].length;
            if ((length & 1) == 1) {
                A[i][length / 2] = A[i][length / 2] ^ 1;
            }
            for (int j = 0; j < A[i].length / 2; j++) {
                temp = A[i][j] ^ 1;
                A[i][j] = A[i][length - j - 1] ^ 1;
                A[i][length - j - 1] = temp;
            }
        }
        return A;
    }


    /**
     * https://leetcode.com/problems/univalued-binary-tree/
     */
    int flag = 0;

    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;

        pre(root, val);
        if (flag == 1) {
            return false;
        } else {
            return true;
        }

    }

    public void pre(TreeNode root, int fatherVal) {
        if (root == null)
            return;

        else if (root.val != fatherVal) {
            flag = 1;
            return;
        } else {
            pre(root.left, fatherVal);
            pre(root.right, fatherVal);
        }
    }

    /**
     * https://leetcode.com/problems/fibonacci-number/
     */
    public int fib(int N) {
        int[] fib = new int[31];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[N];
    }

    /**
     * https://leetcode.com/problems/occurrences-after-bigram/
     */
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < words.length - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                result.add(words[i + 2]);
                i += 1;
            }
        }
        return result.toArray(new String[result.size()]);
    }

    /**
     * https://leetcode.com/problems/transpose-matrix/
     */
    public int[][] transpose(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }

    /**
     * https://leetcode.com/problems/robot-return-to-origin/
     */
    public boolean judgeCircle(String moves) {
        int shu = 0;
        int heng = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    heng = heng + 1;
                    break;
                case 'L':
                    heng = heng - 1;
                    break;
                case 'U':
                    shu = shu + 1;
                    break;
                case 'D':
                    shu = shu - 1;
                    break;
                default:
                    break;
            }
        }
        return heng == 0 && shu == 0 ? true : false;
    }

    /**
     * https://leetcode.com/problems/reverse-words-in-a-string-iii/
     */
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(revers(word.toCharArray())).append(" ");
        }
        return sb.toString().trim();
    }

    private char[] revers(char[] s) {
        char temp;
        for (int i = 0; i < (s.length / 2); i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        return s;
    }

    /**
     * https://leetcode.com/problems/reverse-only-letters/
     */
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        char s;
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!(Character.isLowerCase(chars[i]) || Character.isUpperCase(chars[i]))) {
                i++;
            } else if (!(Character.isLowerCase(chars[j]) || Character.isUpperCase(chars[j]))) {
                j--;
            } else {
                s = chars[i];
                chars[i++] = chars[j];
                chars[j--] = s;
            }
        }
        return new String(chars);
    }

    /**
     * https://leetcode.com/problems/valid-parentheses/
     */
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.pop() == '(') continue;
                return false;
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.pop() == '[') continue;
                return false;
            } else if (c == '}') {
                if (!stack.isEmpty() && stack.pop() == '{') continue;
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * https://leetcode.com/problems/detect-capital/
     */
    public boolean detectCapitalUse(String word) {
        int capsNumber = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 97) {
                capsNumber++;
            }
        }
        if (capsNumber == 0) {
            return true;
        } else if (capsNumber == word.length()) {
            return true;
        } else {
            return word.charAt(0) < 97 && capsNumber == 1 ? true : false;
        }
    }

    /**
     * https://leetcode.com/problems/range-sum-of-bst/submissions/
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        }
        if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        }
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }

    /**
     * https://leetcode.com/problems/squares-of-a-sorted-array/
     */
    public int[] sortedSquares(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int[] result = new int[A.length];
        int index = A.length - 1;

        while (left <= right) {
            int i1 = A[left] * A[left];
            int i2 = A[right] * A[right];
            if (i1 < i2) {
                result[index--] = i2;
                right--;
            } else {
                result[index--] = i1;
                left++;
            }
        }
        return result;
    }

    /**
     * https://leetcode.com/problems/remove-outermost-parentheses/
     */
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        //使用下标的变化模拟栈
        int left = 0;
        int right = 0;
        //遍历
        for (char c : S.toCharArray()) {
            switch (c) {
                case '(':
                    //如果是左括号，左下标增加，代表入栈
                    left++;
                    //如果不是初次入栈，就代表不是最外围的括号，需要打印
                    if (left != 1) {
                        sb.append(c);
                    }
                    break;
                case ')':
                    //如果是右括号，右下标增加，代表入栈
                    right++;
                    //右括号入栈之后需要匹配左括号
                    if (right != left) {
                        //如果右括号不等于左括号，说明是内部的，需要打印，如(()，然后就可以消掉
                        sb.append(c);
                    } else {
                        left = 0;
                        right = 0;
                    }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }
}

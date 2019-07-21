package cn.yellowgg.leetcode;

import java.util.*;

/**
 * @Description: 刷lettcode
 * @Author:黄广
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
     * 链表节点
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
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

    /**
     * 728 https://leetcode.com/problems/self-dividing-numbers/
     */
    /**
     * 本题思路：
     * 检查所有的数，如果该数包含了0，直接不要，如果该数不能整除该数的某一位，也不要
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                list.add(i);
            }
        }

        return list;
    }

    private boolean check(int i) {
        int temp = i;
        int num;
        //遍历数字的每一位
        while (temp != 0) {
            num = temp % 10;
            if (num == 0) {
                return false;
            } else if (i % num != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    /**
     * 942 https://leetcode.com/problems/di-string-match/
     */
    /**
     * 本题思路：
     * 既然I的时候是右边都比a[i]大，那么就把最小的放在a[i]
     * 既然D的时候是右边都比a[i]小，那么就把最大的放在a[i]
     * 然后同理，0 1 2 3 4 在第一轮的时候只剩1 2 3
     * 继续上面的对比，就会用掉1和3
     * 因为只循环4次，剩下的2直接放到数组最后面
     */
    public int[] diStringMatch(String S) {
        int[] array = new int[S.length() + 1];
        int index = 0;
        int low = 0;
        int high = S.length();
        for (char c : S.toCharArray()) {
            if (c == 'I') {
                array[index++] = low++;
            } else {
                array[index++] = high--;
            }
        }
        array[index] = low;
        return array;
    }

    /**
     * 21 https://leetcode.com/problems/merge-two-sorted-lists/
     */
    /**
     * 本题思路：
     * 用递归，每次比较两个节点的大小，小的节点node 就使用，相当于作为链表的头，
     * 然后让node的下一个跟原来的比，如此反复
     * 比如 1 2 3 ， 4 5 6
     * 1跟4比，取1 下一轮就是1的后面2跟4比
     * 2跟4比，取2 下一轮就是2的后面3跟4比
     * 3跟4比，取3 下一轮就没了，3直接连上4
     * 就是123456了
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

    /**
     * 67 https://leetcode.com/problems/add-binary/
     */
    /**
     * 本题思路：
     * 大数加法了解一下，虽然用大数加法在这里算小题大做了，就当复习一遍吧
     * 也可以根据字符串算出十进制的数，然后加了之后再转回二进制
     */
    public String addBinary(String a, String b) {
        //如果全是0，最后的result数组也全都是0，就出现因为flag的存在而返回“”，但其实应该返回“0”
        if ("0".equals(a) && "0".equals(b)) {
            return "0";
        }
        //获取最大长度
        int maxLen = a.length() > b.length() ? a.length() : b.length();

        //构建两个倒序数组
        int[] arrayA = new int[maxLen + 1];
        for (int i = 0; i < a.length(); i++) {
            arrayA[i] = a.charAt(a.length() - 1 - i) - '0';
        }

        int[] arrayB = new int[maxLen + 1];
        for (int i = 0; i < b.length(); i++) {
            arrayB[i] = b.charAt(b.length() - 1 - i) - '0';
        }

        //构建结果数组
        int[] result = new int[maxLen + 1];

        //开始计算
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            temp += arrayA[i];
            temp += arrayB[i];
            //判断进位
            if (temp >= 2) {
                temp -= 2;
                result[i + 1] = 1;
            }
            result[i] = temp;
        }

        //逆序返回
        StringBuilder sb = new StringBuilder();
        //最高位的标记
        boolean flag = false;
        for (int i = result.length - 1; i >= 0; i--) {
            if (!flag) {
                if (result[i] == 0) {
                    continue;
                }
                flag = true;
            }
            sb.append(result[i]);
        }
        return sb.toString();
    }

    /**
     * 26 https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */
    /**
     * 本题思路：
     * 遍历数组，如果发现两个数不同，就把后一个数放在前一个数的后边，两个数重复的话往后移
     * 如此往复后整个数组的前面就是去了重的排序数列
     */
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }

    /**
     * 27 https://leetcode.com/problems/remove-element/
     */
    /**
     * 本题思路：
     * 扫描数组，如果不是要移除的数，就往后继续找，用一个index代表从前往后
     */
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    /**
     * 28 https://leetcode.com/problems/implement-strstr/
     */
    /**
     * 本题思路：
     * 匹配字符串，借助subString
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null
                || haystack.length() < needle.length()) {
            return -1;
        }
        //匹配
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 66 https://leetcode.com/problems/plus-one/
     */
    /**
     * 本题思路：
     * 先算最后一位，判断有没有超过10 然后再算剩下的即可，模拟竖式运算
     */
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        boolean flag = false;//进位标记
        int[] num = digits;
        //算最后一位
        if (digits[len - 1] + 1 >= 10) {
            //最后一位置为0
            num[len - 1] = 0;
            flag = true;
        } else {
            num[len - 1] += 1;
            //如果没有进位，直接返回最后一位+1的结果即可
            return num;
        }

        //如果最后一位有进位 就算出全部
        for (int i = len - 2; i >= 0; i--) {
            //如果有进位
            if (flag && num[i] + 1 >= 10) {
                //跟上面的一样
                num[i] = 0;
                flag = true;
            } else if (flag) {
                num[i] += 1;
                flag = false;
            }
        }

        //算最高位 因为最高位也是0的话，代表前面也是0，因为9999+1 = 10000
        if (flag && num[0] == 0) {
            //扩展多一位 此时数组全都为0 把第一位改成1即可
            int[] result = new int[len + 1];
            result[0] = 1;
            return result;
        }
        return num;
    }

    /**
     * 69 https://leetcode.com/problems/sqrtx/
     */
    /**
     * 本题思路：
     * 这里试试牛顿迭代法
     */
    public int mySqrt(int x) {
        long result = x;
        while (result * result > x) {
            result = (result + x / result) / 2;
        }
        return (int) result;
    }

    /**
     * 38 https://leetcode.com/problems/count-and-say/
     */
    /**
     * 本题思路：
     * 看了大半天才理解题意，就是说一下上一个数字的形式 那就直接按着正常逻辑来
     */
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        //初始字符串
        StringBuilder str = new StringBuilder("1");
        StringBuilder temp;
        int len; //这个值是统计几个几中的第一个几
        char ch; //用于记录上一个字符串的字符
        //按次数遍历
        for (int i = 1; i < n; i++) {
            temp = str;
            str = new StringBuilder();//新的字符串
            //初始化为1个几
            len = 1;
            //从第一个字符开始
            ch = temp.charAt(0);
            //开始扫描字符串
            for (int j = 1, length = temp.length(); j < length; j++) {
                //统计同一个字符有多少次
                if (temp.charAt(j) != ch) {
                    str.append(len).append(ch);//这样就是添加了几个几的意思
                    //初始化len
                    len = 1;
                    //获取下一个不同的字符
                    ch = temp.charAt(j);
                } else {
                    //统计几个几的第一个几
                    len++;
                }
            }
            //统计完之后添加
            str.append(len).append(ch);
        }
        return str.toString();
    }

    /**
     * 2 https://leetcode.com/problems/add-two-numbers/
     */
    /**
     * 本题思路：
     * 用正常思路
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode fir = l1, sec = l2;
        //最终返回result 所以用一个指针操作result
        ListNode p = result;
        int carry = 0;
        //扫描两条链表
        while (fir != null || sec != null) {
            //获取值 如果节点为null就用0
            int x = (fir != null) ? fir.val : 0;
            int y = (sec != null) ? sec.val : 0;
            //计算
            int sum = x + y + carry;
            //进位值
            carry = sum / 10;
            //指向
            p.next = new ListNode(sum % 10);
            p = p.next;
            if (fir != null) {
                fir = fir.next;
            }
            if (sec != null) {
                sec = sec.next;
            }
        }
        //计算最后一位
        if (carry > 0) {
            p.next = new ListNode(carry);
        }

        return result.next;
    }

    /**
     * 22 https://leetcode.com/problems/generate-parentheses/
     */
    /**
     * 本题思路：
     * 用递归，可以用左右来标记，因为第一个就是左n个左括号，右n个右括号
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        if (n == 0) {
            return result;
        }
        auxiliary(result, "", n, n);
        return result;
    }

    private void auxiliary(List<String> result, String paren, int left, int right) {
        if (left > 0) {
            auxiliary(result, paren + "(", left - 1, right);
        }
        if (right > left) {
            auxiliary(result, paren + ")", left, right - 1);
        }
        if (right == 0) {
            result.add(paren);
        }
    }

    /**
     * 148 https://leetcode.com/problems/sort-list/
     */
    /**
     * 本题思路：
     * 满足题干时间复杂度的只有快速排序，归并排序，堆排序，鉴于链表没有下标，所以选择归并排序
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //慢指针每走一步，快指针走两步，快指针指到链表尾的时候，慢指针指在中间，分开了
        ListNode slow = head, fast = head, pre = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return merge(sortList(head), sortList(slow));
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }


    /**
     * 46 https://leetcode.com/problems/permutations/
     */
    /**
     * 本题思路：
     * 回溯
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        result.add(new ArrayList<>());
        return backtracking(result, nums, 0);
    }

    private List<List<Integer>> backtracking(List<List<Integer>> result, int[] nums, int pos) {
        if (pos == nums.length) {
            return result;
        }
        List<List<Integer>> newResult = new ArrayList<>();
        for (List<Integer> list : result) {
            for (int i = 0; i <= list.size(); i++) {
                List<Integer> newList = new ArrayList(list);
                newList.add(i, nums[pos]);
                newResult.add(newList);
            }
        }
        result = newResult;
        return backtracking(result, nums, pos + 1);
    }

    /**
     * 24 https://leetcode.com/problems/swap-nodes-in-pairs/
     */
    /**
     * 本题思路：
     * 先获取第二第三个节点，然后第二个指向第一个，第一个指向第三个，第三个又重复，递归
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //获取第二个
        ListNode sec = head.next;
        //获取第三个
        ListNode thr = sec.next;
        //第二指向第一，以便交换
        sec.next = head;
        //第一指向下一组的头结点
        head.next = swapPairs(thr);

        //返回头结点
        return sec;
    }

    /**
     * 43 https://leetcode.com/problems/multiply-strings/
     */
    /**
     * 本题思路：
     * 字符串相乘，不就是传说中的大数乘法吗
     */
    public String multiply(String num1, String num2) {
        if (isZero(num1) || isZero(num2)) {
            return "0";
        }

        // 存储num1和num2和结果 结果最长就是两个的长度之和 999*999=998001
        int[] a1 = new int[num1.length()];
        int[] a2 = new int[num2.length()];
        int[] product = new int[num1.length() + num2.length()];

        // 倒序计算
        for (int i = a1.length - 1; i >= 0; i--) {
            for (int j = a2.length - 1; j >= 0; j--) {

                // 不用把字符串转成int数组了，直接获取每一位的值
                // Character.getNumericValue(char c)返回指定的Unicode字符表示的int值
                int thisProduct = Character.getNumericValue(num1.charAt(i)) *
                        Character.getNumericValue(num2.charAt(j));

                product[i + j + 1] += thisProduct % 10;
                if (product[i + j + 1] >= 10) {
                    product[i + j + 1] %= 10;
                    product[i + j]++;
                }
                product[i + j] += thisProduct / 10;
                if (product[i + j] >= 10) {
                    product[i + j] %= 10;
                    product[i + j - 1]++;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < product.length; i++) {
            if (i == 0 && product[i] == 0) {
                continue;
            }
            stringBuilder.append(product[i]);
        }
        return stringBuilder.toString();
    }

    private boolean isZero(String num) {
        for (char c : num.toCharArray()) {
            if (c != '0') {
                return false;
            }
        }
        return true;
    }

    /**
     * 60 https://leetcode.com/problems/permutation-sequence/
     */
    /**
     * 本题思路：
     * 又是字典序的题
     */
    public String getPermutation(int n, int k) {
        int[] nums = new int[n + 1];

        int permcount = 1;
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1; // 初始化数组
            permcount *= (i + 1);
        }

        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            permcount = permcount / (n - i);
            int idx = k / permcount;
            sb.append(nums[idx]);
            for (int j = idx; j < n - i; j++) {
                nums[j] = nums[j + 1];
            }
            k %= permcount;
        }
        return sb.toString();
    }


    /**
     * 64 https://leetcode.com/problems/minimum-path-sum/
     */
    /**
     * 本题思路：
     * 动态规划
     */
    public int minPathSum(int[][] grid) {
        int[] dp = new int[grid.length];
        dp[0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i] = grid[i][0] + dp[i - 1];
        }
        for (int j = 1; j < grid[0].length; j++) {
            for (int i = 0; i < grid.length; i++) {
                dp[i] = (i == 0 ? dp[i] : Math.min(dp[i], dp[i - 1])) + grid[i][j];
            }
        }
        return dp[grid.length - 1];
    }

    /**
     * 104 https://leetcode.com/problems/maximum-depth-of-binary-tree/
     */
    /**
     * 本题思路：
     * 这还不简单
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * 111 https://leetcode.com/problems/minimum-depth-of-binary-tree/
     */
    /**
     * 本题思路：
     * 这还还不简单
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (l == 0) {
            return r + 1;
        }
        if (r == 0) {
            return l + 1;
        }
        return Math.min(l, r) + 1;
    }

    /**
     * 844 https://leetcode.com/problems/backspace-string-compare/
     */
    /**
     * 本题思路：
     * 用栈，也可以使用StringBuilder，有个deleteCharAt()方法
     */
    public boolean backspaceCompare(String S, String T) {
        char[] s = S.toCharArray();
        Stack<Character> sStack = new Stack<Character>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != '#') {
                sStack.push(s[i]);
            } else {
                if (sStack.isEmpty()) {
                    continue;
                }
                sStack.pop();
            }
        }

        char[] t = T.toCharArray();
        Stack<Character> tStack = new Stack<>();
        for (int i = 0; i < t.length; i++) {
            if (t[i] != '#') {
                tStack.push(t[i]);
            } else {
                if (tStack.isEmpty()) {
                    continue;
                }
                tStack.pop();
            }
        }


        return sStack.toString().equals(tStack.toString());
    }

    /**
     * 1122 https://leetcode.com/problems/relative-sort-array/
     */
    /**
     * 本题思路：
     * 用arr1跟arr2扫描相同的，再把不相同的单独拿出来排序再合并
     * 这是一个双周赛的新题目，第一名用了一分多钟就做出来了，简直是天神下凡横扫凡人哈哈哈
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> integers = new ArrayList<>();
        int len = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] != 1001 && arr1[j] == arr2[i]) {
                    integers.add(arr1[j]);
                    len++;
                    arr1[j] = 1001;
                }
            }
        }

        int[] result = new int[len];
        for (int i = 0; i < integers.size(); i++) {
            result[i] = integers.get(i);
        }

        int[] asc = new int[arr1.length - len];
        int ascLen = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 1001) {
                asc[ascLen++] = arr1[i];
            }
        }

        Arrays.sort(asc);


        return concat(result, asc);
    }

    private int[] concat(int[] first, int[] sencond) {
        int[] re = new int[first.length + sencond.length];
        System.arraycopy(first, 0, re, 0, first.length);
        System.arraycopy(sencond, 0, re, first.length, sencond.length);
        return re;
    }

    /**
     * 242 https://leetcode.com/problems/valid-anagram/
     */
    /**
     * 本题思路：
     * 这是排序分类里面的题，它就是想看看字母是不是一样的，这样的话那就好办
     */
    public boolean isAnagram(String s, String t) {
        //获取两个字符串的字符
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        //排序
        Arrays.sort(chars);
        Arrays.sort(chart);

        //比较
        return new String(chars).equals(new String(chart));
    }

    /**
     * 349 https://leetcode.com/problems/intersection-of-two-arrays/
     */
    /**
     * 本题思路：
     * HashSet
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] ints = new int[set.size()];

        int index = 0;

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            ints[index++] = iterator.next();
        }

        return ints;
    }

    /**
     * 350 https://leetcode.com/problems/intersection-of-two-arrays-ii/
     */
    /**
     * 本题思路：
     * 跟这个题的题一一样，用两个指针对比一样的部分
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] results = new int[Math.min(nums1.length, nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                results[index++] = nums1[i];
                i++;
                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;

            } else {
                j++;
            }
        }

        return Arrays.copyOf(results, index);
    }

    /**
     * 75 https://leetcode.com/problems/sort-colors/
     */
    /**
     * 本题思路:
     * 直觉告诉我用桶排序
     */
    public void sortColors(int[] nums) {
        //桶
        int[] tong = new int[3];
        //装桶
        for (int i = 0; i < nums.length; i++) {
            tong[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < tong[i]; j++) {
                nums[index++] = i;
            }
        }
    }

    /**
     * 155 https://leetcode.com/problems/min-stack/
     */
    /**
     * 本题思路：
     * 重点是常数阶获取最小值，很明显，用一个数记录着就可以了
     * 使用辅助栈记录着最小值
     */
    class MinStack {

        private Stack<Integer> stack;
        private Stack<Integer> minStack;
        private int min;

        public MinStack() {
            stack = new Stack<Integer>();
            minStack = new Stack<Integer>();
            min = Integer.MAX_VALUE;
        }

        public void push(int x) {
            stack.push(x);
            if (x <= minStack.peek() || minStack.empty()) {
                minStack.push(x);
            }
        }

        public void pop() {
            //如果主栈元素跟最小栈元素相等，最小栈也出栈
            if (minStack.peek().equals(stack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    /**
     *  144 https://leetcode.com/problems/binary-tree-preorder-traversal/
     */
    /**
     * 本题思路：
     * 用栈
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                result.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return result;
    }

    /**
     * 94 https://leetcode.com/problems/binary-tree-inorder-traversal/
     */
    /**
     * 本题思路：
     * 用栈做，不用递归
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }

    /**
     *  145 https://leetcode.com/problems/binary-tree-postorder-traversal/
     */
    /**
     * 本题思路：
     * 用栈，换种方式，右孩子比左孩子先出栈，先处理右孩子，然后再倒过来输出
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack();
        //先把根节点进栈
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            result.add(root.val);
            if (root.left != null) {
                stack.push(root.left);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
        }
        Collections.reverse(result);
        return result;
    }

    /**
     * 用来生成树的，无他
     *
     * @return
     */
    public TreeNode getTreeNode() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        return t1;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycollection;

import java.util.*;

/**
 *
 * @author josh
 */
public class Solution {

    /*ARRAYS*/
    //#1 - Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                j++;
                nums[j - 1] = nums[i + 1];
            }
        }
        for (int k : nums) {
            System.out.println(k);
        }
        // System.out.println(j);
        return j;
    }

    //#2 - Best Time to Buy and Sell Stock II
    public int maxProfit(int[] prices) {
        int result = 0;

        return result;
    }

    //#3 - Rotate Array
    public void rotate(int[] nums, int k) {
        int x = nums[0];
        int j;
        int l = 1;

        if (k == 0) {
            return;
        }

        do {
            j = nums[nums.length - 1];
            for (int i = 0; i < nums.length - 1; i++) {
                int y = x;
                x = nums[i + 1];
                nums[i + 1] = y;
            }
            nums[0] = j;
        } while (l <= k);

        l++;
        for (int m : nums) {
            System.out.println(m);
        }
    }

    //#4 - Contains Duplicate
    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = true;
                System.out.println(duplicate);
                return true;
            }
        }
        System.out.println(duplicate);
        return false;
    }

    //#5 - Single Number
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int output = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (i == nums.length - 1) {
                output = nums[i];
            } else if (nums[i] == nums[i + 1]) {
                i++;
            } else {
                output = nums[i];
            }
        }
        System.out.println(output);
        return output;
    }

    //#6 - Intersection of Two Arrays II
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] output = {};

        return output;
    }

    //#7 - Plus One
    public int[] plusOne(int[] digits) {
        //int [] output = {};
        int i = digits.length - 1;
        int sum = 0;
        boolean out = false;

        for (int j : digits) {
            if (j > 0 && (j % 9) == 0) {
                sum++;
            }
        }

        if (sum == digits.length) {
            int[] output = new int[digits.length + 1];
            output[0] = 1;
            for (int m : output) {
                System.out.println(m);
            }
            return output;
        } else {
            while (!out) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    i--;
                } else {
                    digits[i]++;
                    out = true;
                }
            }
        }
        for (int m : digits) {
            System.out.println(m);
        }
        return digits;
    }

    //#8 - Move Zeroes
    public void moveZeroes(int[] nums) {
        int n;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        for (int m : nums) {
            System.out.println(m);
        }
    }

    //#9 - Two Sum
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                //System.out.println("i: " + i);
                //System.out.println("j: " +j);
                if ((nums[i] + nums[j]) == target) {
                    output[0] = i;
                    output[1] = j;
                    //System.out.println(output[0]);
                    //System.out.println(output[1]);
                    return output;
                }
            }
        }

        System.out.println("nope");
        return output;
    }

    //#10 - Valid Sudoku
    public boolean isValidSudoku(char[][] board) {

        return true;
    }

    //11# - Rotate Image
    public void rotate(int[][] matrix) {
        int size;
        for (int i = 0; i < matrix.length - 1; i++) {
            size = matrix.length - 1 - i;
            if (size >= 1) {
                int count = 0;
                for (int j = i; j < matrix.length - 1 - i; j++) {
                    int temp = matrix[i][j];
                    
                    matrix[i][j] = matrix[size - count][i];
                    matrix[size - count][i] = matrix[size][size - count];
                    matrix[size][size - count] = matrix[j][size];
                    matrix[j][size] = temp;
                    count++;
                }

            }
        }

        System.out.print("\n");
        for (int k = 0; k <= matrix.length - 1; k++) {
            for (int l = 0; l <= matrix.length - 1; l++) {
                System.out.print(matrix[k][l] + ", ");
            }
            System.out.print("\n");
        }

    }

}

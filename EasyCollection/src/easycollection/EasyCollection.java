/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycollection;

/**
 *
 * @author josh
 */
public class EasyCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Solution solutions = new Solution();
        //int[] nums = {0,0,1,1,1,2,2,3,3,4}; //#1
        //solutions.removeDuplicates(nums);

        //int[] nums = {1,2,3,4,5,6,7}; //#3
        //solutions.rotate(nums, 0);
        //int[] nums = {1,2,3,1};//{1,2,3,4};
        //solutions.containsDuplicate(nums);
        //int[] nums = {4,1,2,1,2};//{1,2,3,4};
        //solutions.singleNumber(nums);
        //int[] digits = {1,2,9};
        //solutions.plusOne(digits);
        //int[] nums = {-959151711, 623836953, 209446690, -1950418142, 1339915067, -733626417, 481171539, -2125997010, -1225423476, 1462109565, 147434687, -1800073781, -1431212205, -450443973, 50097298, 753533734, -747189404, -2070885638, 0, -1484353894, -340296594, -2133744570, 619639811, -1626162038, 669689561, 0, 112220218, 502447212, -787793179, 0, -726846372, -1611013491, 204107194, 1605165582, -566891128, 2082852116, 0, 532995238, -1502590712, 0, 2136989777, -2031153343, 371398938, -1907397429, 342796391, 609166045, -2007448660, -1096076344, -323570318, 0, -2082980371, 2129956379, -243553361, -1549960929, 1502383415, 0, -1394618779, 694799815, 78595689, -1439173023, -1416578800, 685225786, -333502212, -1181308536, -380569313, 772035354, 0, -915266376, 663709718, 1443496021, -777017729, -883300731, -387828385, 1907473488, -725483724, -972961871, -1255712537, 383120918, 1383877998, 1722751914, 0, -1156050682, 1952527902, -560244497, 1304305692, 1173974542, -1313227247, -201476579, -298899493, -1828496581, -1724396350, 1933643204, 1531804925, 1728655262, -955565449, 0, -69843702, -461760848, 268336768, 1446130876};
        //solutions.moveZeroes(nums);
        //int[]nums = {2,5,5,11};
        //solutions.twoSum(nums, 16);
        //int[][] matrix  = {{1,2},{3,4}};//{{1,2,3},{4,5,6},{7,8,9}};//{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        //solutions.rotate(matrix);
        
        StringSolution stringSolutions = new StringSolution();
        
        //char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};//{'h','e','l','l','o'};//{'H','a','n','n','a','h'};//{'h','e','l','l','o'};
        //stringSolutions.reverseString(s);
        
        //stringSolutions.reverse(1534236469);
        
        //stringSolutions.firstUniqChar("leetcode");

        //stringSolutions.isPalindrome("ANIta LAva LA Tina");//"A man, a plan, a canal: Panama");
        
        //stringSolutions.isAnagram("a", "b" );
        
        //stringSolutions.strStr("abc", "c");
        
        Math mathSolution = new Math();
        mathSolution.fizzBuzz(30);
    }

}

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
public class StringSolution {
    
    //#1 - Reverse String
    public void reverseString(char[] s) {
        char start;
        for(int i=0; i<s.length-1;i++){
            if(i<=(s.length-1)/2){
            start = s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=start;
        }}
        for (char m : s) {
            System.out.println(m);
        }
    }
    
    //#2 - Reverse Integer
    public int reverse(int x) {
        String number = Integer.toString(x);
        char a;
        boolean negative = false;
        StringBuilder backNumber = new StringBuilder();
        
        try{
        for(int i = 0; i<number.length();i++){
            a=number.charAt(number.length()-1-i);
            if(!(a == '-')){
            backNumber.append(a);
            }else{
                negative= true;
            }
        }
        
        System.out.println(backNumber);
        number=backNumber.toString();
        
        x=Integer.parseInt(number);
        
        if(negative) {
            x=-x;
        }
        System.out.println(x);
        return x;
        
        }catch( NumberFormatException e){
        return 0;
        }
    }
    
    //#3 - First Unique Character in a String
     public int firstUniqChar(String s) {
         boolean flag=false;
         
         for(int i = 0; i< s.length(); i++){  
             innerloop:
             for(int j=0;j<s.length();j++){
                flag=false;
                if(s.charAt(i)==s.charAt(j) && i!=j){
                   flag= true;
                   break innerloop;
                }
             }
             if(flag==false){
                 System.out.println(i);
                 return i;
             }
         }
         return -1;
    }
    
    //#4 - Valid Anagram
     public boolean isAnagram(String s, String t) {
        
         return false;
    }
     
     
    //#5 - Valid Palindrome
     public boolean isPalindrome(String s) {
         String pal;
         pal=s.replaceAll("[^a-zA-Z0-9]","");
         pal=pal.toLowerCase();
          System.out.println(pal);
         
          for(int i=0,j=pal.length()-1; i<j ;i++,j--){
              System.out.println("i: "+ i + " " + pal.charAt(i));
              
              System.out.println("j: "+j+ " " + pal.charAt(j));
              
              if(pal.charAt(i)!=pal.charAt(j)){
                  System.out.println("false");
                  return false;
              }
     }
          System.out.println("true");
         return true;
    }
     
}

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
    
}

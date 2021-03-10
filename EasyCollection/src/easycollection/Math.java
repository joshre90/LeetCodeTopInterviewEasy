/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycollection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josh
 */
public class Math {
    public List<String> fizzBuzz(int n) {
        
        List<String> list = new ArrayList<String>();
        
        for(int i = 1; i<=n ; i++){
            if(i%3 == 0 && i%5==0) list.add("FizzBuzz");
            else if(i%5==0)list.add("Buzz");
            
            else if(i%3==0)list.add("Fizz");
            else list.add(String.valueOf(i));
            
        }
        
        for(String m : list){
        System.out.println(m);
        }
        
        return list;
    }
}

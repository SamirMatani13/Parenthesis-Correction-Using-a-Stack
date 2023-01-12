// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Parenthesis {
    public static void main(String[] args) {
        
        /*Stack stk = new Stack();
        
        String s = "3+())";
        int counter = 0;
        
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stk.push(c);
            }
            else{
                if(c == ')'){
                    if(stk.isEmpty()){
                        System.out.println("False");
                    }
                    else{
                        stk.pop();
                    }
                }
            }
        
    }
        if(stk.size() == 0){
            System.out.println("Matched");
        }
        else{
            System.out.println("Mismatched");
        }
        System.out.println("Hello, World!");
        */
        brackets("())");
    }
    
    public static boolean brackets(String s){
        Stack<Character> stk = new Stack<>();  
        
        
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stk.push(c);
            }
            else{
                if(c == ')'){
                    if(stk.isEmpty()){
                        System.out.println("false");
                        return false;
                    }
                    else{
                        stk.pop();
                    }
                }
            }
        
    }
        if(stk.size() == 0){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
}
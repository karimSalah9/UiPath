/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ist.ccb;

/**
 *
 * @author IST
 */
public class test {

    public static void main(String[] args) {
          

    test n = new test();
    n.solution("Wed", 73);

   

}
     public String solution(String S, int K) {
         int Pos =0;
         int Step = 0;
        if(K>7)
        {
            System.out.println(K%7);
        Step= K%7;
        } else {
        Step=K;
        }
        
        String Result="";
        String[] Days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        for (int i = 0; i < Days.length; i++) {
        if(Days[i].equals(S)){
        Pos =i;
        
        }
        }
        int x =Pos+Step;
         System.out.println(x);
         System.out.println(Days.length);
         
        if(x > Days.length)
        {
            
        Result=Days[x-(Days.length-1)];
        
        }else{
        Result=Days[(Pos)+Step];
        }
        System.out.println(Result);

        return Result;
    }
}

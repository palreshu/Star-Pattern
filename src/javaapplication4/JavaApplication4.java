/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;



class A
     {
       void Fun(){  
     
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       }     }
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A a=new A();
       a.Fun();
    
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_romano;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calculadora_Romano {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Scanner data=new Scanner(System.in); 
        String I="1";
        String II="2";
        String III="3";
        String IV="4";
        String V="5";
        String VI="6";
        String VII="7";
        String VIII="8";
        String IX="9";
        String X="10";
        String XI="11";
        String XII="12";
        String XIII="13";
        String XIV="14";
        String XV="15";
        String XVI="16";
        String XVII="17";
        String XVIII="18";
        String XIX="19";
        String XX="20";
        String num[]={"I","II","III","IV","V","VI","VII","VIII","IX","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",};
        System.out.println("1=sumar,2=restar,3=multiplicar,4=dividir");
        int opcion=data.nextInt();
        System.out.println("ingrese primer romano(1-10)");
        String A=data.nextLine();
        System.out.println("ingrese segundo romano(1-10)");
        String B=data.nextLine();
        for (int i = 0; i <num.length; i++) {
            if(A.equals(num[i]))
                if(B.equals(num[i]+1))
                    switch(opcion){
                        case 1:
                            int A1=Integer.parseInt(A);
                            int B1=Integer.parseInt(B);
                            int resultado=A1+B1;
                            String resul=Integer.toString(resultado);
                            System.out.println(Arrays.asList(num).contains(resul));
                            
                    }
            
        }
    }
}

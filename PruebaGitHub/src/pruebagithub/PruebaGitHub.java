/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class PruebaGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,num1;
        Random rnd = new Random();
        System.out.println("Adivine el número: ");
        num1 = rnd.nextInt(0+10);
        do{
            num = leer.nextInt();
            if(num==num1)
                System.out.println("Enhorabuena, has adivinado el número.");
            else
                System.out.println("Prueba otra vez.");
    
    }while(num!=num1);
    }
    
}

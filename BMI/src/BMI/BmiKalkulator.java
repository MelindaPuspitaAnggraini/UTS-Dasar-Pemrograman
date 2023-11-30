/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI;

import java.util.Scanner;

/**
 *
 * @author Melinda
 */
public class BmiKalkulator {
    public static void main(String[] args) {
        
      Scanner hitung = new Scanner(System.in);

      System.out.print("Masukkan berat badan (kg): ");
      float berat = hitung.nextFloat();

      System.out.print("Masukkan tinggi badan (m): ");
      float tinggi = hitung.nextFloat();

      float bmi = berat/(tinggi*tinggi);
      System.out.print("Hasil BMI anda adalah " + bmi + " kg/m2");
      
           if(bmi < 18.5)
            System.out.println(" Terlalu Kurus");
        else if(bmi <25)
            System.out.println(" Normal");
        else if(bmi <30)
            System.out.println(" Gemuk");
        else if(bmi >30)
            System.out.println(" Terlalu gemuk");
    }
    
}

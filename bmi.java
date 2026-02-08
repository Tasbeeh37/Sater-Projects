import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Hello Welcome To The BMI Calculator"); 

       System.out.println("Please Enter Your Height :");
        double hight = scan.nextDouble(); 

        System.out.println("Please Enter Your Weight :");
        double weight = scan.nextDouble();

        double bmi = weight / (hight*hight);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi <=24.9) {
             System.out.println("Normal Weight");
          
        }
        else if (bmi >= 25 && bmi <=29.9 ){
            System.out.println("Overweight");
        }
        else{
          System.out.println("Obese");  
        }
        System.out.print("Your BMI Is " + bmi + " , And Based On The Calculated BMI You Have ");
        scan.close();
    }
} 
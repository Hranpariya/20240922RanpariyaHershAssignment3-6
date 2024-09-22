import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weightInPounds = scanner.nextFloat();
        System.out.print("Enter feet: ");
        int heightFeet = scanner.nextInt();
        System.out.print("Enter inches: ");
        int heightInches = scanner.nextInt();
        int totalHeightInches = (heightFeet * 12) + heightInches;
        float bmi = (weightInPounds * 703) / (totalHeightInches * totalHeightInches);
        System.out.printf("BMI is: %.2f%n", bmi);
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else if (bmi < 199.9) {
            category = "Obese";
        } else {
          category = "Yo Mama";
      }
        System.out.println("You are : " + category);
        scanner.close();
    }
}
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String menu;
		double fat;
		double carbo;
		double protein;
		double total;
		double fatpercen;
		double carbopercen;
		double proteinpercen;
		
		System.out.println("What would you like to order?");
		menu = sc.nextLine();
		
		System.out.println("How many grams of fat?");
		fat = sc.nextInt();
		fat = fat * 9;
		
		System.out.println("How many grams of carbohydrates?");
		carbo = sc.nextInt();
		carbo = carbo * 4;
		
		System.out.println("How many grams of protein?");
		protein = sc.nextInt();
		protein = protein * 4;
		
		total = fat + protein + carbo;
		
		fatpercen = (fat / total) * 100;
		carbopercen = (carbo / total) * 100;
		proteinpercen = (protein / total) * 100;
		
		
		System.out.println("Your menu purchase: " + menu
							+ "\nTotal number of calories: " + total
							+ "\nCalories in fat is : " + Math.round(fatpercen) + "%"
							+ "\nCalories in carbohydrates is : " + Math.round(carbopercen) + "%"
							+ "\nCalories in proteins is : " + Math.round(proteinpercen) + "%");	

	}

}

import java.util.*;
public class runnersRace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1, name2, name3;
		int time1, time2, time3;
		
		System.out.println("Please enter your names");
		name1 = sc.nextLine();
		name2 = sc.nextLine();
		name3 = sc.nextLine();
		
		System.out.print("Please enter the amount of minutes used to complete the race");
		time1 = sc.nextInt();
		time2 = sc.nextInt();
		time3 = sc.nextInt();
		
		if (time1 < time2 && time2 < time3){
			System.out.println("The runners, in order, are: " + name1 + " " + name2 + " " + name3);
		}
		if (time1 < time3 && time3 < time2){
			System.out.println("The runners, in order, are: " + name1 + " " + name3 + " " + name2);
		}
		if (time2 < time1 && time1 < time3){
			System.out.println("The runners, in order, are: " + name2 + " " + name1 + " " + name3);
		}
		if (time2 < time3 && time3 < time1){
			System.out.println("The runners, in order, are: " + name2 + " " + name3 + " " + name1);
		}
		if (time3 < time2 && time2 < time1){
			System.out.println("The runners, in order, are: " + name3 + " " + name2 + " " + name1);
		}
		if (time3 < time1 && time1 < time2){
			System.out.println("The runners, in order, are: " + name3 + " " + name1 + " " + name2);
		}

	}

}

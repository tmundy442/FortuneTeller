import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exit = null;

		do {
			//input first and last name
			System.out.println("Welcome to the Fortune Teller.");
			System.out.println("Enter your information to see your future.");
			String fName = null;
			System.out.println("Enter your first name.");
			fName = scanner.next();
			fName = fName.toLowerCase();

			String lName = null;
			System.out.println("Enter your last name.");
			lName = scanner.next();
			lName = lName.toLowerCase();

			//input age
			int age;
			System.out.println("Enter your age.");
			age = scanner.nextInt();

			//if age is an even number, retire in 4 years
			//if age is an odd number, retire in 5 years
			int retire;
			if (age % 2 == 0)
				retire = 4;
			else
				retire = 5;

			//enter birth month, extract first three letters
			String bMonth = null;
			System.out.println("Enter your birth month.");
			bMonth = scanner.next();
			bMonth = bMonth.toLowerCase();
			String LetterMonth1 = bMonth.substring(0, 1);
			String LetterMonth2 = bMonth.substring(1, 2);
			String LetterMonth3 = bMonth.substring(2, 3);

			//assign bank amounts based on month letters
			String FullName = fName + lName;
			String bank = null;
			if (FullName.contains(LetterMonth1)) {
				bank = "$ 100";
			} else if (FullName.contains(LetterMonth2)) {
				bank = "$ 1000";
			} else if (FullName.contains(LetterMonth3)) {
				bank = "$ 10,000";
			} else
				bank = "$5";

			//enter favorite color
			String fColor = null;
			String fLetterColor = null;
			System.out.println("Enter your favorite ROYGBIV color, or enter 'h' for help.");
			fColor = scanner.next();
			fColor = fColor.toLowerCase();
			fLetterColor = fColor.substring(0, 1);
			if (fLetterColor.equals("h")) {
				System.out.println("Enter 'r' for red, 'o' for orange, 'y' for yellow, 'g' for green, "
						+ "'b' for blue, 'i' for indigo, 'v'for violet.");
				fColor = scanner.next();
				fColor = fColor.toLowerCase();
				fLetterColor = fColor.substring(0, 1);

			}
			
			//assign transportation based on color choice
			String trans = null;
			if (fLetterColor.equals("r")) {
				trans = "Car";
			} else if (fLetterColor.equals("o")) {
				trans = "Boat";
			} else if (fLetterColor.equals("y")) {
				trans = "Train";
			} else if (fLetterColor.equals("g")) {
				trans = "Cessna";
			} else if (fLetterColor.equals("b")) {
				trans = "Bicycle";
			} else if (fLetterColor.equals("i")) {
				trans = "Unicycle";
			} else if (fLetterColor.equals("v")) {
				trans = "Motorcycle";
			}

			//enter number of siblings, assign location based on input
			int sibNumber;
			System.out.println("Enter the number of siblings you have.");
			sibNumber = scanner.nextInt();
			String location;
			if (sibNumber == 0) {
				location = "Haydenville";
			} else if (sibNumber == 1) {
				location = "McArthur";
			} else if (sibNumber == 2) {
				location = "Glouster";
			} else if (sibNumber == 3) {
				location = "Shade";
			} else

				location = "Columbus";

			//output
			System.out.println(fName + " " + lName + " will retire in " + retire + " years, with " + bank
					+ " in the bank, a vacation home in " + location + " and a " + trans + ".");

			System.out.println("Would you like to try again? Enter y/n");
			exit = scanner.next();

		} while (exit.equals("y"));
		System.out.println("Goodbye");
		scanner.close();
		System.exit(0);

	}
}

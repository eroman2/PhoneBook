package phoneBook;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		int menuReturn;
		int probNum;
		Scanner kb = new Scanner(System.in);
		String num = "";
		Person[] tempArr = new Person[10];
		String tempName = "";

		Person p1 = new Person("Peter", "Piper", "5555555555", "Elm St", "St. Louis", "MO");
		Person p2 = new Person("Bruce", "Wayne", "4444444444", "8th St", "St. Louis", "MO");
		Person p3 = new Person("Bruce", "Banner", "3333333333", "Maple Avenue", "St. Louis", "MO");
		Person p4 = new Person("Charlie", "Wayne", "2222222222", "Main St", "St. Louis", "MO");

		// Person[] phoneBook = {p1, p2, p3, p4, p5};
		Person[] phoneBook = new Person[10];
		phoneBook[0] = p1;
		phoneBook[1] = p2;
		phoneBook[2] = p3;
		phoneBook[3] = p4;

		do {
			System.out.println("-MAIN MENU-\nWelcome to the Phonebook! Select one of the following:");
			System.out.println("1. Add Entry");
			System.out.println("2. Delete Entry by phone number");
			System.out.println("3. Search");
			System.out.println("4. Update Entry");
			System.out.println("5. Print Records\n");
			System.out.println("Enter 0 to exit.");

			System.out.print("Which would you like to use. ");
			probNum = kb.nextInt();
			System.out.println("------------------------------------------------------------------------------");

			switch (probNum) {

			case 1:
				Person newP = new Person();
				System.out.println("Enter First and last name");

				String firstName = kb.next();
				newP.setFirstName(firstName);

				String lastName = kb.next();
				newP.setLastName(lastName);

				System.out.println("Enter phone number (digits only)");
				newP.setPhoneNumber(kb.next());

				System.out.println("Enter street name");
				String street = kb.next();
				street += kb.nextLine();
				newP.setStreet(street);

				System.out.println("Enter city name");
				newP.setCity(kb.nextLine());

				System.out.println("Enter state name");
				newP.setState(kb.nextLine());

				tempArr = BookMethods.AddToBook(phoneBook, newP);

				for (int i = 0; i < phoneBook.length - 1; i++) {
					phoneBook[i] = tempArr[i];
				}

				System.out.println("New entry added!");
				System.out.println("------------------------------------------------------------------------------");
				break;

			case 2:

				System.out.println("Enter the telephone number for the record you want deleted");
				String phoneNum = kb.next();

				Person[] newBook = new Person[10];

				int counter = 0;
				for (Person p : phoneBook) {
					if (p == null) {
						break;
					}

					if (p.phoneNumber.equals(phoneNum)) {
						while (counter < phoneBook.length - 1) {
							newBook[counter] = phoneBook[counter + 1];
							counter++;

						}
						break;
					}
					newBook[counter] = p;
					counter++;
				}
				tempArr = BookMethods.DeleteFromBook(phoneBook, phoneNum);

				for (int i = 0; i < phoneBook.length - 1; i++) {
					phoneBook[i] = tempArr[i];
				}
				System.out.println("Record Deleted!");
				System.out.println("------------------------------------------------------------------------------");
				break;

			case 3:
				System.out.println("Which would you like to search by?");
				System.out.println("First Name - Enter 1 \n" + "Last Name - Enter 2\n" + "Full Name - Enter 3\n"
						+ "Telephone Number - Enter 4\n" + "City - Enter 5\n" + "State - Enter 6");
				System.out.println("------------------------------------------------------------------------------");
				int searchNum = kb.nextInt();
				switch (searchNum) {

				case 1:
					System.out.println("Enter first name for desired person.");
					tempName = kb.next();
					System.out.println("Records with the name " + tempName + ":");
					BookMethods.SearchFirstName(tempName, phoneBook);
					System.out
							.println("------------------------------------------------------------------------------");

					break;

				case 2:
					System.out.println("Enter last name for desired person.");
					tempName = kb.next();
					System.out.println("Records with the last name " + tempName + ":");
					BookMethods.SearchLastName(tempName, phoneBook);
					System.out
							.println("------------------------------------------------------------------------------");
					break;

				case 3:
					System.out.println("Enter full name for desired person.");
					tempName = kb.next();
					tempName += kb.nextLine();
					System.out.println("Records with the name " + tempName + ":");
					BookMethods.SearchFullName(tempName, phoneBook);
					System.out
							.println("------------------------------------------------------------------------------");
					break;

				case 4:
					System.out.println("Enter phone Number for desired person.");
					tempName = kb.next();
					System.out.println("Records with the phone number " + tempName + ":");
					BookMethods.SearchPhoneNumber(tempName, phoneBook);
					System.out
							.println("------------------------------------------------------------------------------");
					break;
				case 5:
					System.out.println("Enter city for desired person.");
					tempName = kb.next();
					tempName += kb.nextLine();
					System.out.println("Records that belong to the city of " + tempName + ":");
					BookMethods.SearchCity(tempName, phoneBook);
					System.out
							.println("------------------------------------------------------------------------------");
					break;
				case 6:
					System.out.println("Enter State for desired person.");
					tempName = kb.next();
					tempName += kb.nextLine();
					System.out.println("Records that belong to the state of " + tempName + ":");
					BookMethods.SearchState(tempName, phoneBook);
					System.out
							.println("------------------------------------------------------------------------------");
					break;

				}

				break;

			case 4:
				System.out.println("Enter number for entry you want modified.");
				String tempNum = kb.next();
				tempNum += kb.nextLine();
				System.out.println("------------------------------------------------------------------------------");

				System.out.println("What would you like to modify?");
				System.out.println("First Name - Enter 1 \n" + "Last Name - Enter 2\n" + "Telephone Number - Enter 3\n"
						+ "City - Enter 4\n" + "State - Enter 5");
				System.out.println("------------------------------------------------------------------------------");
				int modifyNum = 0;
				modifyNum = kb.nextInt();
				switch (modifyNum) {

				case 1:
					System.out.println("Enter new first name for desired person.");
					tempName = kb.next();
					tempArr = BookMethods.UpdateFirstName(tempNum, tempName, phoneBook);
					for (int i = 0; i < phoneBook.length - 1; i++) {
						phoneBook[i] = tempArr[i];
					}
					System.out.println("Name changed!");
					System.out
							.println("------------------------------------------------------------------------------");
					break;

				case 2:
					System.out.println("Enter new last name for desired person.");
					tempName = kb.next();
					tempArr = BookMethods.UpdateLastName(tempNum, tempName, phoneBook);
					for (int i = 0; i < phoneBook.length - 1; i++) {
						phoneBook[i] = tempArr[i];
					}
					System.out.println("Name changed!");
					System.out
							.println("------------------------------------------------------------------------------");
					break;

				case 3:
					System.out.println("Enter new phone Number for desired person.");
					tempName = kb.next();
					tempArr = BookMethods.UpdatePhoneNumber(tempNum, tempName, phoneBook);
					for (int i = 0; i < phoneBook.length - 1; i++) {
						phoneBook[i] = tempArr[i];
					}
					System.out.println("Number changed!");
					System.out
							.println("------------------------------------------------------------------------------");
					break;
				case 4:
					System.out.println("Enter new city for desired person.");
					tempName = kb.next();
					tempName += kb.nextLine();
					tempArr = BookMethods.UpdateCity(tempNum, tempName, phoneBook);
					for (int i = 0; i < phoneBook.length - 1; i++) {
						phoneBook[i] = tempArr[i];
					}
					System.out.println("City changed!");
					System.out
							.println("------------------------------------------------------------------------------");
					break;
				case 5:
					System.out.println("Enter new state for desired person.");
					tempName = kb.next();
					tempName += kb.nextLine();
					tempArr = BookMethods.UpdateState(tempNum, tempName, phoneBook);
					for (int i = 0; i < phoneBook.length - 1; i++) {
						phoneBook[i] = tempArr[i];
					}
					System.out.println("State changed!");
					System.out
							.println("------------------------------------------------------------------------------");
					break;
				}

				break;

			case 5:
				System.out.println("Records of Persons:\n");
				for (Person a : phoneBook) {
					if (a == null) {
						break;
					}
					a.printPerson();
				}
				System.out.println("------------------------------------------------------------------------------");
				break;
				
			default:
				if (probNum == 0) {
					break;
				}
				System.out.println();
				System.out.println("Enter valid number.");
				System.out.println();
				System.out.println("------------------------------------------------------------------------------");
				break;

			}

		} while (probNum != 0);
		System.out.println("Goodbye.");
		kb.close();
	}

}

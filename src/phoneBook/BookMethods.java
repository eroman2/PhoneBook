package phoneBook;

import java.util.Scanner;

public class BookMethods{
	
	
	public static Person[] AddToBook(Person[] oldBook, Person newEntry){
		Person[] newBook = new Person[20];
		for (int i = 0; i < oldBook.length; i++) {
			newBook[i] = oldBook[i];
			if (oldBook[i] == null) {
				newBook[i] = newEntry;
				break;
			}
		}

		return newBook;

	}

	public static Person[] DeleteFromBook(Person[] oldBook, String num) {
		Person[] newBook = new Person[10];

		int counter = 0;
		String tempNum = "";
		for (Person p : oldBook) {
			if (p == null) {
				break;
			}

			if (p.phoneNumber.equals(num)) {
				while (counter < oldBook.length - 1) {
					newBook[counter] = oldBook[counter + 1];
					counter++;

				}
				return newBook;

			}
			newBook[counter] = p;
			counter++;

		}
		return newBook;
	}

	public static void SearchFirstName(String firstName, Person[] book) {

		firstName = firstName.toLowerCase();
		for (Person p : book) {
			if (p == null) {
				break;
			}
			String name = p.firstName.toLowerCase();
			if (name.equals(firstName)) {
				p.printPerson();
			}

		}

	}

	public static void SearchLastName(String lastName, Person[] book) {
		lastName = lastName.toLowerCase();
		for (Person p : book) {
			if (p == null) {
				break;
			}
			String name = p.lastName.toLowerCase();
			if (name.equals(lastName)) {
				p.printPerson();
			}

		}

	}

	public static void SearchFullName(String fullName, Person[] book) {
		fullName = fullName.toLowerCase();
		for (Person p : book) {
			if (p == null) {
				break;
			}
			String name = p.firstName.toLowerCase() + " " + p.lastName.toLowerCase();
			if (name.equals(fullName)) {
				p.printPerson();
			}

		}

	}

	public static void SearchPhoneNumber(String phoneNumber, Person[] book) {
		for (Person p : book) {
			if (p == null) {
				break;
			}
			String teleNum = p.phoneNumber;
			if (teleNum.equals(phoneNumber)) {
				p.printPerson();
			}

		}
	}

	public static void SearchCity(String city, Person[] book) {
		city = city.toLowerCase();

		for (Person p : book) {
			if (p == null) {
				break;
			}
			String tempCity = p.city.toLowerCase();
			if (tempCity.equals(city)) {
				p.printPerson();
			}

		}
	}

	public static void SearchState(String state, Person[] book) {
		state = state.toLowerCase();

		for (Person p : book) {
			if (p == null) {
				break;
			}
			String tempState = p.state.toLowerCase();
			if (tempState.equals(state)) {
				p.printPerson();
			}

		}

	}


	public static Person[] UpdateFirstName(String phoneNum, String newName, Person[] oldBook) {
		for (Person p : oldBook) {
			if (p == null) {
				break;
			}
			if (phoneNum.equals(p.phoneNumber)) {
				p.firstName = newName;
			}
		}
		Person[] newBook = new Person[10];
		for(int i = 0; i < oldBook.length - 1; i++) {
			newBook[i] = oldBook[i];
			if(oldBook[i] == null) {
				break;
			}
		}
		return newBook;

	}
	public static Person[] UpdateLastName(String phoneNum, String newName, Person[] oldBook) {
		for (Person p : oldBook) {
			if (p == null) {
				break;
			}
			if (phoneNum.equals(p.phoneNumber)) {
				p.lastName = newName;
			}
		}
		Person[] newBook = new Person[10];
		for(int i = 0; i < oldBook.length - 1; i++) {
			newBook[i] = oldBook[i];
			if(oldBook[i] == null) {
				break;
			}
		}
		return newBook;

	}
	public static Person[] UpdatePhoneNumber(String phoneNum, String newPhoneNum, Person[] oldBook) {
		for (Person p : oldBook) {
			if (p == null) {
				break;
			}
			if (phoneNum.equals(p.phoneNumber)) {
				p.phoneNumber = newPhoneNum;
			}
		}
		Person[] newBook = new Person[10];
		for(int i = 0; i < oldBook.length - 1; i++) {
			newBook[i] = oldBook[i];
			if(oldBook[i] == null) {
				break;
			}
		}
		return newBook;

	}
	public static Person[] UpdateCity(String phoneNum, String newCity, Person[] oldBook) {
		for (Person p : oldBook) {
			if (p == null) {
				break;
			}
			if (phoneNum.equals(p.phoneNumber)) {
				p.city = newCity;
			}
		}
		Person[] newBook = new Person[10];
		for(int i = 0; i < oldBook.length - 1; i++) {
			newBook[i] = oldBook[i];
			if(oldBook[i] == null) {
				break;
			}
		}
		return newBook;

	}
	public static Person[] UpdateState(String phoneNum, String newState, Person[] oldBook) {
		for (Person p : oldBook) {
			if (p == null) {
				break;
			}
			if (phoneNum.equals(p.phoneNumber)) {
				p.state = newState;
			}
		}
		Person[] newBook = new Person[10];
		for(int i = 0; i < oldBook.length - 1; i++) {
			newBook[i] = oldBook[i];
			if(oldBook[i] == null) {
				break;
			}
		}
		return newBook;

	}
}

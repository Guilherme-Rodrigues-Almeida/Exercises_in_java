package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Room;

public class aula10ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Room[] vect = new Room[10];
		int count = 1;
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			
			System.out.println();
			System.out.printf("Rent #%d:", count);
			System.out.println();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Room(name, email, room);
			count+=1;
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null){
				System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
				
			}		
		}
		
		sc.close();
	}

}
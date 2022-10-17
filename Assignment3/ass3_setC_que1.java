import java.util.Scanner;

import javax.swing.plaf.TextUI;

import java.io.*;

interface CreditCardInterface {
	public void viewCreditAmount();

	public void useCard();

	public void payCredit();

	public void increaseLimit();

	public boolean chk();
}

class SilverCardCustomer implements CreditCardInterface {
	protected String name;
	protected String cardnumber;
	protected float creditAmount;
	protected float creditLimit;
	static int i;

	Scanner sc = new Scanner(System.in);

	public SilverCardCustomer() {
		creditAmount = 0f;
		creditLimit = 50000f;
	}

	public boolean chk() {

		for (i = 0; i < this.cardnumber.length(); i++) {
			if (i >= 0 && i <= 9) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	public void entry() {
		System.out.printf("%30s\n", "Enter Name : ");
		this.name = sc.next() + sc.nextLine();
		System.out.printf("%30s\n", "Enter CardNumber :");
		this.cardnumber = sc.next() + sc.nextLine();
		int c;
		if (this.cardnumber.length() == 16 && chk() == true) {

			while (true) {
				System.out.printf("%33s\n", "Menu");
				System.out.printf("%40s\n", "1.View Credit Amount");
				System.out.printf("%30s\n", "2.Use Card");
				System.out.printf("%31s\n", "3.payCredit");
				System.out.printf("%35s\n", "4.increaseLimit");
				System.out.printf("%26s\n", "5.Exit");
				c = sc.nextInt();
				switch (c) {
					case 1: {
						viewCreditAmount();
					}
						break;
					case 2: {
						useCard();
					}
						break;
					case 3: {
						payCredit();
					}
						break;
					case 4: {
						increaseLimit();
					}
						break;
					case 5: {
						System.exit(0);
					}
					default:
						System.out.println("Invalid Input");
						break;
				}
			}

		} else {
			System.out.println("CardNumber must be number");
		}
	}

	public void viewCreditAmount() {

		System.out.printf("\n%10s : %10s\n", "Balance", this.creditAmount);
	}

	public void useCard() {
		float ca = sc.nextFloat();
		if (ca <= 50000) {

			this.creditAmount += ca;
			System.out.println("Transaction Successful...");
			viewCreditAmount();
		} else {
			System.out.println("Transaction Failed...");
		}

	}

	public void payCredit() {

		if(this.creditAmount >0)
		{
			float ca = sc.nextFloat();
		if (ca <= 50000) {

			this.creditAmount -= ca;
			System.out.println("Transaction Successful...");
			viewCreditAmount();
		} else {
			System.out.println("Transaction Failed...");
		}

		}
		else
		{
			System.out.println("Not enough Balance...");
		}
	}

	public void increaseLimit() {
		System.out.println("You Want To Increase Your Credit Card Limit : y/n");
		String yn = sc.next();
		if (yn == "y") {
			System.out.println("Enter Increase Limit Amount : ");
			float f = sc.nextFloat();
			this.creditLimit += f;
		} else {
			System.out.println("Going Back...");
		}

	}

}

class GoldCardCustomer extends SilverCardCustomer {
	GoldCardCustomer() {
		super.creditLimit = 100000f;

	}

	public void increaseLimit() {
		System.out.println("You Want To Increase Your Credit Card Limit : y/n");
		String yn = sc.next();
		if(yn == "y")
		{
			if (super.creditLimit == 115000f) {
				System.out.println("Limit Exced");
			} else {
				if (yn == "y") {
					System.out.println("Enter Increase Limit Amount : ");
					float f = sc.nextFloat();
					this.creditLimit += f;
				} else {
					System.out.println("Going Back...");
				}
			}
		}
	

	}
}

public class ass3_setC_que1 {

	public static void main(String[] args) {
		/*
		 * Create an interface "CreditCardInterface" with methods : viewCreditAmount(),
		 * useCard(),payCredit() and increaseLimit().
		 * Create a class SilverCardCustomer(name,cardnumber(16digits),creditAmount -
		 * initialized to 0, creditLimit - set to 50000) which implements the above
		 * interface.
		 * Inherit class GoldCardCustomer form SilverCardCustomer having the same
		 * methods but creditLimit of 1,00,000. Create an object of each class and
		 * perform operations.
		 * Display appropriate messages for success or failure of transactions.
		 * (use method overriding)
		 * 1.useCard() method increase the credit amount by a specific amount
		 * uptocreditLimit
		 * 2.payCredit() reduces the creditAmount by a specific amount
		 * 3.IncreaseLimit() increase the creditLimit for GoldCardCustoemrs(only 3
		 * times, not more than 5000 Rs. each time);
		 */
		System.out.println("Enter 1>> Silver Card Customer");
		System.out.println("Enter 2>> Gold Card Customer");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1 : {
				SilverCardCustomer s = new SilverCardCustomer();
				s.entry();
			}
			break; 
			case 2 : {
				GoldCardCustomer g = new GoldCardCustomer();
				g.entry();

			}
			break; 
			case 3 : {
				System.exit(0);
			}
			break;
			default : System.out.println("Invalid Input");
			break;
		}

	}

}
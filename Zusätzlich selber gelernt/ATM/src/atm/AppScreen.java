package atm;

public class AppScreen {
	void Welcome() {
		System.out.println("----------------------- Welcome to my ATM-App -----------------------"); 
		System.out.println("Please insert your ATM card");
		System.out.println("Note: Actual ATM machine will accept and validate a physical ATM card, read the card number and validate it.");
		Utility.PressEnterToContinue();
	}
	
	
}

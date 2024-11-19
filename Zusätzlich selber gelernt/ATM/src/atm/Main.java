package atm;

public class Main {

	public static void main(String[] args) {
		AppScreen appScreen = new AppScreen();
		appScreen.Welcome();
		
		String cardNumber = Utility.GetUserInput("your card number");		
		System.out.println("Your card number is " + cardNumber);
		
		Utility.PressEnterToContinue();
		
        
	}

}

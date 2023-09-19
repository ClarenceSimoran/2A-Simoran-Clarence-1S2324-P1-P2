import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		// Create an instance of the UserData class
        MyInfo user = new MyInfo();
        Scanner me = new Scanner(System.in);

        // Accept user input for birthplace
        System.out.print("My Birthplace : "); // Replace with user input
        String birthplace = me.nextLine();
        user.setBirthplace(birthplace);

        System.out.println();

        // Display user's information
        System.out.println("Birthplace: " + user.getBirthplace());
    }
}
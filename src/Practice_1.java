import javax.swing.JOptionPane;

public class Practice_1 {
	public static void main(String[] args) {
		//0. Create an integer variable and set it equal to 0.
		int integer = 0;
		
			//1. Make a for loop that runs 10 times and put steps 2, 3, 4 inside of it.
			for(int i = 0; i < 10; i++) {
		
			//2. Ask the user for a number
			String input = JOptionPane.showInputDialog(null, "Give a Number");
		
			//3. Convert their input to an integer
			int newNumber = Integer.parseInt(input);
		
			//4. Add the number to the integer created in step 0.
			integer += newNumber;
			}
			
		//5. Display the value of the integer created in step 0.
		JOptionPane.showMessageDialog(null, integer);
		
	}
}

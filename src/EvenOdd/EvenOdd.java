package EvenOdd;

import javax.swing.JOptionPane;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numStr, result;
		
		int num, again;
		
		do
		{
			numStr = JOptionPane.showInputDialog("Enter an Integer: ");
			
			num = Integer.parseInt(numStr);
			
			result = "That number is ";
			if (num % 2 == 0)
				result += "even.";
			else
				result += "odd.";
			
			JOptionPane.showMessageDialog(null, result);
			
			again = JOptionPane.showConfirmDialog(null, "Do again?");
		}while(again == JOptionPane.YES_OPTION);
		
	}
	
	public static boolean digitsOnly(String s)
	{
		char ch;
		
		if(s.equals(""))
			return false;
		
		for(int i = 0; i < s.length(); i++)
		{
			ch = s.charAt(i);
			if((int)ch < 43 || (int)ch > 57)
				return false;
		}
		
		return true;
	}
}

import java.util.Scanner;

package SkillBuilding;

public class Distance {

	public static void main(String[] args)
	{
		 double segment; 
		 int width; 
		 int area; 
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter the length: ");
		 length = input.nextInt();
		 System.out.print("Enter the width: ");
		 width = input.nextInt();
		 input.close();

		 area = length * width;
		 System.out.println("Area of rectangle: " + area);

	}

}

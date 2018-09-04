import cs1.Keyboard;
public class PaintCalc
{
	public static void main(String[] args)
	{
		double length, width, height, sfeet, afeet, bfeet;
		int numdoor, numwindow;


		{
			System.out.println("Enter the room dimensions below: ");
			System.out.print("Length? ");
			length = Keyboard.readDouble();
			System.out.print("Width? ");
			width = Keyboard.readDouble();
			System.out.print("Height? ");
			height = Keyboard.readDouble();
			System.out.println();
			System.out.print("How many doors does the room have? " );
			numdoor = Keyboard.readInt();
			System.out.print("How many windows does the room have? " );
			numwindow = Keyboard.readInt();
			sfeet = length*height + length*height + width*height + width*height;
			afeet = numdoor*21 + numwindow*12;
			bfeet = sfeet-afeet;
			System.out.print("Total square feet: "+bfeet+ " square feet");
			System.out.println();
		}
	}
}

package Practise;
import java.util.*;
public class CarFeatures {public static final int absIndex = 1;
public static final int rearViewCameraIndex = 2;
public static final int powerSteeringIndex = 3;
public static final int powerWindowsIndex = 4;
public static final int ACIndex = 5;
public static final int fmRadioIndex = 6;
public static final int cdPlayerIndex = 7;
public static final int mp3PlayerIndex = 8;@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

public static void main(String[] args) {
	int bitset = 0;
	System.out.println(
			"Enter the feature present in car: \n 1 ABS \n2 rearViewCamera \n3 Power Steering\n 4 Power windows\n 5 AC\n 6 FM Radio\n 7 CD Player\n 8 MP3 Player  \n 9 to exit");
	Scanner sc = new Scanner(System.in);
	int ch = -1;

	do {
		ch = sc.nextInt();
		if (ch <= 9) {
			if (ch < 9)
				bitset = addFeature(bitset, ch);
		} else {
			System.out.println("Invalid Choice");
		}
	} while (ch != 9);
	System.out.println(bitset);
	System.out.println("The features present in car are :");
	if ((bitset & (1 << absIndex)) != 0)
		System.out.println("Abs present: ");
	if ((bitset & (1 << rearViewCameraIndex)) != 0)
		System.out.println("rearViewCameraIndex present: ");
	sc.close();
}

private static int addFeature(int bitset, int absindex2) {
	int a = 1 << (absindex2);
	bitset = bitset | a;
	return bitset;
}}

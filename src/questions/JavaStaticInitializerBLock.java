package questions;

import java.util.Scanner;

public class JavaStaticInitializerBLock {
	static boolean flag;
	static int B;
	static int H;

	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		if (B > 0 && H > 0)
			flag = true;

		else
			flag = false;

		try {

			if (!flag)
				throw new Exception("java.lang.Exception: Breadth and height must be positive");
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		if (flag) {

			int area = B * H;
			System.out.print(area);

		}

	}
}

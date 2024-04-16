package Pages;

public class dempracticestrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lo = "my name is                                     ujjwal";
		String[] lop = lo.split(" ");

		// System.out.println(lop.length);

		String resultant = "";

		for (int i = 0; i <= lop.length - 1; i++) {

			if (!lop[i].equals("")) {

				resultant = resultant + lop[i] + " ";

			}

		}

		// resultant = resultant.trim();
		System.out.println(resultant);

		String name = "Ujjwal";
		String name1 = new String("Ujjwal");
		String name2 = "Ujjwal";
		if (name.equals(name1)) {

			System.out.println("true");

		} else {

			System.out.println("false");

		}

		if (name == name2) {

			System.out.println("this is an true");

		}

		else {

			System.out.println("false is an false");

		}

	}

	/*
	 * 
	 */

}

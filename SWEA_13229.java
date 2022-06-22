import java.util.Scanner;

public class SWEA_13229 {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String day = sc.next();

			System.out.print("#" + test_case + " ");
			switch (day) {
			case "MON":
				System.out.println("6");
				break;

			case "TUE":
				System.out.println("5");
				break;

			case "WED":
				System.out.println("4");
				break;

			case "THU":
				System.out.println("3");
				break;

			case "FRI":
				System.out.println("2");
				break;

			case "SAT":
				System.out.println("1");
				break;

			case "SUN":
				System.out.println("7");
				break;

			}

		}
	}
}

import java.util.Scanner;
public class BK11021 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Case #" + (i+1) + ": " + (num1+num2));
		}
		sc.close();;
		}
	}

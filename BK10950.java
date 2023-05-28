import java.util.Scanner;
public class BK10950 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int cut = sc.nextInt();
		for(int i=0; i<cut; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			sum = num1+num2;
			System.out.println(sum);
		}
		
		
	}
}

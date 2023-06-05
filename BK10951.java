import java.util.Scanner;
public class BK10951 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {//입력받는 값이 있는가 없는가 확인
			int a= sc.nextInt(), b=sc.nextInt();
			System.out.println(a+b);
		}
        sc.close();
	}
}


import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int total = 0;
		
		if (num % 2 == 0) {
			for(int i= 2; i<= num; i= i+2) {
				total += i;
			}
		}else {
			for(int i = 1; i<= num; i = i+2) {
				total += i;
			}
		}
		System.out.println("결과값: " + total);
	}

}

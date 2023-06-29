package p04;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static String getRock() {
		Random r = new Random();
		int rNum = r.nextInt(3);
		if(rNum == 0) {
			return "가위";
		}
		if(rNum == 1) {
			return "바위";
		}
		if(rNum == 2) {
			return "보";
		}
		return "";
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String rock = getRock();
		System.out.print("가위바위보 입력 : ");
		String inputRock = scan.nextLine();
		
		if(inputRock.equals("가위") && rock.equals("가위")) {
			System.out.println("비겼다");
		}
		if(inputRock.equals("가위") && rock.equals("바위")) {
			System.out.println("졌다.");
		}
		if(inputRock.equals("가위") && rock.equals("보")) {
			System.out.println("이겼다.");
		}
		
		if(inputRock.equals("바위") && rock.equals("가위")) {
			System.out.println("이겼다");
		}
		if(inputRock.equals("바위") && rock.equals("바위")) {
			System.out.println("비겼다.");
		}
		if(inputRock.equals("바위") && rock.equals("보")) {
			System.out.println("졌다.");
		}
		
		if(inputRock.equals("보") && rock.equals("가위")) {
			System.out.println("졌다");
		}
		if(inputRock.equals("보") && rock.equals("바위")) {
			System.out.println("이겼다.");
		}
		if(inputRock.equals("보") && rock.equals("보")) {
			System.out.println("비겼다.");
		}
	}

}

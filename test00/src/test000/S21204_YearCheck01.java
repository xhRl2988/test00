package test000;
import java.util.*;
public class S21204_YearCheck01 {
	public static void main(String[] args) {
		Scanner su=new Scanner(System.in);
		int y=0;
		System.out.print("현재 년도를 입력해주세요: ");
		y=su.nextInt();
		
		if(y%4==0&&y%100!=0) {
			System.out.println("입력된"+y+"년은 윤년");
		}else if(y%400==0){
			System.out.println("입력된"+y+"년은 윤년");
		}else {
			System.out.println("입력된"+y+"년은 평년");
		}	
		
		
//		또 다른 버전
//		if(y%4==0&&y%100!=0||y%400==0) {
//			System.out.println("입력된"+y+"년은 윤년");
//		}else {
//			System.out.println("입력된"+y+"년은 평년");
//		}	
		
	}
}

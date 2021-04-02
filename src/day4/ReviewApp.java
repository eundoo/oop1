package day4;

import java.util.Scanner;	

public class ReviewApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ReviewService service = new ReviewService();
		
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("1.전체 2.카테고리 3.이름 4.가격 5.번호 6.등록 7.삭제 0.종료");
			System.out.println("--------------------------------------");
			System.out.println("메뉴번호를 선택하세요: ");
			
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) {
				System.out.println("[전체 아이템 목록 출력]");
				service.printAllItems();
			} else if (menuNo == 2) {
				System.out.println("[카테고리별 아이템 목록 출력]");
				System.out.println("검색할 카테고리를 입력하세요");
				String category = sc.next();
				service.printItemByCategory(category);
			} else if (menuNo == 3) {
				System.out.println("[이름이 포함되어 있는 아이템 목록 출력]");
				System.out.println("검색할 카테고리를 입력하세요");
				String keyword = sc.next();
				service.printItemsByName(keyword);
			}
		}
		
	}
} 
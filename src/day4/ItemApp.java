package day4;

import java.util.Scanner;
public class ItemApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//Item객체에 대한 조회/검색/추가/삭제 기능을 제공하는 객체 생성
		ItemService service = new ItemService();

		while(true) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.전체 	2.카테고리		3.이름	4.가격	5.번호	6.등록	7.삭제	0.종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("메뉴번호를 선택하세요: ");					
			
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) {
				System.out.println("[아이템 전체 목록 출력]");
				service.printAllItems();
				
			} else if (menuNo == 2) {
				System.out.println("[카테고리별 아이템 목록 출력]");
				System.out.println("검색할 카테고리를 입력하세요");
				String category = sc.next();
				service.printItemsByCategory(category);
				
			} else if (menuNo == 3) {
				System.out.println("[상품명이 포함된 아이템 목록 출력]");
				System.out.println("검색할 상품명을 입력하세요");
					String keyword = sc.next();
					service.printItemsByName(keyword);
					
			} else if (menuNo == 4) {
				System.out.println("[입력된 가격범위 내에 포함된 아이템 목록 출력]");
				System.out.println("최소가격을 입력하세요");
				int min = sc.nextInt();
				System.out.println("최대가격을 입력하세요");
				int max = sc.nextInt();
				service.printItemsByPrice(min,max);
			} else if (menuNo == 5) {
				System.out.println("[아이템 번호에 해당하는 아이템 정보 출력]");
				System.out.println("조회할 아이템 번호를 입력하세요");
				int no = sc.nextInt();
				service.printItemDetail(no);
			} else if (menuNo == 6) {
				System.out.println("[신규 아이템등록]");
				System.out.println("번호를 입력하세요");
				int no = sc.nextInt();
				System.out.println("카테고리를 입력하세요:");
				String category = sc.next();
				System.out.println("이름을 입력하세요");
				String name = sc.next();
				System.out.println("제조사를 입력하세요:");
				String maker = sc.next();
				System.out.println("가격을 입력하세요:");
				int price = sc.nextInt();
				
				Item item = new Item(no, category, name, maker, price);
				service.insertItem(item);
					
				} else if (menuNo == 7) {
					System.out.println("[아이템 삭제]");
					System.out.println("삭제할 아이템 번호를 입력하세요");
					int no = sc.nextInt();
					service.deleteItem(no);
				} else if (menuNo == 0) {					
					System.out.println("프로그램을 종료합니다");
					break;
				}
		}
	}		
}
package day1;

public class BookApp {

	public static void main(String[] args) {
		// 객체 생성하기
		Book book1 = new Book();
		Book book2 = new Book(); 
		Book book3 = new Book();
								
								// 클래스명@해시코디(주민등록번호 같은것 주소값 X)
	 	System.out.println(book1); // day1.Book@1f7030a6
	 	System.out.println(book2); // day1.Book@5a1c0542

	 	
	 	book1.title = "자바의 정석";
	 	book1.writer = "남궁성";
	 	book1.publisher = "도우출판사";
	 	book1.price = 29000;
	 	book1.discountPrice = 25600;
	 	
	 	book2.title = "이것이 자바다";
	 	book2.writer = "신용권";
	 	book2.publisher = "한빛미디어";
	 	book2.price = 35000;
	 	book2.discountPrice = 31500;
	 	
	 	// 객체의 기능 사용하기
	 	System.out.println("### 첫번째 책 정보");
	 	book1.viewBookInfo();
	 	
	 	System.out.println("### 두번째 책 정보");
	 	book2.viewBookInfo();
	 	
	 	System.out.println("### 세번째 책 정보");
	 	book3.viewBookInfo();
	}

}

package day1;

public class Product {
	// 멤버변수를 정의하시오.

	
	// 상품번호, 상품카테고리, 상품평, 제조사, 가격, 재고수량, 절판여부에 대한 멤버변수를 정의하시오.
	
	
	// (no, category, name, maker, price, stock, isSoldOut)
	int no;
	String category;
	String name;
	String maker;
	int price;
	int stock;
	boolean isSoldOut;
	
	// 멤버메소드를 정의하시오

	

	// 상품정보를 화면에 출력하는 void printInfo() { ... } 메소드를 작성하시오.
	void printInfo() {
		System.out.println("#####제품정보#####");
		System.out.println("상품정보: " + no);
		System.out.println("카테고리: " + category);
		System.out.println("상품이름: " + name);
		System.out.println("제조회사: " + maker);
		System.out.println("상품가격: " + price);
		System.out.println("상품재고: " + stock);
		System.out.println("절판여부: " + isSoldOut);
	}
}

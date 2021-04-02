package day1;

public class ProductApp {

	public static void main(String[] args) {
		
		// 상품정보를 표현하는 객체를 생성하고, 객체의 멤버변수에 적절한 상품정보를 저장한다.
		Product product1 = new Product();
		
		product1.no = 1;
		product1.category = "책";
		product1.name = "씨씨허니컷구하기";
		product1.maker = "Korea";
		product1.price = 1000;
		product1.stock = 1;
		product1.isSoldOut = false;
		
		// 위에서 생성한 상품객체에 저장된 상품정보를 화면에 출력하는 메소드를 실행한다.
		
		product1.printInfo();
		

	}

}

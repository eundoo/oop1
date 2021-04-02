package day1;

public class ProductApp2 {

	public static void main(String[] args) {
		
		// 상품정보를 3개 저장하는 배열객체를 생성하기
		Product[] products = new Product[3];
		System.out.println("###배열 생성 직후 배열의 각 칸에 저장된 값 출력하기");
		System.out.println("0번째 칸: " + products[0]);
		System.out.println("0번째 칸: " + products[1]);
		System.out.println("0번째 칸: " + products[2]);
		
		// 상품정보를 담을 수 있는 Product객체 3개 생성하기
		Product p1 = new Product();
		p1.no = 100;
		p1.category = "스마트폰";
		p1.name = "아이폰12";
		p1.maker = "애플";
		p1.price = 1500000;
		p1.stock = 20;
		p1.isSoldOut = false;
		
		Product p2 = new Product();
		p1.no = 110;
		p1.category = "노트북";
		p1.name = "LG그램";
		p1.maker = "LG";
		p1.price = 2500000;
		p1.stock = 10;
		p1.isSoldOut = false;
		
		Product p3 = new Product();
		p1.no = 130;
		p1.category = "스마트워치";
		p1.name = "애플워치5";
		p1.maker = "애플";
		p1.price = 600000;
		p1.stock = 30;
		p1.isSoldOut = false;
		
		System.out.println("### 참조변수가 참조하는 객체의 정보 출력하기");
		System.out.println("p1이 참조하는 객체: " + p1);
		System.out.println("p2이 참조하는 객체: " + p2);
		System.out.println("p3이 참조하는 객체: " + p3);

		// 배열의 0번째 칸부터 2번째 칸에 생성된 Product객체를 저장하기
		products[0] = p1;	// p1참조변수가 참조하는 객체의 주소값을 배열의 0번째 칸에 대입함
		products[1] = p2;	// p2참조변수가 참조하는 객체의 주소값을 배열의 1번째 칸에 대입함
		products[2] = p3;	// p3참조변수가 참조하는 객체의 주소값을 배열의 2번째 칸에 대입함
		
		System.out.println("###배열의 각 칸에 Product객체를 저장한 후에 각 칸에 저장된 값 출력하기");
		System.out.println("0번째 칸: " + products[0]);
		System.out.println("1번째 칸: " + products[1]);
		System.out.println("2번째 칸: " + products[2]);
		
		// 모든 상품의 이름을 화면에 출력하기
		Product px = products[0];
		Product py = products[1];
		Product pz = products[2];
		System.out.println("### 배열에 각 칸에 저장된 Product객체의 상품이름을 출력하기");
		System.out.println("0번째 칸에 저장된 상품객체의 이름: " + px.name);
		System.out.println("0번째 칸에 저장된 상품객체의 이름: " + py.name);
		System.out.println("0번째 칸에 저장된 상품객체의 이름: " + pz.name);
		System.out.println("0번째 칸에 저장된 상품객체의 이름: " + products[0].name);
		System.out.println("0번째 칸에 저장된 상품객체의 이름: " + products[1].name);
		System.out.println("0번째 칸에 저장된 상품객체의 이름: " + products[2].name);
		
		//모든 상품이 이름을 향상될 for문을 사용해서 출력하기
		/*for (Product x : products) { //products -> [#222,#333,#444]
		 
			System.out.println(x.name); // x에 #222, #222로 참조되는 객체의 name값이 출력된다.
		}
		{
			System.out.println(x.name); // x에 #333, #333로 참조되는 객체의 name값이 출력된다. 
		}
		{
			System.out.println(x.name); // x에 #444, #444로 참조되는 객체의 name값이 출력된다.
		}
		*/
		
		System.out.println("###향상된 for문을 사용해서 배열에 저장된 모든 상품의 이름을 출력하기");
		for (Product x : products) { // x에는 products배열에 저장된 Product객체의 주소값이 순서대로 
			String productName = x.name;
			int productPrice = x.price;
			int productStock = x.stock;
			System.out.println(productName + ", " + productPrice + ", " + productStock);
		}
		
		System.out.println(" products 배열에 저장된 모든 상품정보 출력하기");
		for (Product item : products) {
			//sysout(item);
			System.out.println("상품번호: " + item.no);
			System.out.println("카페고리: " + item.category);
			System.out.println("상품이름: " + item.name);
			System.out.println("제조회사: " + item.maker);
			System.out.println("상품가격: " + item.price);
			System.out.println("상품재고: " + item.stock);
			System.out.println("절판여주: " + item.isSoldOut);
			System.out.println();
		}
		
		System.out.println("### products배열에 저장된 모든 상품정보를 객체의 printInfo()메소드를 실행해서 출력하기");
		for (Product item : products) {
			item.printInfo();
		}
		
		
		System.out.println("###product배열에 저장된 상품중에서 재고수량이 25개 이상인 상품의 정보만 출력하기###");
		for (Product item : products) {
			if (item.stock >= 25) {
				item.printInfo();
			}
		}
		
		System.out.println("### produc배열에 저장된 상품중에서 제품의 가격이 100만원 이상인 상품의 정보"); 
		for (Product item : products) {
			if(item.stock >=1000000) {
				item.printInfo();
			}
		}
		
		System.out.println("### products배열에 저장된 상품중에서 애플에서 제조한 상품정보면 출력하기");
		for (Product item : products) {
			if (item.maker.equals("애플")) 
				//("애플".equals(item.maker)) 이 방법이 더 좋음. 제조회사를 안넣었을경우 null인데 그때 이렇게 해야 출력이됨 -> 값을 이미 넣은것 ("애플"처럼)을 먼저 앞으로 빼라 
			{
				item.printInfo();
			}
		}
		
	}

}

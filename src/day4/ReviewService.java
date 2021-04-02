package day4;

public class ReviewService {

	Review[] reviews= new Review[100];
	int position = 0;
	
	//여기는 public안붙였잖아 생성자이고 정의부분
	ReviewService() {
		//[0]번째 [1]번째... 이렇게 쓸수도 있는데 그럴려면 100번 반복해야 되니까 position을 만들어서
		//++로 반복을(중복을) 피한다.
		reviews[position++] = new Review(101, "노트북", "맥북", "애플", 1900000);
		reviews[position++] = new Review(102, "노트북", "맥북에어", "애플", 1200000);
		reviews[position++] = new Review(103, "노트북", "맥북프로", "애플", 2500000);
		reviews[position++] = new Review(104, "노트북", "LG그램", "LG", 2000000);
		reviews[position++] = new Review(105, "노트북", "소니바이오", "소니", 1400000);
		reviews[position++] = new Review(106, "노트북", "씽크패드", "레노버", 2800000);
		reviews[position++] = new Review(107, "스마트폰", "iphone12", "애플", 1400000);
		reviews[position++] = new Review(108, "스마트폰", "iphoneSE", "애플", 600000);
		reviews[position++] = new Review(109, "스마트폰", "갤럭시S20", "삼성", 1300000);
		reviews[position++] = new Review(110, "워치", "애플워치", "애플", 500000);
		reviews[position++] = new Review(111, "워치", "갤럭시워치", "삼성", 450000);
		reviews[position++] = new Review(112, "워치", "가민945", "가민", 750000);
	}
	
	//반환값이 없는 void를 써서 printAllitems라고 내가 메소드를 만든거야.
	//여기는 배열에 저장된 모든 Review객체의 번호, 상품명, 가격을 출력할거야.
	void printAllItems() {
		System.out.println("-----------------------------------------------------------");
	  //for (Review review : reviews[0],,[1],,[2] 배열들 안에있는 값들)
		for (Review review : reviews) {
			if(review == null) {
				break;
			}
			System.out.println(review.no + "\t" + review.name + "\t" + review.price);
		}
		
	}
	
	void printItemByCategory(String category) {
		boolean isExist = false;
		
		System.out.println("-----------------------------------------------------------");
	
		//이 부분 이해 필요 null
		for (Review review : reviews) {
			if(review == null) {
				break;
			} if (review.category.equals(category)) {
				isExist = true;
				System.out.println(review.no + "\t" + review.name + "\t" + review.price);
			}
		}
		
		if(!isExist) {
			System.out.println("["+category+"]에 해당하는 아이템은 존재하지 않습니다");
		}
	}
	
	void printItemsByName(String name) {
		boolean isExist = false;
		for (Review review : reviews) {
			if (review == null) {
				break;
			}
			if (review.name.contains(name)) {
				isExist = true;
				System.out.println(review.no + "\t" + review.name + "\t" + review.price);         
			}
		}
		
		if (!isExist) {
			System.out.println("상품명에 ["+name+"]이 포함된 아이템은 존재하지 않습니다.");         
		}
		System.out.println("상품명에 ["+name+"]이 포함된 아이템은 존재하지 않습니다."); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

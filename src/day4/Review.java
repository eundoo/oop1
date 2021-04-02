package day4;

public class Review {
	
	int no;
	String category;
	String name;
	String maker;
	int price;
	
	//Review() {}라고 해도 되는데 다른데서 갖다 써야되니까 public이라고 붙인건가???
	public Review() {}
		public Review(int no, String category, String name, String maker, int price) {
			super();
			this.no = no;
			this.category = category;
			this.name = name;
			this.maker = maker;
			this.price = price;
	
	}
}
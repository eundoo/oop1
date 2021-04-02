package day4;

public class Item {
	//내가 설계도 이렇게 주제만 정의해 놓을테니까 객체를 만들애들은 공용으로 갖다써!
	int no;
	String category;
	String name;
	String maker;
	int price;

	public Item() {}
		public Item(int no, String category, String name, String maker, int price) {
			super();
			this.no = no;
			this.category = category;
			this.name = name;
			this.maker = maker;
			this.price = price;
		}
}
package day3;

public class StaticFieldSampleApp {

	public static void main(String[] args) {
		StaticFieldSample sample1 = new StaticFieldSample();
		StaticFieldSample sample2 = new StaticFieldSample();
		StaticFieldSample sample3 = new StaticFieldSample();

		sample1.increase();
		sample1.increase();
		sample1.increase();
		
		sample2.increase();
		sample2.increase();
		
		sample3.increase();
		
		//
		sample1.print();
		sample2.print();
		sample3.print();
		// 아 뭐야 맞네 void는 쌓이는거고
		// int는 그냥 그때그때 
	}

}

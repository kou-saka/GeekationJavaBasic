package objectExercise;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Mainクラスのmainメソッドでインスタンス生成と出力を行ってください。
		Apartment apartment = new Apartment();
		apartment.setName("いい感じアパートメント");
		apartment.setOwner("山田 マンション太郎");
		apartment.setType("マンション");
		apartment.setPrice(50000000);
		apartment.setLayout("3LDK");
		
		Land land = new Land();
		land.setName("いい感じの土地");
		land.setOwner("山田 土地太郎");
		land.setType("土地");
		land.setPrice(8000000);
		land.setArea(105.2);
		
		//ただし、出力する処理をMainクラスには実装しないでください。
		apartment.printInfo();
		land.printInfo();
	}
	
	

}

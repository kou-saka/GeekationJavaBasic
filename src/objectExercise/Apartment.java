package objectExercise;

public class Apartment extends Property {
	
	private String layout;
	
	public String getLayout() {
		return layout;
	}
	
	public void setLayout(String layout) {
		this.layout = layout;
	}
	
	public void printInfo() {
		System.out.println("==============================");
		System.out.println("物件名：" + getName());
		System.out.println("物件所有者名：" + getOwner());
		System.out.println("物件種別：" + getType());
		System.out.println("物件価格" + getPrice() + "円");
		System.out.println("間取り" + getLayout());
		System.out.println("==============================");
	}

}

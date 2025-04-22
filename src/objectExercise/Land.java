
package objectExercise;

public class Land extends Property{
	
	private double area;
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void printInfo() {
		System.out.println("==============================");
        System.out.println("物件名：" + getName());
        System.out.println("物件所有者名：" + getOwner());
        System.out.println("物件種別：" + getType());
        System.out.println("物件価格：" + getPrice() + "円");
        System.out.println("広さ：" + getArea() + "㎡");
        System.out.println("==============================");
	}
}

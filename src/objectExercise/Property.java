package objectExercise;

public class Property {
	private String name;
    private String owner;
    private String type;
    private int price;
    
    
    //全てのフィールドに対して、ゲッターとセッターを実装してください。
    //ゲッター
    public String getName() {
    	return name;
    }
    
    public String getOwner() {
    	return owner;
    }
    
    public String getType() {
    	return type;
    }
    
    public int getPrice() {
    	return price;
    }
    
    //セッター
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setOwner(String owner) {
    	this.owner = owner;
    }
    
    public void setType(String type) {
    	this.type = type;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }
}

package Pair2;

public class Main {

	public static void main(String[] args) {
		
		ProductDao[] productdao= {new DbLoger(),new FileLog()};
		ProductManager productmanager=new ProductManager(productdao);
		
		productmanager.save();

	}

}

package Pair2;

public class ProductManager implements ProductService {
	private ProductDao[] productdao; 
	
	public ProductManager(ProductDao [] productdao) {
		super();
		this.productdao = productdao;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		for (ProductDao productDao2 : productdao) {
			productDao2.Log();
		}
	}

}

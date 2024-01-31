import java.util.HashMap;

public class Cart {

	private HashMap<String, Integer> cartMap = new HashMap<>();

	public void addProduct(Product product, int count) {
		cartMap.put(product.getName(), getKeyCount(product.getName()) + count);
	}

	private int getKeyCount(String key) {
		return cartMap.getOrDefault(key, 0);
	}

}

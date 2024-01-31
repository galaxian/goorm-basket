import java.util.HashMap;

public class Cart {

	private HashMap<String, Integer> cartMap = new HashMap<>();

	public void addProduct(Product product, int count) {
		cartMap.put(product.getName(), getKeyCount(product.getName()) + count);
	}

	private int getKeyCount(String key) {
		return cartMap.getOrDefault(key, 0);
	}

	public void removeProduct(Product product, int count) {
		int productCnt = getKeyCount(product.getName());
		if ((productCnt - count) <= 0) {
			cartMap.remove(product.getName());
		} else {
			cartMap.put(product.getName(), productCnt - count);
		}
	}

	public void showItems() {
		for (String key : cartMap.keySet()) {
			System.out.println("상품명 = " + key + " ," + "상품수량 = " + cartMap.get(key));
		}
	}

}

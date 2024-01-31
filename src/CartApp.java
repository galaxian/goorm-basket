import java.util.HashSet;
import java.util.Set;

public class CartApp {

	public static void main(String[] args) {
		Set<Product> productSet = new HashSet<>();

		Product product1 = new Product(1L, "책", 10000);
		Product product2 = new Product(2L, "스마트폰", 1000000);
		Product product3 = new Product(3L, "옷", 50000);

		productSet.add(product1);
		productSet.add(product2);
		productSet.add(product3);

		System.out.println("고유한 상품 목록:");
		for (Product product : productSet) {
			System.out.println(product.getName()+ " " + product.getPrice());
		}

	}
}

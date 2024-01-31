import java.util.Objects;

public class Product {

	private Long id;
	private String name;
	private int price;

	public Product(Long id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Product))
			return false;
		Product product = (Product)o;
		return getPrice() == product.getPrice() && Objects.equals(getId(), product.getId())
			&& Objects.equals(getName(), product.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getPrice());
	}
}

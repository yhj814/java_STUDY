package map.test;

import java.util.Objects;

import org.json.JSONObject;

public class Product {
	private int id;
	private String name;
	private int price;
	private int stock;

	public void product() {
		;
	}

	public Product(int id, String name, int price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int number) {
		this.stock = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
	
	//메소드로 쓰기
	public JSONObject toJSONObject() {
		return new JSONObject(this);
	}

	public String toJSONString() {
		return new JSONObject(this).toString();
	}

}

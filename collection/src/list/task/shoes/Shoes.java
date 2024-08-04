package list.task.shoes;

import java.util.Objects;

public class Shoes {
	private String name;
	private String color;
	private String kind;
	private int price;
	
	public Shoes() {;}

	public Shoes(String name, String color, String kind, int price) {
		super();
		this.name = name;
		this.color = color;
		this.kind = kind;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nShoes [name=" + name + ", color=" + color + ", kind=" + kind + ", price=" + price + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoes other = (Shoes) obj;
		return name.equals(other.name); 
	}	
}

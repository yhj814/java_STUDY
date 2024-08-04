package list.task.health;

import java.util.Objects;

public class Health {
	private String name;
	private int number;
	private String kind;
	
	public Health() {;}

	public Health(Health health) {
		this(health.getName(), health.getNumber(), health.getKind());
	}
	
	public Health(String name, int number, String kind) {
		super();
		this.name = name;
		this.number = number;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "\nHealth [name=" + name + ", number=" + number + ", kind=" + kind + "]"+"\n";
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
		Health other = (Health) obj;
		return name.equals(other.name);
	}

}

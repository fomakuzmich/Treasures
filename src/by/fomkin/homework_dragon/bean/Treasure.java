package by.fomkin.homework_dragon.bean;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable{
	
	private static final long serialVersionUID = 2759370659845105766L;
	
	private String title;
	private int cost;
	
	public Treasure() {
		this("Unknown", 0);
	}

	public Treasure(String title, int cost) {
		this.title = title;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return cost == other.cost && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Treasure [title=" + title + ", cost=" + cost + "]";
	}

}

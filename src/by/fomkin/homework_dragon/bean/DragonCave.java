package by.fomkin.homework_dragon.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DragonCave implements Serializable{

	private static final long serialVersionUID = -2155893637443819989L;
	
	private List<Treasure> treasures;

	public DragonCave() {
		this(new ArrayList<Treasure>());
	}

	public DragonCave(List<Treasure> treasures) {
		this.treasures = treasures;
	}
	
	public DragonCave(Treasure...treasures) {
		this(Arrays.asList(treasures));
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	@Override
	public int hashCode() {
		return Objects.hash(treasures);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DragonCave other = (DragonCave) obj;
		return Objects.equals(treasures, other.treasures);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [treasures=" + treasures + "]";
	}

}

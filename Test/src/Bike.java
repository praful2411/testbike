
public class Bike implements Cloneable{
	
	int i;
	
	

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		if (i != other.i)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bike [i=" + i + "]";
	}

	public Bike(int i) {
		super();
		this.i = i;
	}
	
	
	
	

}

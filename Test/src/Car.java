public class Car implements Cloneable{
	
	
	int i;
	
	Bike b;

	

	public Car(int i, Bike b) {
		super();
		this.i = i;
		this.b = b;
	}



	@Override
	public String toString() {
		return "Car [i=" + i + ", b=" + b + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
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
		Car other = (Car) obj;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (i != other.i)
			return false;
		return true;
	}



	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	public Bike getB() {
		return b;
	}



	public void setB(Bike b) {
		this.b = b;
	}



	@Override
	public Object clone() throws CloneNotSupportedException {
		Bike n = new Bike(b.i);
		
		Car cc = new Car(i, n);
		return cc;
	}
	
	
	
	

}

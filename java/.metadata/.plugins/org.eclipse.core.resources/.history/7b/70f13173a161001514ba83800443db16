package car;

public class Car {
	public String nickName;

	public Car(String s) {
		nickName = s;
	}

	@Override
	public int hashCode() {
		return nickName.hashCode();
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
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (nickName != other.nickName )
			return false;
		return true;
	}
	
	
	

	
}

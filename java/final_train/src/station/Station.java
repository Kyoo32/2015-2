package station;

public abstract class Station {
	protected ClientQueue cq;
	
	abstract void calTimeInterval(Object ob);
	abstract void setDate(Object ob);
}

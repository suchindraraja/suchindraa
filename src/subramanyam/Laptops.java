package subramanyam;

public class Laptops implements Comparable
{
	public String brand;
	public int ram;
	public int cost;
	
	
	
	public Laptops(String brand, int ram, int cost) 
	{
		super();
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	public int getRam() 
	{
		return ram;
	}
	public void setRam(int ram) 
	{
		this.ram = ram;
	}
	public int getCost() 
	{
		return cost;
	}
	public void setCost(int cost) 
	{
		this.cost = cost;
	}
	@Override
	public String toString() 
	{
		return "Laptops [brand=" + brand + ", ram=" + ram + ", cost=" + cost + "]";
	}
	@Override
	public int compareTo(Object arg0) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	

}

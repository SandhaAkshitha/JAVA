
package dec_10_24;


abstract class Cars {	
		  String  brand;
		  String  model;
		  int mileage;
		  int top_speed;
		  int yearOfManufacturing;
		  public Cars()
		  {	 
		  }
		  public String carBrand()
		  {
			  return brand;
		  }
		  public String carModel()
		  {
			  return model;
		  }
		  public int carMileage()
		  {
			  return mileage;
		  }
		  public int carTopSpeed()
		  {
			  return top_speed;
		  }
		  public int carYear()
		  {
			  return yearOfManufacturing;
		  }
		  abstract public void display();
}
class Test extends Cars{
	@Override
   public  void display()
    {
		System.out.println("Car brand :"+brand);
		System.out.println("Car model :"+model);
		System.out.println("Car mileage :"+mileage);
		System.out.println("Car top_speed :"+top_speed);
		System.out.println("Car yearOfManufacturing :"+yearOfManufacturing);
    }
}
public class Car1{
	public static void main(String[] args) {
		Cars car = new Test();
		car.brand="BMW";
		car.model="micro";
		car.mileage=56;
		car.top_speed=20;
		car.yearOfManufacturing=2024;
		car.display();
	}
}


public class Car extends Kendaraan {
	Integer entSystem;
	String tipe;
	
	public Car(String type, String brand, String name, String license, Integer topSpeed, Integer capacity,
			Integer wheel, Integer entSystem, String tipe) {
		super(type, brand, name, license, topSpeed, capacity, wheel);
		this.entSystem = entSystem;
		this.tipe = tipe;
	}
	
	

	public String getTipe() {
		return tipe;
	}


	public void setTipe(String tipe) {
		this.tipe = tipe;
	}


	public Integer getEntSystem() {
		return entSystem;
	}

	public void setEntSystem(Integer entSystem) {
		this.entSystem = entSystem;
	}



	@Override
	void testDrive(String name) {
		// TODO Auto-generated method stub
		System.out.println("Turning on entertainment system...");
		if(this.tipe.equals("Supercar")) {
			System.out.println("Boosting!");
		}
	}
	


}

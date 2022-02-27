
public abstract class Kendaraan {
	String type;
	String brand;
	String name;
	String license;
	Integer topSpeed;
	Integer capacity;
	Integer wheel;
	

	public Kendaraan(String type, String brand, String name, String license, Integer topSpeed, Integer capacity,
			Integer wheel) {
		super();
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.topSpeed = topSpeed;
		this.capacity = capacity;
		this.wheel = wheel;
	}

	abstract void testDrive(String name);
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}


	public Integer getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}


	public Integer getCapacity() {
		return capacity;
	}


	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}


	public Integer getWheel() {
		return wheel;
	}


	public void setWheel(Integer wheel) {
		this.wheel = wheel;
	}

}

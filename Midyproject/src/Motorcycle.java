
public class Motorcycle extends Kendaraan{
	Integer helm;
	String tipe;



	public Motorcycle(String type, String brand, String name, String license, Integer topSpeed, Integer capacity,
			Integer wheel, Integer helm, String tipe) {
		super(type, brand, name, license, topSpeed, capacity, wheel);
		this.helm = helm;
		this.tipe = tipe;
	}

	public String getTipe() {
		return tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}

	public Integer getHelm() {
		return helm;
	}

	public void setHelm(Integer helm) {
		this.helm = helm;
	}

	@Override
	void testDrive(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name + " is standing...!");
		return;
	}


}

import java.util.ArrayList;
import java.util.Scanner;

//diinput semua validasi baru masukin ke new

public class Main {
	Scanner scan = new Scanner(System.in);
	public static ArrayList<Car> arrCar = new ArrayList<Car>();
	public static ArrayList<Motorcycle> arrMot = new ArrayList<Motorcycle>();
	
	public void printMenu() {
		System.out.println("1. Tambah Kendaraan");
		System.out.println("2. View Kendaraan => Test Drive");
		System.out.println("3. Exit");
		System.out.print("->");
	}
	
	public boolean typeValid(String tipe) {
		if(tipe.equals("Car") || tipe.equals("Motorcycle")) return true;
		System.out.println(">> Input tidak valid!");
		return false;
	}
	
	public boolean lengthFive(String brand) {
		if(brand.length() >= 5) return true;
			
		System.out.println(">> Input tidak valid!");
		return false;
	}
	
	public boolean licenseValid(String license) {
		Integer bener = 0;
		String [] arrLiscense = license.split(" ");
		
		if(arrLiscense.length == 3) {
			if(arrLiscense[0].matches("[A-Z]{1,1}?")) {
				bener++;
			}
//			System.out.println("0: " + arrLiscense[0]);
			if(arrLiscense[1].matches("[0-9]{1,4}?")) {
				bener++;
			}
//			System.out.println("1: " + arrLiscense[1]);
			if(arrLiscense[2].matches("[A-Z]{1,3}?")) {
				bener++;
			}
//			System.out.println("2: " + arrLiscense[2]);
		}
		
		if( bener == 3) return true;
		System.out.println(">> Input tidak valid!");
		return false;
	}
	
	public boolean topSpeedValid(Integer top) {
		if( (top >= 100) && (top <=250)) return true;
		
		System.out.println(">> Input tidak valid!");
		return false;
	}
	
	public boolean gasCapValid(Integer cap) {
		if( (cap >= 30) && (cap <=60)) return true;
		
		System.out.println(">> Input tidak valid!");
		return false;
	}
	
	public boolean wheelValid(Integer wheel, String type) {
		if(type.equals("Car")) {
			if((wheel >= 4) && (wheel <=6)) return true;

		}else if (type.equals("Motorcycle")) {
			if((wheel >= 2) && (wheel <=3)) return true;
		}
		
		System.out.println(">> Input tidak valid!");
		return false;
	}
	
	public boolean tipeValid(String tipe, String type) {
		if(type.equals("Car")) {
			if( (tipe.equals("SUV")) || (tipe.equals("Supercar")) || (tipe.equals("Minivan"))) return true;

		}else if (type.equals("Motorcycle")) {
			if( (tipe.equals("Automatic")) || (tipe.equals("Manual")) ) return true;
		}
		
		System.out.println(">> Input tidak valid!");
		return false;
	}
	public void printHeader() {
		System.out.println("|-----|---------------|---------------|");
		System.out.printf("|%-5s|%-15s|%-15s|", "No", "Type", "Name");
		System.out.println();
		System.out.println("|-----|---------------|---------------|");
	}
	public void printKosong() {
		for(int i=0; i<3; i++) {
			System.out.println("|-----|---------------|---------------|");
		}
	}
	public void printlist(String ymau) {
		if( ymau.equals("Car")) {
			if(arrCar.size() == 0) {
				printHeader();
				printKosong();
			} else {
				printHeader();
				for(int i=0; i<arrCar.size() ; i++) {
					System.out.printf("|%-5s|%-15s|%-15s|", i+1, arrCar.get(i).getType(), arrCar.get(i).getName());
					System.out.println();
					System.out.println("|-----|---------------|---------------|");
				}
				printKosong();
				ableTest(ymau);
				
			}		
		}else if(ymau.equals("Motorcycle")) {
			if(arrMot.size() == 0) {
				printHeader();
				printKosong();
			} else {
				printHeader();
				for(int i=0; i<arrMot.size() ; i++) {
					System.out.printf("|%-5s|%-15s|%-15s|", i+1, arrMot.get(i).getType(), arrMot.get(i).getName());
					System.out.println();
					System.out.println("|-----|---------------|---------------|");
					System.out.println();
				}
				printKosong();
				ableTest(ymau);
			}
		}else {
			System.out.println(">> Input tidak valid!");
		}
	}
	

	public void printDetil(Integer nomor, String ymau) {
		if(ymau.equals("Car")) {
			System.out.println("Brand: "+ arrCar.get(nomor).getBrand());
			System.out.println("Name: "+ arrCar.get(nomor).getName());
			System.out.println("License: "+ arrCar.get(nomor).getLicense());
			System.out.println("Type: "+ arrCar.get(nomor).getTipe());
			System.out.println("Gas Capacity: "+ arrCar.get(nomor).getCapacity());
			System.out.println("Top Speed: "+ arrCar.get(nomor).getTopSpeed());
			System.out.println("Wheel(s): "+ arrCar.get(nomor).getWheel());
			System.out.println("Entertainment System: "+ arrCar.get(nomor).getEntSystem());
			arrCar.get(nomor).testDrive(ymau);
	
		} else if(ymau.equals("Motorcycle")) {
			System.out.println("Brand: "+ arrMot.get(nomor).getBrand());
			System.out.println("Name: "+ arrMot.get(nomor).getName());
			System.out.println("License: "+ arrMot.get(nomor).getLicense());
			System.out.println("Type: "+ arrMot.get(nomor).getTipe());
			System.out.println("Gas Capacity: "+ arrMot.get(nomor).getCapacity());
			System.out.println("Top Speed: "+ arrMot.get(nomor).getTopSpeed());
			System.out.println("Wheel(s): "+ arrMot.get(nomor).getWheel());
			System.out.println("Helm: "+ arrMot.get(nomor).getHelm());
			arrMot.get(nomor).testDrive(ymau);
			System.out.print("Masukkan harga helm: ");
			Integer price = scan.nextInt();
			scan.nextLine();
			System.out.println("Price:"+ (price*arrMot.get(nomor).getHelm()));
			
		}
		
	}
	public void ableTest(String ymau) {
		System.out.println("Pick a vehicle number to test drive [Enter '0' to return] :");
		Integer nomor= scan.nextInt();
		if(nomor == 0) {
			return;
		}else {
			printDetil(nomor-1, ymau);
		}
		
	}
	public static boolean ymauValid(String ymau) {
		if(ymau.equals("Car") || ymau.equals("Motorcycle")) return true;
		System.out.println(">> Input tidak valid!");
		return false;
	}
//	======================================================
//	-------------------------------------======================
	public Main() {// wrapper class, a.ka method utama class main
		// TODO Auto-generated constructor stub
		

		Integer input;
		
		
		do {
			String type;
			String brand;
			String name;
			String license;
			Integer topSpeed;
			Integer gasCap;
			Integer wheel;
			String tipe;
			Integer esa;
			Integer helm;
			printMenu();
			
			input = scan.nextInt();
			scan.nextLine();
			
			switch (input) {
			case 1: { //add
				
				do {
					System.out.print("Input type [Car | Motorcycle]: ");
					type = scan.nextLine();
				}while(typeValid(type) == false);
//				System.out.println("ini type: " + type);
//				==================
				do {
					System.out.print("Input brand [>= 5]: ");
					brand= scan.nextLine();
				}while(lengthFive(brand) == false);
//				System.out.println("ini brand: " + brand);
				
//				====================
				do {
					System.out.print("Input name [>= 5]: ");
					name= scan.nextLine();
				}while(lengthFive(name) == false);
//				System.out.println("ini name: " + name);
//				===================
				do {
					System.out.print("Input license :");
					license = scan.nextLine();
				} while (licenseValid(license) == false);
//				=================
				do {
					System.out.print("Input top speed [100 <= topSpeed <= 250] :");
					topSpeed = scan.nextInt();
					scan.nextLine();
				} while (topSpeedValid(topSpeed) == false);
//				====================
				do {
					System.out.print("Input gas capacity [30 <= gasCap <= 60] :");
					gasCap = scan.nextInt();
					scan.nextLine();
				} while (gasCapValid(gasCap) == false);
//				=======================

				do {
					if(type.equals("Car")) {
						System.out.print("Input wheel [4 <= wheel <= 6] :");
					} else {
						System.out.print("Input wheel [2 <= wheel <= 3] :");
					}
					wheel = scan.nextInt();
					scan.nextLine();
				}while(wheelValid(wheel, type) == false);
//				========================
				if(type.equals("Car")) {
					do {
						System.out.print("Input type [SUV | Supercar | Minivan] : ");
						tipe = scan.nextLine();
					} while(tipeValid(tipe, type) == false);
				} else {
					do {
						System.out.print("Input type [Automatic | Manual] :");
						tipe = scan.nextLine();
					} while(tipeValid(tipe, type) == false);
						
				}

//				=======================
				if(type.equals("Car")) {
					
					do {
						System.out.print("Input entertainment system amount [>= 1]: ");
						esa = scan.nextInt();
						scan.nextLine();	
					} while(esa < 1);
					Car tempCar = new Car(type, brand , name, license, topSpeed, gasCap, wheel, esa, tipe);
					arrCar.add(tempCar);
				} else {
					do {
						System.out.print("Input helm amount [>=1] :");
						helm = scan.nextInt();
						scan.nextLine();
					} while(helm < 1);
					Motorcycle tempMot = new Motorcycle(type, brand, name, license, topSpeed, gasCap, wheel, helm, tipe);
					arrMot.add(tempMot);
				}
//				=============================
				
				

				break;
			} 
			case 2 : {
				String ymau;
				do {
					System.out.print("Jenis kendaraan yang ingin di test drive [Car | Motorcycle]: ");
					 ymau= scan.nextLine();
					 System.out.println(ymau);
				}while ( ymauValid(ymau) == false );
				
				printlist(ymau);

				break;
			}
		}

			
			System.out.println("ENTER to return");
			scan.nextLine();
		}while(input != 3);
		
		System.out.println("END");
		
	}

	public static void main(String[] args) {// tempat codingan di baca duluan
		// TODO Auto-generated method stub
		new Main();

	}

}

//Mitsubihi
//Triton
//B 1923 WIT
//Supercar
//55
//150
//4

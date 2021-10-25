package week3.day2;

public class Desktop implements HardWare,Software {

	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources();
		d.softwareResources();
		

	}

	public void hardwareResources() {
		System.out.println("Hardware Resources");
		
	}

	public void softwareResources() {
		System.out.println("Software Resources");
		
	}

}

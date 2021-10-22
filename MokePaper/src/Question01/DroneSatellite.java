package Question01;

public class DroneSatellite implements ISatalite {

	String name;
	
	public DroneSatellite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(this.name +"Drone Satelite Activate");
		
	}

	@Override
	public void deactivate() {
		System.out.println(this.name +"Drone Satelite Deactivate");
		
	}
 
}

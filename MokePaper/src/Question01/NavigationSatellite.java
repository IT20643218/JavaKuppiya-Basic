package Question01;

public class NavigationSatellite implements ISatalite{

	String name;

	public NavigationSatellite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(this.name +"Navigational Satelite Activate");
		
	}

	@Override
	public void deactivate() {
		System.out.println(this.name +"Navigational Satelite Activate");
		
	}
	
	
}

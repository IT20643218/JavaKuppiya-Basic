package Question01;

public class SatelliteCenter {
	private int option;
	
	ISatalite[] iSatalite;
	IGeolocation[] tracker;
	
	public SatelliteCenter(int option, ISatalite[] iSatalite, IGeolocation[] tracker) {
		super();
		this.option = option;
		this.iSatalite = iSatalite;
		this.tracker = tracker;
	}
	
	public void startService() {
		iSatalite[option].activate();
	}
	public void stopService() {
		iSatalite[option].deactivate();
	}
	public void locationService() {
		tracker[option].displayLocation();
	}
	
	
}

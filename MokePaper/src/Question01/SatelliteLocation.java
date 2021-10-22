package Question01;

public class SatelliteLocation implements IGeolocation{
		String Location;

		public SatelliteLocation(String location) {
			super();
			Location = location;
		}

		@Override
		public void displayLocation() {
			System.out.println("Satellite Location"+ this.Location);
			
		}
		
		
}

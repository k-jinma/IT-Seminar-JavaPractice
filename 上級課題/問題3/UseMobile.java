package toi3;

import java.util.ArrayList;

public class UseMobile {

	public static void main(String[] args) {

		ArrayList<Mobile> ar = new ArrayList<Mobile>();
		Mobile mob;

		Car car = new Car();
		mob = car;
		ar.add(mob);

		MotorBike motorBike = new MotorBike();
		mob = motorBike;
		ar.add(mob);

		Bicycle bicycle = new Bicycle();
		mob = bicycle;
		ar.add(mob);

		for( Mobile m : ar ) {
			m.operate();
		}
	}

}

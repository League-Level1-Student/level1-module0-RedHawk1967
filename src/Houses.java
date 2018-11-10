import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot br = new Robot();

	public static void main(String[] args) {

		br.setPenWidth(5);
		br.miniaturize();
		br.penDown();
		br.setX(50);
		br.setSpeed(1000);
		br.setY(550);
		br.turn(90);
		br.move(10);
		houses("small", "red");
		houses("small", "red");
		houses("tall", "green");
		houses("medium","red");
		houses("tall","green");
		houses("small", "blue");
		houses("medium", "red");
		houses("tall", "green");
		houses("medium", "red");

	}

	static void houses(String leg, String color) {
		br.setSpeed(100);
		int i = 10;
		if (leg.equals("small")) {
i = 60;
		} 
		if (leg.equals("medium")) {
			i = 120;
			}
		if (leg.equals("tall")) {
			i = 250;
			}
		if (color.equals("red")) { 
			br.setPenColor(255,0,0);
		}
		if (color.equals("green")) { 
			br.setPenColor(0,255,0);
		}
		if (color.equals("blue")) { 
			br.setPenColor(0,0,255);
		}
		br.turn(-90);
		br.move(i);
		if (leg .equals ("tall")) {
	peakroof	();	
		} 
		else {
			flatroof();
		}
		br.move(i);
		br.turn(-90);
		br.move(10);
	} 
	static void peakroof( ) {      
		
		br.turn(45);
		br.move(10);
		br.turn(90);
		br.move(10);
		br.turn(45);
		
		
	} 	
	static void flatroof( ) {
		br.turn(90);
		br.move(10);
		br.turn(90);

	}

}

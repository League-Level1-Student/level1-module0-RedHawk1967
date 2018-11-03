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
houses(120);
houses(190);
houses(150);
houses(140);
houses(50);
houses(170);
houses(80);
houses(30);
houses(100);

} static void houses(int i) {
br.setSpeed(1000);

br.turn(-90);
br.move(i);
br.turn(90);
br.move(10);
br.turn(90);
br.move(i);
br.turn(-90);
br.move(10);}

}

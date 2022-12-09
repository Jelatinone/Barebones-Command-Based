//Package
package frc.robot;
//Libraries
import edu.wpi.first.wpilibj.RobotBase;
//Main Runner Class
public final class Main 
{
  private Main() {}
  public static void main(String... args) {RobotBase.startRobot(Robot::new);}
}

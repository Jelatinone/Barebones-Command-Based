//Package
package frc.robot;
//Libraries
import frc.robot.commands.Command;
import frc.robot.subsystems.Subsystem;
//Robot Container Class
public class RobotContainer
 {
  //Instance Variable
  private final Subsystem m_Subsystem;
  //Primary Constructor
  public RobotContainer() 
  {
    //Define Instances
    m_Subsystem = new Subsystem();
    //Set Subsystem Default Command
    m_Subsystem.setDefaultCommand(new Command(m_Subsystem));
    //Binding Config
    configureButtonBindings();
  }
  //Configure Button Bindings to Instant Commands
  private void configureButtonBindings() {}
  //Return Autonomous Command
  public Command getAutonomousCommand() {return new Command(m_Subsystem);}
}

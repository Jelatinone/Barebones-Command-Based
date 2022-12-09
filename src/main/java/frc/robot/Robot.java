//Package
package frc.robot;
//Libraries
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
//Robot Class
public class Robot extends TimedRobot 
{
  //Instance Variables
  private Command m_autonomousCommand;
  private RobotContainer m_robotContainer;
  //Initializiation
  @Override
  public void robotInit() {m_robotContainer = new RobotContainer();}
  //Robot Periodic 
  @Override
  public void robotPeriodic() {CommandScheduler.getInstance().run();}
  //Initalize Disabled Mode
  @Override
  public void disabledInit() {}
  //Disabled Periodic
  @Override
  public void disabledPeriodic() {}
  //Initialize Autonomous Mpode
  @Override
  public void autonomousInit() 
  {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();
    if (m_autonomousCommand != null) {m_autonomousCommand.schedule();}
  }
  //Autonomous Periodic
  @Override
  public void autonomousPeriodic() {}
  //Initialize Teleoperated Mode
  @Override
  public void teleopInit() {if (m_autonomousCommand != null) {m_autonomousCommand.cancel();}}
  //Teleoperated Periodic
  @Override
  public void teleopPeriodic() {}
  //Initialize Test Mode
  @Override
  public void testInit() {CommandScheduler.getInstance().cancelAll();}
  //Test Periodic
  @Override
  public void testPeriodic() {}
  //Initialize Simulation Mode
  @Override
  public void simulationInit() {}
  //Simulation Periodic
  @Override
  public void simulationPeriodic() {}
}

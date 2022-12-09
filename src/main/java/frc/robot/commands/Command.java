//Package
package frc.robot.commands;
//Libraries
import frc.robot.subsystems.Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
//Command Class
public class Command extends CommandBase 
{
  //Warning Suprression
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  //Instance Variables
  private final Subsystem Parent_Subsytem;
  private boolean Command_Complete;

  //Primary Constructor
  public Command(Subsystem parent) 
  {
    //Define Instance Variables
    Parent_Subsytem = parent;
    Command_Complete = false;
    //Add command as Dependency
    addRequirements(Parent_Subsytem);
  }

  //Command Initialize
  @Override
  public void initialize() {}

  //Command Execution
  @Override
  public void execute() {Command_Complete = true;}

  //End Command
  @Override
  public void end(boolean interrupted) {Command_Complete = interrupted;}

  //Return Command Complete
  @Override
  public boolean isFinished() {return Command_Complete;}
}

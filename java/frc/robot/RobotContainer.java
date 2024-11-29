

package frc.robot;

import frc.robot.Constants;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.SwerveModule;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {

  public Joystick driverController = new Joystick(Constants.Controle1);

  SwerveModule swerveModule = new SwerveModule();

  double spd = 0.25;

  public RobotContainer() {
    configureBindings();
    //robotSpeed.setDefaultCommand(new DefaultDrive(robotSpeed, driverController));
    
  }

  private void configureBindings() {

    
  }

}

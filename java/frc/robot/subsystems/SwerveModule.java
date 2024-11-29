package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SwerveModule extends SubsystemBase {
    
    private CANSparkMax motorLeft1 = new CANSparkMax(Constants.motorDriver1, MotorType.kBrushless);
    private CANSparkMax motorLeft2 = new CANSparkMax(Constants.motorDriver2, MotorType.kBrushless);
    private CANSparkMax motorRight1 = new CANSparkMax(Constants.motorDriver3, MotorType.kBrushless);
    private CANSparkMax motorRight2 = new CANSparkMax(Constants.motorDriver4, MotorType.kBrushless);
    
    private CANcoder absoluteEncoder1 = new CANcoder(Constants.CAN1);
    private CANcoder absoluteEncoder2 = new CANcoder(Constants.CAN2);
    private CANcoder absoluteEncoder3 = new CANcoder(Constants.CAN3);
    private CANcoder absoluteEncoder4 = new CANcoder(Constants.CAN4);

    private Pigeon2 gyro = new Pigeon2(Constants.pigeon);
}

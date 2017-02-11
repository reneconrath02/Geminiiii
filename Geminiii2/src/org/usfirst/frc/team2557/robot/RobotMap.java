package org.usfirst.frc.team2557.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	
	public static CANTalon LeftFront;
	public static CANTalon LeftMid;
	public static CANTalon LeftBack;
	public static CANTalon RightFront;
	public static CANTalon RightMid;
	public static CANTalon RightBack;
	public static CANTalon Shooting1;
	public static CANTalon Shooting2;
	public static CANTalon Intake;
	
	public static RobotDrive drive1;
	public static RobotDrive drive2;
	
	public static DoubleSolenoid PistonUpdown;
	
	public static void init(){
		
		
		LeftFront = new CANTalon(0);
		LeftMid = new CANTalon(0);
		LeftBack = new CANTalon(0);
		RightFront = new CANTalon(0);
		RightMid = new CANTalon(0);
		RightBack = new CANTalon(0);

		Shooting1 = new CANTalon(0);
		Shooting2 = new CANTalon(0);
		Intake = new CANTalon(0); //Number will be changed to correct port when informed of correct port
		
		PistonUpdown = new DoubleSolenoid(0, 0);
	}
	
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
package org.usfirst.frc.team2557.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static DoubleSolenoid PistonUpdown;
	
	public static CANTalon Shooting1;
	
	public static CANTalon Shooting2;
	
	public static CANTalon Intake;
	
	public static CANTalon Agitator;
	
	
	public static void init(){
		PistonUpdown = new DoubleSolenoid(0, 0);
		
		Shooting1 = new CANTalon(0);
		Shooting2 = new CANTalon(0);
		
		Intake = new CANTalon(0); //Number will be changed to correct port when informed of correct port
		
		Agitator = new CANTalon(0);
		
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
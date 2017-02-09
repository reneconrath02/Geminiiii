package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2557.robot.commands.ExampleCommand;
import org.usfirst.frc.team2557.robot.commands.ShooterCommand;
import org.usfirst.frc.team2557.robot.subsystems.Shooter;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick joystick1;
	
	public static JoystickButton button1;
	public static JoystickButton button2;
	public static JoystickButton button3;
	public static JoystickButton button4;
	public static JoystickButton button5;
	public static JoystickButton button6;
	public static JoystickButton button7;
	public static JoystickButton button8;
	public static JoystickButton button9;
	public static JoystickButton button10;
	public static JoystickButton button11;
	public static JoystickButton button12;
	
	public OI(){
		joystick1 = new Joystick(0);
		
		button1 = new JoystickButton (joystick1, 1);
		button2 = new JoystickButton (joystick1, 2);
		button3 = new JoystickButton (joystick1, 3);
		button4 = new JoystickButton (joystick1, 4);
		button5 = new JoystickButton (joystick1, 5);
		button6 = new JoystickButton (joystick1, 6);
		button7 = new JoystickButton (joystick1, 7);
		button8 = new JoystickButton (joystick1, 8);
		button9 = new JoystickButton (joystick1, 9);
		button10 = new JoystickButton (joystick1, 10);
		button11= new JoystickButton (joystick1, 11);
		button12 = new JoystickButton (joystick1, 12);

		button2.whileHeld(new ShooterCommand());
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}
}


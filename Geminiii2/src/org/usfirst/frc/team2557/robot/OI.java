package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2557.robot.commands.ExampleCommand;
import org.usfirst.frc.team2557.robot.commands.intakeincommand;
import org.usfirst.frc.team2557.robot.commands.intakeoutcommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick joystick1;
	public JoystickButton joystickbutton1;
	public JoystickButton joystickbutton2;
	public JoystickButton joystickbutton3;
	public JoystickButton joystickbutton4;
	public JoystickButton joystickbutton5;
	public JoystickButton joystickbutton6;
	public JoystickButton joystickbutton7;
	public JoystickButton joystickbutton8;
	public JoystickButton joystickbutton9;
	public JoystickButton joystickbutton10;
	public JoystickButton joystickbutton11;
	public JoystickButton joystickbutton12;
	public OI(){
		joystick1 = new Joystick(0);
		
		joystickbutton1 = new JoystickButton(joystick1, 1);
		joystickbutton2 = new JoystickButton(joystick1, 2);
		joystickbutton1 = new JoystickButton(joystick1, 3);
		joystickbutton2 = new JoystickButton(joystick1, 4);
		joystickbutton1 = new JoystickButton(joystick1, 5);
		joystickbutton2 = new JoystickButton(joystick1, 6);
		joystickbutton1 = new JoystickButton(joystick1, 7);
		joystickbutton2 = new JoystickButton(joystick1, 8);
		joystickbutton1 = new JoystickButton(joystick1, 9);
		joystickbutton2 = new JoystickButton(joystick1, 10);
		joystickbutton1 = new JoystickButton(joystick1, 11);
		joystickbutton2 = new JoystickButton(joystick1, 12);
		joystickbutton1.whileHeld(new intakeincommand());
		joystickbutton2.whileHeld(new intakeoutcommand());
				
				
	}
	
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


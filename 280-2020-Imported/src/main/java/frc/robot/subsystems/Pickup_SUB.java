/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;

public class Pickup_SUB extends SubsystemBase {
  /**
   * Creates a new Pickup_SUB.
   */
  public Pickup_SUB() {
  

  }
 

  Joystick PickUpFunctions = new Joystick(4);
  WPI_TalonSRX intake = new WPI_TalonSRX(Constants.PICKUP);
  

  //CMDs for intake
  public void collect() {
    intake.set(-.75);
  }

  public void collectStop() {
    intake.set(0);
  }

  public void collectReverse(){
    intake.set(.75);
  }

  

 

  @Override
  public void periodic() {
    
    
    
    //Pick up and Reverse pick up fuctions (WORKS)
    if (PickUpFunctions.getRawButton(1)){
      collect();
    } 
    else if(PickUpFunctions.getRawButton(2)) {
      collectReverse();
      
    }else {
      collectStop();
    }
    
    
    
    
    
    }


    

    
  }


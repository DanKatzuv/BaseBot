/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package robot.subsystems.drivetrain;

import edu.wpi.first.wpilibj.command.Subsystem;
import robot.Robot;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DrivetrainSimulation extends Drivetrain {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public DrivetrainSimulation(){

    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    public void setSpeed(double leftSpeed, double rightSpeed) {
        setLeftSpeed(leftSpeed);
        setRightSpeed(rightSpeed);
    }

    public double getLeftSpeed(){
        return 0;
    }

    private void setLeftSpeed(double speed) {

    }

    public double getRightSpeed() {
        return 0;
    }

    private void setRightSpeed(double speed) {
    }

    public double getRightDistance() {
        return 0;
    }

    public double getLeftDistance(){
        return 0;
    }

    public void resetEncoders() {

    }

    public double getAngle() {
        return 0;
    }

    public double getPitch() {
        return 0;
    }

    public double getRoll() {
        return 0;
    }
}
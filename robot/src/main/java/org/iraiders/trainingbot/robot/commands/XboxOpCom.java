package org.iraiders.trainingbot.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import org.iraiders.trainingbot.robot.subsystems.DriveSubsystem;

public class XboxOpCom extends Command {
 private DriveSubsystem driveSubsystem;

 public XboxOpCom(DriveSubsystem driveSubsystem){
   this.driveSubsystem = driveSubsystem;
   requires(driveSubsystem);
 }


  XboxController xbox = new XboxController(0);

  @Override
  public void initialize(){

  }
  @Override
  protected void execute() {
    driveSubsystem.roboDrive.tankDrive(-xbox.getY(GenericHID.Hand.kLeft), -xbox.getY(GenericHID.Hand.kRight));
  }
  @Override
  protected boolean isFinished() {

    return false;
  }
}

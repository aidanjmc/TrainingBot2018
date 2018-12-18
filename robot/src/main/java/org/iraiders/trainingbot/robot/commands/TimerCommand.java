package org.iraiders.trainingbot.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import org.iraiders.trainingbot.robot.Robot;
import org.iraiders.trainingbot.robot.subsystems.DriveSubsystem;

public class TimerCommand extends TimedCommand {
  private DriveSubsystem driveSubsystem;
  public TimerCommand(String name, double timeout, DriveSubsystem driveSubsystem) {
    super(name, timeout);
    this.driveSubsystem = driveSubsystem;
    // Use requires() here to declare subsystem dependencies
    requires(Robot.exampleSubsystem);
  }



// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
    driveSubsystem.roboDrive.tankDrive(.5,.5);

	}

  @Override
  protected boolean isFinished() {
    return false;
  }


  // Called once after isFinished returns true
	@Override
	protected void end() {
    driveSubsystem.roboDrive.tankDrive(.5, .5);
	}
}

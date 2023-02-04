package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.IntakeSubsystem;

/** An example command that uses an example subsystem. */
public class OutputCubeCommand extends InstantCommand {
  
  private IntakeSubsystem mOutput;
    
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public OutputCubeCommand(IntakeSubsystem output) {
    mOutput = output;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(mOutput);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("output cube command starting");
  }

  // Called every time the scheduler runs while the command is scheduled.
  //@Override
  public void execute() {
    //double speed = this.speed;
    mOutput.outputCube();
  }
}

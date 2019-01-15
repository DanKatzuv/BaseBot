package robot.subsystems.drivetrain.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import robot.subsystems.drivetrain.pure_pursuit.Constants;
import robot.subsystems.drivetrain.pure_pursuit.Path;
import robot.subsystems.drivetrain.pure_pursuit.PurePursue;
import robot.subsystems.drivetrain.pure_pursuit.Waypoint;

/**
 *
 */
public class TestCommandGroup extends CommandGroup {

    public TestCommandGroup(PurePursue... pursues) {
        //Create the path and points.

        for (PurePursue pursue:pursues){
            addSequential(pursue);
        }
        //Print the variables for testing.
        SmartDashboard.putString("pursue command", "start");
//        SmartDashboard.putString("last waypoint", path.getWaypoint(path.length()-1).toString());
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
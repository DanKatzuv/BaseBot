package robot.subsystems.drivetrain.pure_pursuit;

import robot.subsystems.drivetrain.pure_pursuit.Constants;
import robot.subsystems.drivetrain.pure_pursuit.Path;
import robot.subsystems.drivetrain.pure_pursuit.Waypoint;

public class MainTest {


    public static void main(String[] args) {
        Path path = new Path();
        path.appendWaypoint(new Waypoint(0, 0));
        path.appendWaypoint(new Waypoint(0.9, 0));
        path.appendWaypoint(new Waypoint(1.3, -0.5));
        path.appendWaypoint(new Waypoint(5, 3));
        System.out.println(path);
        path = path.generateFillPoint();
        System.out.println(path);
        Path newPath = path.generate_smoothing(Constants.WEIGHT_DATA, Constants.WEIGHT_SMOOTH, Constants.TOLERANCE);
        System.out.println("path2");
        newPath.generateCurvature();
        newPath.generateVelocity(Constants.MAX_ACCEL);
        System.out.println(newPath);


    }
}
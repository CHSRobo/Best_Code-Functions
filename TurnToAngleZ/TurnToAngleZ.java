package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by robotics on 5/3/2017.
 */

public class TurnToAngleZ {

    DcMotor fr; // Front Right Motor // Runs in Y Direction //
    DcMotor fl; // Front Left Motor  // Runs in X Direction //
    DcMotor br; // Back Right Motor  // Runs in X Direction //
    DcMotor bl; // Back Left Motor   // Runs in Y Direction //

    void turnToAngleZ(double angle, double power) {
        if (!opModeIsActive()) {
            stopMoving();
            return;
        }
        if (angle != 0) {
            angle = angle / Math.abs(angle);
        }
        fr.setPower(power * angle);
        br.setPower(power * angle);
        fl.setPower(power * angle);
        bl.setPower(power * angle);
    }
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by robotics on 5/3/2017.
 */

public class stopMoving {

    DcMotor fr; // Front Right Motor // Runs in Y Direction //
    DcMotor fl; // Front Left Motor  // Runs in X Direction //
    DcMotor br; // Back Right Motor  // Runs in X Direction //
    DcMotor bl; // Back Left Motor   // Runs in Y Direction //

    void stopMoving() {
        fr.setPower(0);
        fl.setPower(0);
        bl.setPower(0);
        br.setPower(0);
    }
}

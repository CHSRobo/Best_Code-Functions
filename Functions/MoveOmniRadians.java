package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by robotics on 5/3/2017.
 */

public class MoveOmniRadians {
    DcMotor fr; // Front Right Motor // Runs in Y Direction //
    DcMotor fl; // Front Left Motor  // Runs in X Direction //
    DcMotor br; // Back Right Motor  // Runs in X Direction //
    DcMotor bl; // Back Left Motor   // Runs in Y Direction //
};

    void move(double angle, double power) throws InterruptedException {
        if (!opModeIsActive()) {
            stopMoving();
            return;
        }
        straighten();
        fr.setPower(-power * Math.sin((Math.PI / 180) * angle));
        bl.setPower(power * Math.sin((Math.PI / 180) * angle));
        fl.setPower(power * Math.cos((Math.PI / 180) * angle));
        br.setPower(-power * Math.cos((Math.PI / 180) * angle));
    }
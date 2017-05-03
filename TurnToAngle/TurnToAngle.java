package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by robotics on 5/3/2017.
 */

public class TurnToAngle {

    DcMotor fr; // Front Right Motor // Runs in Y Direction //
    DcMotor fl; // Front Left Motor  // Runs in X Direction //
    DcMotor br; // Back Right Motor  // Runs in X Direction //
    DcMotor bl; // Back Left Motor   // Runs in Y Direction //

    double mod;

    void turnToAngle(double angle, double power) throws InterruptedException {
        if (!opModeIsActive()) {
            stopMoving();
            return;
        }
        if (angle < 0) {
            mod = -1;
        }
        if (angle > 0) {
            mod = 1;
        }
        angle = gyro.getIntegratedZValue() - angle;
        fr.setPower(power * mod);
        br.setPower(power * mod);
        fl.setPower(power * mod);
        bl.setPower(power * mod);
        while (mod < 0 && gyro.getIntegratedZValue() <= angle) {
            sleep(5);
            telemetry.addData(">Mod <0:", mod);
            telemetry.addData(">Current angle:", gyro.getIntegratedZValue());
            telemetry.addData(">Angle:", angle);
            telemetry.update();
            if (!opModeIsActive()) {
                stopMoving();
                return;
            }
        }
        while (mod > 0 && gyro.getIntegratedZValue() >= angle) {
            sleep(5);
            telemetry.addData(">Mod>0:", mod);
            telemetry.addData(">Current angle:", gyro.getIntegratedZValue());
            telemetry.addData(">Angle:", angle);
            telemetry.update();
            if (!opModeIsActive()) {
                stopMoving();
                return;
            }
        }
        stopMoving();
    }
}
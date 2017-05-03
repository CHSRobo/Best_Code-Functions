package org.firstinspires.ftc.teamcode;

/**
 * Created by robotics on 5/3/2017.
 */

public class Straighten {

    void straighten() throws InterruptedException {
        if (!opModeIsActive()) {
            stopMoving();
            return;
        }
        int angleZ = 0;
        do {
            turnToAngleZ(angleZ, 0.2);
            sleep(25);
            stopMoving();
            sleep(5);

            angleZ = gyro.getIntegratedZValue();
        } while (Math.abs(angleZ) >= 2);
        stopMoving();
    }
}

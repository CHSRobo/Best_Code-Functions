package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cGyro;
import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

/**
 * Created by robotics on 5/3/2017.
 */

public class pressBeacon {

    OpticalDistanceSensor odsIn;
    OpticalDistanceSensor odsOut;
    ColorSensor color;
    ModernRoboticsI2cGyro gyro;
    ModernRoboticsI2cRangeSensor range;
    int time;

    void pressBeacon() throws InterruptedException {
        if(!opModeIsActive()) {stopMoving(); return;}
        move(180,0.4);
        time = 0;
        sleep(200);
        /*while(range.getDistance(DistanceUnit.CM)>10 && time < 1000){sleep(5); time+=5;} {
            sleep(5);
            telemetry.addData(">Raw:", odsIn.getRawLightDetected());
            telemetry.update();}*/
        stopMoving();
        if (isRed()) {
            move(270, 0.7);
            sleep(300);
            stopMoving();
            sleep(50);
            move(180, 1);
            sleep(900);
            stopMoving();
            sleep(50);
            move(0, 0.75);
            sleep(300);
            stopMoving();
            move(90, 0.6);
            sleep(200);
            stopMoving();
            sleep(100);
            if(!isRed()) {
                move(270, 0.3);
                while (odsOut.getRawLightDetected() < 1.5) {
                    sleep(5);
                }
                stopMoving();
                move(0,0.4);
                while(range.getDistance(DistanceUnit.CM)<9) {
                    sleep(5);
                    telemetry.addData(">Raw:", odsIn.getRawLightDetected());
                    telemetry.update();}
                stopMoving();
                move(180,0.4);
                time = 0;
                while(range.getDistance(DistanceUnit.CM)>10 && time < 200){sleep(5); time+=5;} {
                    sleep(5);
                    telemetry.addData(">Raw:", odsIn.getRawLightDetected());
                    telemetry.update();}
                stopMoving();
            }
            while (!isRed()) {
                if (!isRed()) {sleep(4700);}
                move(180, 1);
                sleep(700);
                stopMoving();
                sleep(50);
                move(0, 0.75);
                sleep(300);
                stopMoving();
                move(90, 0.6);
                sleep(200);
                stopMoving();
                sleep(100);
                move(270, 0.3);
                while(odsIn.getRawLightDetected() < 1.5) {
                    sleep(5);
                }
                stopMoving();
            }
        }
        else {
            sleep(100);
            move(90, 0.3);
            while (odsOut.getRawLightDetected() < 1.5) {
                sleep(5);
            }
            stopMoving();
            move(90, 0.4);
            sleep(200);
            stopMoving();
            sleep(50);
            move(180, 1);
            sleep(900);
            stopMoving();
            sleep(50);
            move(0, 0.75);
            sleep(300);
            stopMoving();
            move(90, 0.6);
            sleep(200);
            stopMoving();
            sleep(100);
            if (!isRed()) {
                move(270, 0.3);
                while (odsIn.getRawLightDetected() < 1.5) {
                    sleep(5);
                }
                stopMoving();
                move(0,0.4);
                while(range.getDistance(DistanceUnit.CM)<9) {
                    sleep(5);
                    telemetry.addData(">Raw:", odsIn.getRawLightDetected());
                    telemetry.update();}
                stopMoving();
                move(180,0.4);
                time = 0;
                while(range.getDistance(DistanceUnit.CM)>10 && time < 1000){sleep(5); time+=5;} {
                    sleep(5);
                    telemetry.addData(">Raw:", odsIn.getRawLightDetected());
                    telemetry.update();}
                stopMoving();
            }
            while (!isRed()) {
                if (!isRed()) {sleep(4700);}
                move(180, 1);
                sleep(700);
                stopMoving();
                sleep(50);
                move(0, 0.75);
                sleep(300);
                stopMoving();
                move(90, 0.6);
                sleep(200);
                stopMoving();
                sleep(100);
                move(270, 0.3);
                while(odsIn.getRawLightDetected() < 1.5) {
                    sleep(5);
                }
                stopMoving();
            }
        }
        stopMoving();
    }
}

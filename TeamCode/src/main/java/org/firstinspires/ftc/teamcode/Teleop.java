package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Teleop extends LinearOpMode {
    @Override
    public void runOpMode() {
        DcMotor frontRight = hardwareMap.dcMotor.get("front_right");
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRight.setPower(0);
        waitForStart();
        frontRight.setPower(0);
        while (opModeIsActive()){
            frontRight.setPower(1);
            delay(500);
            break;
            //this is a test number 2
        }
    }
    public void delay(int delayTimeMillis){
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < delayTimeMillis){
            telemetry.addData("Waiting for ",(System.currentTimeMillis() - startTime) + "/" + (delayTimeMillis) + " milliseconds");
            telemetry.update();
        }

    }
}

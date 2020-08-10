package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Teleop extends LinearOpMode {
    @Override
    public void runOpMode() {
        DcMotor frontright = hardwareMap.dcMotor.get("front_right");

        waitForStart();

        while (opModeIsActive()){
            frontright.setPower(0);
            break;
        }
    }
}

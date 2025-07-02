package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public final class SquareAuto extends LinearOpMode {
    @Override
    public void runOpMode() {
        Pose2d beginPose = new Pose2d(0, 0, 0);
        MecanumDrive drive = new MecanumDrive(hardwareMap, beginPose);

        waitForStart();
        while (opModeIsActive()) {
            Actions.runBlocking(
                    drive.actionBuilder(beginPose)
                            .strafeTo(new Vector2d(24.0, 0.0))
                            .strafeTo(new Vector2d(24.0, 24.0))
                            .strafeTo(new Vector2d(0.0, 24.0))
                            .strafeTo(new Vector2d(0.0, 0.0))
                            .build());
        }
    }
}

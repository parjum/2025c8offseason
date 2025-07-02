package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public final class CircleAuto extends LinearOpMode {
    @Override
    public void runOpMode() {
        Pose2d beginPose = new Pose2d(0, 0, 0);
        MecanumDrive drive = new MecanumDrive(hardwareMap, beginPose);

        waitForStart();
        while (opModeIsActive()) {
            Actions.runBlocking(
                    drive.actionBuilder(beginPose)
                            .splineTo(new Vector2d(24, 24), Math.PI / 2)
                            .splineTo(new Vector2d(0, 48), Math.PI)
                            .splineTo(new Vector2d(-24, 24), Math.PI * 3/2)
                            .splineTo(new Vector2d(0, 0), 0)
                            .build());
        }
    }
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Test extends OpMode {
	private DcMotorEx left, right, arm;
	private Servo leftClaw, rightClaw;

	@Override
	public void init() {
		left = hardwareMap.get(DcMotorEx.class, "left");
		left.setDirection(DcMotorSimple.Direction.FORWARD);
		right = hardwareMap.get(DcMotorEx.class, "right");
		right.setDirection(DcMotorSimple.Direction.REVERSE);
		arm = hardwareMap.get(DcMotorEx.class, "arm");
		arm.setDirection(DcMotorSimple.Direction.FORWARD);
		arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
		leftClaw = hardwareMap.get(Servo.class, "left-claw");
		rightClaw = hardwareMap.get(Servo.class, "right-claw");
	}
	
	@Override
	public void loop() {
		left.setPower(-gamepad1.left_stick_y);
		right.setPower(-gamepad1.right_stick_y);

		arm.setPower(-gamepad2.right_stick_y * 0.5);

		if (gamepad2.right_bumper) {
			leftClaw.setPosition(0.5);
			rightClaw.setPosition(0.5);
		}
		else {
			leftClaw.setPosition(0.28);
			rightClaw.setPosition(0.72);
		}
	}
}

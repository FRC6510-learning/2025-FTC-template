package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
public class Test extends OpMode {
	private DcMotorEx left, right;
	@Override
	public void init() {
		left = hardwareMap.get(DcMotorEx.class, "left");
		right = hardwareMap.get(DcMotorEx.class, "right");
	}
	
	@Override
	public void loop() {
		telemetry.addData("test data", "goodbye, world");
		left.setPower(-gamepad1.left_stick_y);
		right.setPower(-gamepad1.right_stick_y);
	}
}

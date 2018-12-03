package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Contains all pieces of Hardware used on Robot
 */
public class HardwareManager {

    HardwareMap hardwareMap;

    //Drivetrain Motors
    public DcMotor leftFrontDrive;
    public DcMotor rightFrontDrive;
    public DcMotor leftRearDrive;
    public DcMotor rightRearDrive;

    //Elevator Linear Actuators
    public LinearActuator leftActuator;
    public LinearActuator rightActuator;

    //Latching Mechanism Servo
    public Servo latch;

    public HardwareManager(HardwareMap hardwareMap)
    {
        this.hardwareMap = hardwareMap;
    }

    private void initDrivetrain()
    {
        leftFrontDrive = hardwareMap.get(DcMotor.class, HardwareNames.leftFrontDriveMotor);
        rightFrontDrive = hardwareMap.get(DcMotor.class, HardwareNames.rightFrontDriveMotor);
        leftRearDrive = hardwareMap.get(DcMotor.class, HardwareNames.leftRearDriveMotor);
        rightRearDrive = hardwareMap.get(DcMotor.class, HardwareNames.rightRearDriveMotor);
    }

    private void initElevator()
    {
        leftActuator = new LinearActuator(hardwareMap.get(DcMotor.class, HardwareNames.leftElevatorActuator));
        rightActuator = new LinearActuator(hardwareMap.get(DcMotor.class, HardwareNames.rightElevatorActuator));
    }
    private void initLatchingMechanism()
    {
        latch = hardwareMap.get(Servo.class, HardwareNames.latchingServo);
    }
}

package frc.robot.subsystems.groundIntake;
import org.littletonrobotics.junction.AutoLog;

public interface GroundIntakeIO {
    @AutoLog
    public static class GroundIntakeIOInputs {
        /** 
         * Some of these may be unnecessary if no
         * NEOs are used.
         */
        public double velocityRadsPerSec = 0.0;
        public double appliedVoltage = 0.0;
        public double speedSetpoint = 0.0;
        public double[] currentAmps = new double[] {};
        public double[] tempCelcius = new double[] {};
    }

    /** updates inputs from robot */
    public default void updateInputs(GroundIntakeIOInputs inputs) {}
    /** sets voltage to run motor if necessary */
    public default void setVoltage(double voltage) {}
    /** sets velocity setpoint */
    public default void setPIDConstants(double p, double i, double d) {}
    
    public default void stop() {
        setVoltage(0.0);
    }

    /** sets brake mode */
    public default void setBrake(boolean brake) {}

    public default void setSpeed(double speed) {}

    public default void setP(double p) {}
    
    public default void setI(double i) {}

    public default void setD(double d) {}

    public default double getP() { return 0.0; }

    public default double getI() { return 0.0; }

    public default double getD() { return 0.0; }
}

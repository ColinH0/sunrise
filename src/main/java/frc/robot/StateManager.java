package frc.robot;
import org.littletonrobotics.junction.Logger;

public class StateManager extends VirtualSubsystem {
    private static StateManager mInstance;

    public static StateManager getInstance() {
        if (mInstance == null) {
            mInstance = new StateManager();
        }

        return mInstance;
    }


    // What state were in
    public State state;

    public enum State{
        LowPickup(),
        //potential useful stuff: LowPickup, StowHigh, LowScore, HighScore, StowLow, StowInFrame, MidScore
    }

    /* make a new constructor thing and make a swtich statment between all of the scoring methods (low mid high)
     * public Setpoints getSetpoints() {
        switch (){
            case xxx;
                return xxx;
            case xxx;
                return xxx;
            case xxx;
                return xxx;
        } }      
    */


    /*
    make new constructors to define constants if needed
    example:
      public void stowHigh(){
           state = State.StowInFrame;
           setSetpoints();
      }
     */




    @Override
    public void periodic() {
        Logger.recordOutput("StateManager/State", state.toString());
    }

}

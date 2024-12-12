public class LiftModel {

    private LiftView liftView;
    private String assignedLift;

    public LiftModel(LiftView liftView)
    {
        this.liftView=liftView;
    }

    public String getAssignedLift()
    {
        return assignedLift;
    }

    public void assignLift(int[] liftArray, int source, int destination)
    {
        assignedLift="L1";
        liftArray[0]=destination;
        
    }
}

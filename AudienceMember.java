/**
 * AudienceMember class that simulates a person in an audience
 */
public class AudienceMember
{
    private int count = 0; // number of actions performed
    


    /**
     * simulate an audience member clapping
     */
    public void clap()
    {
        System.out.println("clap");
        count = count + 1;
    }

    /**
     * simulate an audience member standing up
     */
    public void stand()
    {
        System.out.println("stand");
        count = count + 1;
    }

    /**
     * simulate an audience member sitting down
     */
    public void sit()
    {
        System.out.println("sit");
        count = count + 1;
    }
    
    /**
     * returns the number of actions the audience member has performed
     */
    public int count()
    {
        return count;
    }
}

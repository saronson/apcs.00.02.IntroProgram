/**
 * Die class that simulates rolling a 6 sided die.
 */
public class Die
{
    private int count = 0; // how many rolls have been made

    /**
     * roll 6-sided die
     */
    public int roll()
    {
        count = count + 1;
        return (int)(Math.random()*6+1);
    }

    /**
     * return how many rolls have been made
     */
    public int numRolls()
    {
        return count;
    }

    /**
     * reset the roll count to 0
     */
    public void reset()
    {
        count = 0;
    }

}

/**
 * Whiteboard class that simulates a whiteboard
 */
public class Whiteboard
{
    /**
     * draw a square to the whiteboard
     */
    public void drawSquare()
    {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ----");
    }
    
    /**
     * draw a circle to the whiteboard
     */
    public void drawCircle()
    {
        System.out.println("O");
    }
    
    /** 
     * draw text to the whiteboard
     */
    public void drawText(String str)
    {
        System.out.println(str);
    }
    
    /** 
     * draw a number to the whiteboard
     */
    public void drawText(int num)
    {
        System.out.println(""+num);
    }
    
    /**
     * clear the whole whiteboard
     */
    public void clear()
    {
        System.out.println("\f");
    }
}

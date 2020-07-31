import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

/**
 * @author  Aronson
 */
public class TestYourProgram
{
    public static void main(String args[]) {
        TestYourProgram test = new TestYourProgram();
        test.testAudienceMember();
        test.testWhiteboard();
        test.testDie();
    }

    @Test
    public void testAudienceMember()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        YourProgram yp = new YourProgram();
        // action
        yp.programAudienceMember();

        String temp = bos.toString();
        temp = temp.replace("\r", "").trim();
        temp = temp.replace("\n", "").trim();
        // assertion
        assertEquals("standclapsit", temp);

        // undo the binding in System
        System.setOut(originalOut);
    }


    @Test
    public void testWhiteboard()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        YourProgram yp = new YourProgram();
        // action
        yp.programWhiteboard();
        String temp = bos.toString();
        temp = temp.replace("\r", "").trim();
        temp = temp.replace("\n", "").trim();
        String ans = "----|    ||    | ----Hello world!";
        // assertion
        assertEquals(ans, temp);

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testDie()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        YourProgram yp = new YourProgram();
        // action
        yp.programDie();

        String temp = bos.toString();
        temp = temp.replace("\r", "").trim();
        temp = temp.replace("\n", "").trim();
        // assertion
        assertEquals(4, temp.length());

        // undo the binding in System
        System.setOut(originalOut);
    }
}

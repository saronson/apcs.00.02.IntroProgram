import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

/**
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        System.out.println("Testing 02.IntroProgram...");

        TestManager.insertStatus("0");
        TestManager.insertAttempt("0");
        TestMain test = new TestMain();
        test.testAudienceMember();
        test.testWhiteboard();
        test.testDie();
        System.out.println("Finished");
        TestManager.insertAttempt("done");
        TestManager.insertStatus("done");

        System.out.println("Running playAround...");
        Main yp = new Main();
        yp.playAround();
    }

    @Test
    public void testAudienceMember()
    {
        System.out.println("Testing AudienceMember...");

        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        Main yp = new Main();
        // action
        yp.programAudienceMember();

        String temp = bos.toString();
        // undo the binding in System
        System.setOut(originalOut);
        System.out.println(temp);
        temp = temp.replace("\r", "").trim();
        temp = temp.replace("\n", "").trim();


        // assertion
        assertEquals("Should stand clap sit", "standclapsit", temp);
        System.out.println("Success!");

        TestManager.insertAttempt("1");
        TestManager.insertStatus("1");

    }

    @Test
    public void testWhiteboard()
    {
        System.out.println("Testing Whiteboard...");
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        Main yp = new Main();
        // action
        yp.programWhiteboard();
        String temp = bos.toString();
        // undo the binding in System
        System.setOut(originalOut);
        System.out.println(temp);
        temp = temp.replace("\r", "").trim();
        temp = temp.replace("\n", "").trim();
        String ans = "----|    ||    | ----Hello world!";

        // assertion
        assertEquals("Should be Hello World!", ans, temp);
        System.out.println("Success!");

        TestManager.insertAttempt("2");
        TestManager.insertStatus("2");
    }

    @Test
    public void testDie()
    {
        System.out.println("Testing Die...");
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        Main yp = new Main();
        // action
        yp.programDie();

        String temp = bos.toString();
        // undo the binding in System
        System.setOut(originalOut);
        System.out.println(temp);
        temp = temp.replace("\r", "").trim();
        temp = temp.replace("\n", "").trim();

        // assertion
        assertEquals("Should be 4", 4, temp.length());
        System.out.println("Success!");

        TestManager.insertAttempt("3");
        TestManager.insertStatus("3");

    }
}
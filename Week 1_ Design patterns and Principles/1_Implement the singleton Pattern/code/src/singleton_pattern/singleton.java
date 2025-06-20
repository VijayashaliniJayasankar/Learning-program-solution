package singleton_pattern;
import java.util.Scanner;
public class singleton {
public static void main(String args[]) {
	logger logger1 = logger.getInstance();
    logger logger2 = logger.getInstance();

    logger1.log("First message");
    logger2.log("Second message");

    if (logger1 == logger2) {
        System.out.println("Both logger instances are the same. Singleton works!");
    } else {
        System.out.println("Different instances exist. Singleton failed.");
    }
}
}

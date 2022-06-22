import java.lang.reflect.Constructor;
import java.util.Scanner;
import javax.swing.*;

public class exercise {
    String name;
    int average;

    public exercise(int average, String name) {
        this.name = name;
        if (average >= 0)
            if (average <= 100) {
                this.average = average;
            }
    }

    public String getName() {
        return name;

    }

    public String getAverage() {
        String letterCode = "";
        if (average >= 85) {
            letterCode = "A";

        } else if (average >= 75) {
            letterCode = "B";

        } else {
            letterCode = "O";
        }
        return letterCode;
    }

    public static void main(String[] args) {
        exercise grade = new exercise(55, "sam");
        System.out.printf("your Average is %s and average is %s", grade.getAverage(), grade.name);

    }

}
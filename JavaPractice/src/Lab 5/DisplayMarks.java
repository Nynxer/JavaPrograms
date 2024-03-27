class Student {
    int rollNo;

    void setRollNo(int n) {
        rollNo = n;
    }

    void displayRollNo() { // Use display for consistency
        System.out.println("Roll Number: " + rollNo);
    }
}

class Test extends Student {
    float part1, part2;

    void setMarks(float m1, float m2) { // Use a setter method for consistency
        part1 = m1;
        part2 = m2;
    }

    void displayMarks() {
        System.out.println("Part 1 marks: " + part1);
        System.out.println("Part 2 marks: " + part2);
    }
}

interface Sports {
    float SPORT_OUT = 10.0f;

    void displaySportsMarks();
}

class Result extends Test implements Sports {
    float totalMarks;

    @Override
    public void displaySportsMarks() {
        System.out.println("Sports marks: " + SPORT_OUT);
    }

    void calculateTotalMarks() {
        totalMarks = part1 + part2 + SPORT_OUT;
    }

    void displayTotalMarks() {
        calculateTotalMarks();
        System.out.println("Total score: " + totalMarks);
    }
}

public class DisplayMarks {
    public static void main(String[] args) {
        Result student = new Result();
        student.setRollNo(123);
        student.setMarks(75.5f, 88.0f);
        student.displayRollNo();
        student.displayMarks();
        student.displaySportsMarks();
        student.calculateTotalMarks();
        student.displayTotalMarks();
    }
}

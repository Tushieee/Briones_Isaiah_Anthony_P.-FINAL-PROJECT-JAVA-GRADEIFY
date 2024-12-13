import java.util.Scanner;

abstract class GradingSystem {
    private int score; 
    private int overallItems; 

    public void setScore(int score) {
        this.score = score;
    }

    public void setOverallItems(int overallItems) {
        this.overallItems = overallItems;
    }

    public int getScore() {
        return score;
    }

    public int getOverallItems() {
        return overallItems;
    }

    public abstract char calculateGrade();
}

class StandardGrading extends GradingSystem {
    @Override
    public char calculateGrade() {
        if (getOverallItems() == 0) { 
            System.out.print("Overall items cannot be zero.");
        }
        double percentage = (double) getScore() / getOverallItems() * 100;
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

class PassFailGrading extends GradingSystem {
    @Override
    public char calculateGrade() {
        if (getOverallItems() == 0) { 
            System.out.print("Overall items cannot be zero.");
        }
        double percentage = (double) getScore() / getOverallItems() * 100;
        if (percentage >= 60) {
            return 'P'; 
        } else {
            return 'F';
        }
    }
}

public class Gradeify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradingSystem gradingSystem = null;
        System.out.println("\t\t\t\t      _========================================_  ");
        System.out.println("\t\t\t\t     //                                        \\\\   ");
        System.out.println("\t\t\t\t     ||                                        ||  ");
        System.out.println("\t\t\t\t     ||          Welcome to the Gradeify       ||  ");
        System.out.println("\t\t\t\t     ||                                        ||  ");
        System.out.println("\t\t\t\t     ||          <1> Standard Grading          ||  ");
        System.out.println("\t\t\t\t     ||          <2> Pass/Fail Grading         ||  ");
        System.out.println("\t\t\t\t     ||          <3> Exit Program              ||  ");
        System.out.println("\t\t\t\t     ||                                        ||  ");
        System.out.println("\t\t\t\t     \\\\                                        //");
        System.out.println("\t\t\t\t      -========================================-  ");
        System.out.println("\t\t\t\t                        |      | ");
        System.out.println("\t\t\t\t                      __|______|__ ");
        System.out.println("\t\t\t\t                     [------------] ");        
        System.out.print("\n\t\t\t\t\t  Enter Your Choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            gradingSystem = new StandardGrading();
        } else if (choice == 2) {
            gradingSystem = new PassFailGrading();
        } else if (choice == 3) {
            System.out.println("Exiting program...");
            scanner.close();
            return;
        } else {
            System.out.println("Invalid choice. Exiting.");
            scanner.close();
            return;
        }

        System.out.println("\n\n\t\t\t\t\t    ╔═══════════════════════════╗");
        System.out.println("\t\t\t\t        ════║ Enter Number of Subjects  ║════");
        System.out.println("\t\t\t\t\t    ╚═══════════════════════════╝");
        System.out.print("\n\t\t\t\t\t\t    Enter here: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("\t\t\t\t\t\t    ═════════════════\n\n");

        String[] subjects = new String[numSubjects];
        int[] overallItems = new int[numSubjects];
        int[] scores = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("\t\t\t\t\t      Enter name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();
            System.out.print("\t\t\t\t\t      Enter Overall Items for " + subjects[i] + ": ");
            overallItems[i] = scanner.nextInt();
            System.out.print("\t\t\t\t\t      Enter Score for " + subjects[i] + ": ");
            scores[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\t\t\t\t\t    -----------------------------------\n\n");
        }

        System.out.println("\n\nResults:");
        for (int i = 0; i < numSubjects; i++) {
            gradingSystem.setScore(scores[i]);
            gradingSystem.setOverallItems(overallItems[i]); 
            char grade = gradingSystem.calculateGrade();
            System.out.println("\t" + subjects[i] + " | Overall Items: " + overallItems[i] + " | Score: " + scores[i] + " | Grade: " + grade);
        }
        scanner.close();
    }
}

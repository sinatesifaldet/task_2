public class savingsVSinterest {
    public static void main(String[] args) {
        // Customer deposit entered as a whole number
        int deposit = 500000;

        // Interest rate as a decimal
        double interestRate = 0.05; // 5%

        // IMPLICIT CONVERSION: int automatically becomes double
        // Safe — no data lost, because double can hold everything int can, plus decimals
        double depositAsDouble = deposit; // no cast needed here
        double interestEarned = depositAsDouble * interestRate;

        System.out.println("Deposit (int): " + deposit);
        System.out.println("Interest earned (double, precise): " + interestEarned);

        // EXPLICIT CONVERSION: double to int for a rounded report
        // Must cast manually — we're narrowing, so precision can be lost
        int roundedInterest = (int) interestEarned; // truncates the decimal part
        System.out.println("Rounded interest for report (explicit cast): " + roundedInterest);

        // A better way to round properly instead of just truncating
        long properlyRounded = Math.round(interestEarned);
        System.out.println("Properly rounded interest: " + properlyRounded);

        // Showing how much accuracy was lost
        System.out.println("\n--- Data Accuracy Note ---");
        System.out.println("Original precise value: " + interestEarned);
        System.out.println("After explicit cast (truncated): " + roundedInterest);
        System.out.println("Difference lost: " + (interestEarned - roundedInterest));
    }
}


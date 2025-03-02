

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 370;
        int t1 = num;
        int len = 0;

        // Step 1: Find the number of digits (length)
        while (t1 != 0) {
            len++;
            t1 = t1 / 10;
        }

        int t2 = num;
        int arm = 0;

        // Step 2: Compute Armstrong sum
        while (t2 != 0) {
            int rem = t2 % 10;
            int mul = 1;

            // Multiply 'rem' exactly 'len' times
            for (int i = 1; i <= len; i++) {
                mul = mul * rem;
            }

            arm = arm + mul;
            t2 = t2 / 10;
        }

        // Step 3: Check if Armstrong number
        if (arm == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

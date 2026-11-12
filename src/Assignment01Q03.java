public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 2;
        int prev1 = 1;
        int prev2 = 1;
        System.out.print("1 1 ");
        for (int i = 0; i < x - 2; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
            if(curr % 2 != 0){
                numOdd++;
            }
            System.out.print(curr);
            if (i < x - 3) 
                System.out.print(" ");
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}

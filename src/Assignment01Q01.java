public class Assignment01Q01 {
    public static void main(String[] args) {
        int i = 0;
        while (i < args.length){
            char letter = args[i].charAt(0);
            if (letter % 5 == 0){
                System.out.println(letter);
            }
            i++;
        }
    }
}

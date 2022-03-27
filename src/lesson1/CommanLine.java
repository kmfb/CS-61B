package lesson1;

public class CommanLine {
    public static void main(String[] args) {
        int len = args.length;
        int i = 0;
        int sum = 0;

        while (i < len) {
            sum = sum + Integer.parseInt(args[i]);
            i = i + 1;
        }

        System.out.println(sum);
    }
}

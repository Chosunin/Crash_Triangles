public class TriangleEx2 {
    public static void main(String[] args) {
        for (int s = 1; s <= 5; s++) {
            for (int space = 1; space <= 5 - s; space++) {
                System.out.print(" ");
            }
            for (int ss = 1; ss <= 2 * s - 1; ss++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


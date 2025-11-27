public class ForLongNhaubai5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i == 1 || i == 4) {
                for (int j = 1; j <= 4; j++) {
                    System.out.println("*" + "/t");
                }
            }
            if (i == 2 || i == 3) {
                for (int j = 1; j <= 4; j++) {
                    if (j == 1 || j == 4) {
                        System.out.print("*" + "\t");
                    } else {
                        System.out.print("*" + "/t");
                    }
                }
            }
        }
    }
}

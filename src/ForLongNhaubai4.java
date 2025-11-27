public class ForLongNhaubai4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 1 || j == 4 ) {
                    System.out.print("*" + "\t");
                }
                if (j==2 || j ==3){
                    if(i==1 || i ==4){
                        System.out.print("*" + "\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println("");
        }
    }
}

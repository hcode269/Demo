public class ForLongNhaubai10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            for (int j =1; j <=4; j++){
                if (i==4 || j==4 ||i==4-j+1|| (i==3&&j==3)){
                    System.out.print("*" + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
}

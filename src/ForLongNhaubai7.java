public class ForLongNhaubai7 {
    public static void main(String[] args) {
        for (int i = 1; i <=4; i++){
                for (int j =1; j<=4;j++){
                    if(i == 4|| i ==j|| j==1){
                        System.out.print("*" + "\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            System.out.println("");
        }
    }
}

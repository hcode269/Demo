public class TryCatch {
    public static void main(String[] args) {
        try {
            int  a =10;
            int b = a/0;
        } catch (ArithmeticException ex){
            System.out.println("Chuong trinh bi loi Arithmetic");
            ex.printStackTrace();
        } catch (Exception ex){
            System.out.println("chuong trinh bi loi");
            ex.printStackTrace();
        } finally {
            System.out.println("Du loi thi van chay duoc");
        }

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <=4 ; j++){
                if(i >= j){
                    System.out.print("*"+ "\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
}

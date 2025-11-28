import java.util.Scanner;

public class ViduFunction {
    public static double chonDau(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhâp số a = ");
        int a = sc.nextInt();
        System.out.print("Nhâp số b = ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Mời nhập vào phép tính (+, -, *,/): ");
        String dau = sc.nextLine();
        // bien luu gia trị
        double x = 0;
        switch (dau){
            case "+":
            {
                x=(double) a + b;
                break;
            }
            case "-":
            {
                x= (double) a-b;
                break;
            }
            case "*":
            {
                x= (double) a*b;
                break;
            }
            case "/":
            {
                x= (double) a/b;
                break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.print(chonDau());;
    }
}

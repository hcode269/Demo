import java.util.Scanner;

public class Vongwhilecach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n ngau nhien: ");
        int n = sc.nextInt();
        while (n < 0 || n > 99){
            System.out.println("Nhap lai n \n" +
                    "n phai nam trong khoang tu 1 den 99");
            n = sc.nextInt();
            break;
        }
        System.out.println("Ban da nhap so n thanh cong");

    }
}

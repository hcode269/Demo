import java.util.Scanner;

public class VongLapWhile {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n ngau nhien: ");
        int n = sc.nextInt();
        while (true){
            if(n> 0 && n <=99){
                System.out.println("Nhap n hop le");
                break;
            } else {
                System.out.println("Nhap lai n. \n" +
                        "n nam trong khoang tu 0 den 99");
            }
        }
    }
}

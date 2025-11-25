import java.util.Scanner;

public class Tinhgiaithua {
    public void tinhgiaithuabangfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int tich = 1;
        for (int i = 1; i <= n; i++ ){
            tich *= i;
        }
        System.out.println("Giai Thừa của "+n + "! là "+ tich);
    }

    public void tinhgiaithuabangwhile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n1: ");
        int m = sc.nextInt();
        int i = 1;
        int giaithua = 1;
        while (i<= m){
            giaithua *= i;
            i++;
        }
        System.out.println("Giai Thừa của "+m + "! là "+ giaithua);
    }
    public static void main(String[] args) {
        Tinhgiaithua tinh = new Tinhgiaithua();
        tinh.tinhgiaithuabangfor();
        tinh.tinhgiaithuabangwhile();
    }
}

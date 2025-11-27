import java.util.Scanner;

public class Tinhtongle {
    public void tinhtongle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i<=n; i+=2){
            if(i == 3){
                continue;
            }
            tong += i;
        }
        System.out.println("Tong so le tu 1 den "+n+ " là: "+tong);
    }

    public static void main(String[] args) {
        Tinhtongle tong = new Tinhtongle();
        tong.tinhtongle();
    }
}

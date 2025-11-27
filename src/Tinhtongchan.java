import java.util.Scanner;

public class Tinhtongchan {
    public void tinhtongchan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        if (n % 2 ==0){
            int tong =0;
            for (int i = 0; i<=n; i++){
                if(i % 2 == 0){
                    tong += i;
                }
            }
            System.out.println("Tong cua "+n+" la: " + tong);
        } else {
            System.out.println("Toi không tính tổng số lẻ , bye");
        }
    }

    public static void main(String[] args) {
        Tinhtongchan tong  = new Tinhtongchan();
        tong.tinhtongchan();
    }
}

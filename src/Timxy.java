import java.util.Scanner;

public class Timxy {
    int tong;
    int hieu;

    public Timxy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tong: ");
        tong = sc.nextInt();
        System.out.println("Nhap hieu: ");
        hieu = sc.nextInt();
        System.out.println("x la "+ ((double) tong + hieu)/2);
        System.out.println("y la "+ ((double) tong - hieu)/2);
    }

    public static void main(String[] args) {
        Timxy c = new Timxy();
//        System.out.println("tong" + tong);
//        System.out.println("hieu" + hieu);

    }
}

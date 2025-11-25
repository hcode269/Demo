import java.util.Scanner;

public class XepHangHocSinh {
    double dtb;

    public void Xephang(double dtb){
        this.dtb = dtb;
        String x = this.dtb >= 8 ? "Gioi" : (this.dtb >= 6.5)? "Kha" : (this.dtb >= 5)? "Trung Binh" : "Yeu";
        System.out.println("Xep hang hoc sinh la: "+ x);
    }
    public static void main(String[] args) {
        System.out.println("Nhap diem trung binh cua hoc sinh: ");
        double diemtb = new Scanner(System.in).nextDouble();
        while (true){
            if(diemtb >= 0 && diemtb <=10){
                break;
            } else {
                System.out.println("Nhap lai diem trung binh cua hoc sinh. Diem trung binh tu 0 den 10 ");
                diemtb = new Scanner(System.in).nextDouble();
            }
        }
        XepHangHocSinh xh = new XepHangHocSinh();
        xh.Xephang(diemtb);
    }
}
